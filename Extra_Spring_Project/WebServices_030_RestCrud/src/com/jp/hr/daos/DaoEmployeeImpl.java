package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.ConnectionFactory;
/*create table employee_details(empid number primary key,
fname varchar2(30),lname varchar2(30));

insert into employee_details values(101,'smita','kumar');
insert into employee_details values(102,'mona','gupta');
 * 
 */
public class DaoEmployeeImpl implements DaoEmployee {
	private ConnectionFactory factory;
	
	public DaoEmployeeImpl() 
			throws HrException {
		try {
			factory = new ConnectionFactory();
		} catch (Exception e) {
			throw new HrException("Problem in procuring connection.", e);
		}
	}
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		ArrayList<Employee> empList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect = factory.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT empid,fname,lname FROM employee_details");
			
			while(rs.next()){
				int empId = rs.getInt("empid");
				String firstNm = rs.getString("fname");
				String lastNm = rs.getString("lname");
				empList.add(new Employee(empId, firstNm, lastNm));
			}
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		String qry = "SELECT empid,fname,lname FROM employee_details WHERE empid = ?";
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			connect = factory.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, empId);
			
			rs = stmt.executeQuery();
			if(rs.next()){
				String firstNm = rs.getString("fname");
				String lastNm = rs.getString("lname");
				return new Employee(empId, firstNm, lastNm);
			} else {
				// Id is wrong.
				return null;
			}
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		String qry = "INSERT INTO  employee_details (empid,fname,lname) VALUES (?, ?, ?)";
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			connect = factory.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, emp.getEmpId());
			stmt.setString(2, emp.getFirstName());
			stmt.setString(3, emp.getLastName());
			
			int recInserted = stmt.executeUpdate();
			return recInserted==1? true : false;
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	protected void finalize() throws Throwable {
		factory.closeConnection();
		super.finalize();
	}
}

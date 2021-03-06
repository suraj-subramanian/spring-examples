package com.smita.spring_emp.dao;
import java.util.List;

import com.smita.spring_emp.entities.Employee;
import com.smita.spring_emp.exception.EmployeeException;
/** @author Smita **/
public interface IEmployeeDao {
	public Long addEmployee(Employee employee)throws EmployeeException;//C-create
	public List<Employee> getEmployeeList()throws EmployeeException;//R All Employee -retrieve
	public boolean updateEmployee(Employee employee)throws EmployeeException;//U-update
	public boolean deleteEmployeeById(Long empId)throws EmployeeException;//D-delete
	public Employee getEmployeeById(Long empId)throws EmployeeException;//S-search
}

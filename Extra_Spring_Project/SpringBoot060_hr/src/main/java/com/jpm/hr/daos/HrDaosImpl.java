package com.jpm.hr.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrExceptions;

@Repository("hrDao")
public class HrDaosImpl implements HrDaos {
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Employee getEmpDetails(int empNo) throws HrExceptions {
		//Employee emp = new Employee(1, "aaaa", 80000.0f);
		Employee emp = manager.find(Employee.class, empNo);
		return emp;
	}
}

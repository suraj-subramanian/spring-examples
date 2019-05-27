package com.jpm.hr.services;

import java.io.Serializable;

import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrExceptions;

public interface HrServices extends Serializable {
	public Employee getEmpDetails(int empNo) throws HrExceptions;
}

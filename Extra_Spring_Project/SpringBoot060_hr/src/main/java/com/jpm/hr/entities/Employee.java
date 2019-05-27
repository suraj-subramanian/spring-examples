package com.jpm.hr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int empNo;
	private String empNm;
	private Float empSal;
	
	public Employee(int empNo, String empNm, Float empSal) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
		this.empSal = empSal;
	}

	public Employee() {
		super();
	}

	
	@Id
	@Column(name="EMPNO")
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Column(name="ENAME")
	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	@Column(name="SAL")
	public Float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empNm=" + empNm + ", empSal=" + empSal + "]";
	}
}

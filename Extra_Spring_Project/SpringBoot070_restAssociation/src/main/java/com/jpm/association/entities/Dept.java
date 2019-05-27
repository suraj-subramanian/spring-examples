package com.jpm.association.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="deptNo")
public class Dept {
	private Integer deptNo;
	private String deptNm;
	
	public Dept(Integer deptNo, String deptNm) {
		super();
		this.deptNo = deptNo;
		this.deptNm = deptNm;
	}

	public Dept() {
		super();
	}

	// Association
	//@JsonManagedReference
	private List<Employee> empList;
	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptNm() {
		return deptNm;
	}

	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptNm=" + deptNm + ", empList=" + empList + "]";
	}
}

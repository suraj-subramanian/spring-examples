package com.jpm.association.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="empNo")
public class Employee {
	private Integer empNo;
	private String empNm;
	private float empSal;
	
	public Employee(Integer empNo, String empNm, float empSal) {
		super();
		this.empNo = empNo;
		this.empNm = empNm;
		this.empSal = empSal;
	}

	public Employee() {
		super();
	}

	private Profile profile;
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	@JsonBackReference
	private Dept dept;
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	// Association
	private List<Project> projectList;
	
	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empNm=" + empNm + ", empSal=" + empSal + ", profile=" + profile + "]";
	}

	
}

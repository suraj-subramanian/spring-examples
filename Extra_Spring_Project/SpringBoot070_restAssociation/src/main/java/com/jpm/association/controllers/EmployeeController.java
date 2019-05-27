package com.jpm.association.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.jpm.association.entities.Dept;
import com.jpm.association.entities.Employee;
import com.jpm.association.entities.Profile;
import com.jpm.association.entities.Project;

@RestController
@RequestMapping("/api/emps")
@CrossOrigin(origins="*",allowedHeaders="*")
public class EmployeeController {
	private List<Employee> empList;
	
	private Dept dept;
	private List<Project> projList;
	private Employee emp1;
	private Profile prof1;
	
	public void EmployeeController(){
		empList = new ArrayList<Employee>();
		
		// Emp-->Profile OneToOne
		emp1 = new Employee(100, "aaaa", 30000);
		Employee emp2 = new Employee(105, "bbbb", 30000);
		
		prof1 = new Profile("Mumbai", "1111111111");
		Profile prof2 = new Profile("Mumbai", "2222222222");
		prof1.setEmp(emp1);
		prof2.setEmp(emp2);
		
		emp1.setProfile(prof1);
		emp2.setProfile(prof2);
		
		empList.add(emp1);
		empList.add(emp2);
		
		// Dept-->Emp oneToMany
		dept = new Dept();
		dept.setDeptNo(100);
		dept.setDeptNm("Training");
		dept.setEmpList(empList);
		emp1.setDept(dept);
		emp2.setDept(dept);
		///*
		// Emp-->Project ManyToMany
		Project proj1 = new Project(1, "aaa");
		Project proj2 = new Project(2, "bbb");
		
		proj1.setEmpList(empList);
		proj2.setEmpList(empList);
		
		projList = new ArrayList<Project>();
		projList.add(proj1);
		projList.add(proj2);
		
		emp1.setProjectList(projList);
		emp2.setProjectList(projList);
		//*/
		
	}
	
	// http://localhost:8082/api/emps/listEmpProfile
	@GetMapping(value="/listEmpProfile",produces="application/json")
	public List<Employee> getEmpsAndProfile(){
			return empList;
	}
	
	// http://localhost:8082/api/emps/profile/1
	@GetMapping(value="/{id}",produces="application/json")
	public Employee find(@PathVariable("id") Integer id) {
		return empList.get(0);
	}
	
	// http://localhost:8082/api/emps/profile/1
	@GetMapping(value="/profile/{id}",produces="application/json")
	public Profile findProfile(@PathVariable("id") Integer id) {
		return prof1;
	}
	
	// http://localhost:8082/api/emps/deptDetails
	@GetMapping(value="/deptDetails",produces="application/json")
	public Dept getDeptDetails() {
		System.out.println("In dept details." + dept);
		Dept deptDummy = dept;
		dept = null;
		return deptDummy;
	}
	
	// http://localhost:8082/api/emps/projList
	@GetMapping(value="/projList",produces="application/json")
	public List<Project> getProjList() {
		return projList;
	}
	
	// http://localhost:8082/api/emps/submitDept
	@PostMapping(value="/submitDept")
	public String setDeptList(@RequestBody Dept dept) {
		System.out.println(dept);
		return "OK";
	}
}

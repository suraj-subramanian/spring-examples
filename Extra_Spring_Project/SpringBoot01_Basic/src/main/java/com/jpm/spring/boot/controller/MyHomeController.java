/**
 * 
 */
package com.jpm.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Smita B Kumar
 *@RequestMapping (@Path)
 *	-used at class level
 *	-method level
 *-spring 4.3 onward method level request mapping made more simpler
 *@GetMapping -Get method
 *@PostMapping -Post method
 *@PutMapping -Put method
 *@DeleteMapping -Delete method
 *@PatchMapping - ? //homework
 */
@RestController
public class MyHomeController {
//http://localhost:8080/	
	@ResponseBody
	@GetMapping("/")
	public String greetUser() {
		return "Hello From Spring Boot Rest";
	}
	

}





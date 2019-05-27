/**
 * 
 */
package com.jpm.spring.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Smita B Kumar
 *
 */
public class EmployeeClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("autowire.xml");
		Employee e1  = (Employee) context.getBean("employee1");
		Employee e2  = (Employee) context.getBean("employee1");
	//	Employee e3  = (Employee) context.getBean("employee2");
		System.out.println("e1.hashCode()..."+e1.hashCode());
		System.out.println("e2.hashCode()..."+e2.hashCode());
	//	System.out.println("e3.hashCode()..."+e3.hashCode());
		
		System.out.println(e1);
	}

}

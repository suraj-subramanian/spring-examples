/**
 * 
 */
package com.jpm.spring.hello;

import org.springframework.stereotype.Component;

/**
 * @author Smita B Kumar
 *
 */
@Component(value="hello")
public class HelloWorld implements IGreeting{
	
	public HelloWorld() {
		System.out.println("HelloWorld instantiated.....");
	}
	@Override
	public String greet() {
		return "Hello, from Spring!!";
	}

}

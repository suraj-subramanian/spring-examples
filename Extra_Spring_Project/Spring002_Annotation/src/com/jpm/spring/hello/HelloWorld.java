/**
 * 
 */
package com.jpm.spring.hello;

/**
 * @author Smita B Kumar
 *
 */
public class HelloWorld implements IGreeting{
	
	public HelloWorld() {
		System.out.println("HelloWorld instantiated.....");
	}
	@Override
	public String greet() {
		return "Hello, from Spring!!";
	}

}

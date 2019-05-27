/**
 * 
 */
package com.jpm.spring;

/**
 * @author Smita B Kumar
 *
 */
public class Greeting implements IGreetings {
	@Override
	public String greet(String name) {		
		return "Hello ,"+name;
	}

}

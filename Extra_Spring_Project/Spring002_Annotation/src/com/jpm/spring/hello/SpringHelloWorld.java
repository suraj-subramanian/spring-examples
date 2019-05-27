/**
 * 
 */
package com.jpm.spring.hello;

/**
 * @author Smita B Kumar
 *
 */
public class SpringHelloWorld implements IGreeting {
	public SpringHelloWorld() {
		System.out.println("SpringHelloWorld instantiated....!!!");
	}

	/* (non-Javadoc)
	 * @see com.jpm.spring.hello.IGreeting#greet()
	 */
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "SpringHelloWorld !! ";
	}

}

/**
 * 
 */
package com.jpm.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Smita B Kumar
 *
 */
//prep-work -> mark the class with @Configuration
@Configuration
public class SpringJavaConfig {
	
	@Bean(name="greeting")
	public IGreetings getGreeting() {
		return new Greeting();
	}

}

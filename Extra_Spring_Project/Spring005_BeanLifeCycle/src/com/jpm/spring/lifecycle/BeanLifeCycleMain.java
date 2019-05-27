package com.jpm.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

	public static void main(String[] args) {
		//create IOC container
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		HelpService h1=(HelpService) context.getBean("helpService");
		//context.registerShutdownHook();//gracefull shutdown of the container
		context.close();
	}
}

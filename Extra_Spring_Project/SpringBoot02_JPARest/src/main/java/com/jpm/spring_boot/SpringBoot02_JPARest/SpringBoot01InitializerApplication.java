package com.jpm.spring_boot.SpringBoot02_JPARest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jpm.spring_boot.controller.MyHomeController;

@SpringBootApplication
/*@ComponentScan(basePackages="com.jpm.spring_boot",
basePackageClasses= {MyHomeController.class})*/
public class SpringBoot01InitializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01InitializerApplication.class,
				args);
		}

}

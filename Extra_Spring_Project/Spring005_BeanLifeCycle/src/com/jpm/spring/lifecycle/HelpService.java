/**
 * 
 */
package com.jpm.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Smita B Kumar
 *
 */

public class HelpService implements BeanPostProcessor,BeanNameAware, BeanFactoryAware,
InitializingBean,DisposableBean{
	private int helpServiceId;	
	public HelpService() {
		System.out.println("1> Bean Intantiation.....");
	}
	public int getHelpServiceId() {
		return helpServiceId;
	}
	public void setHelpServiceId(int helpServiceId) {
		this.helpServiceId = helpServiceId;
		System.out.println("2> Property Initialization.....");
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("3> BeanNameAware... beanName : "+name);
		
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("4> BeanFactoryAware .... "+arg0);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6> Initializing Bean....afterPropertiesSet");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("8> DisposableBean....destroy");
	}
	@PostConstruct
	public void myInit() {
		System.out.println("7> custom method myInit....");
	}
	@PreDestroy
	public void myDestroy() {
		System.out.println("9> custom method mydestroy....");
	}
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("5> BeanPostPosscessor after initialization..."+arg1);
		return arg0;
	}
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("7> BeanPostPosscessor before initialization..."+arg1);
		return arg0;
	}

}









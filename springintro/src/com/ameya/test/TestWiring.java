package com.ameya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.facades.EmployeeFacade;

public class TestWiring {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("appcontext.xml");
		EmployeeFacade employeeFacade=(EmployeeFacade)ctx.getBean("employeeFacade");
		employeeFacade.facadeInvoked();
	}

}

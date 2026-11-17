package com.jsp.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.component.Employee;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);  
		Employee bean=context.getBean(Employee.class);
		System.out.println(bean);
		bean.disp();
	}

}

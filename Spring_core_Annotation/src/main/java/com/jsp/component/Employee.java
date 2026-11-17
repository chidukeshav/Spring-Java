package com.jsp.component;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	Employee(){
		System.out.println("Employee is created");
	}
	public void disp(){
		System.out.println("hiii");
	}

}

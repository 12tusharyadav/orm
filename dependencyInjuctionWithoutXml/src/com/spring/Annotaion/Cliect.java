package com.spring.Annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cliect {


	public static void main(String[] args) {
	
   
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		  Employee bean = context.getBean(Employee.class );
		bean.getList();
		bean.getaddress();
		
		
	}

}

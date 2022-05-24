package com.spring.Annotaion;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
	}
	
	@Bean("friends")
	public List<String> friends()
	{
		return Arrays.asList("john","rohan");
	}
	@Bean("address")
	public List<String> addresssss()
	{
		return Arrays.asList("daurala","meerut");
	}
	

}

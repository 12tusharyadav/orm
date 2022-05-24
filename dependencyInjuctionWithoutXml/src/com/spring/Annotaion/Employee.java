package com.spring.Annotaion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {

	@Autowired
	private List<String> friends;
	@Autowired
	private List<String> address;

	public void getList()
	{
		System.out.println(friends);
	}
	public void getaddress()
	{
		System.out.println(address);
	}

	

}

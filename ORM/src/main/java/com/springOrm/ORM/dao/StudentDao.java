package com.springOrm.ORM.dao;



import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springOrm.ORM.entities.Student;

public class StudentDao {

	
	private HibernateTemplate hibernateTemplate;
	//save
	public int insert(Student student)
	{
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	
}

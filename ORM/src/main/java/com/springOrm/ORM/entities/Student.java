package com.springOrm.ORM.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
  
	@Id
	private int id;
	private String name;
	private String city;
}

package com.smartcontact.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	private String name;
	private String password;
	@Column(length = 1000)
	private String about;
	private String imageUrl;
	private boolean enabled;
	private String role;
	@Column(unique = true)
	private String email;
	

}

package com.smartcontact.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class User {

	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	@NotBlank(message="name can not blank")
	@Size(min=6,max=15,message="user name must be 6 to 15 character")
	private String name;
	@Pattern(regexp ="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",message ="At least 8 chars, \r\n"
			+ "\r\n"
			+ "Contains at least one digit,\r\n"
			+ "\r\n"
			+ "Contains at least one lower alpha char and one upper alpha char,\r\n"
			+ "\r\n"
			+ "Contains at least one char within a set of special chars (@#%$^ etc.),\r\n"
			+ "\r\n"
			+ "Does not contain space, tab, etc.")
	private String password;
	@Column(length = 1000)
	private String about;
	private String imageUrl;
	private boolean enabled;
	private String role;
	@Column(unique = true)
	@Pattern(regexp ="^(.+)@(\\S+)$" , message = "Invalid Email:only Email valid demo(username@domain.com)")
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "user")
	private List<Contact> contacts = new ArrayList<>();
}

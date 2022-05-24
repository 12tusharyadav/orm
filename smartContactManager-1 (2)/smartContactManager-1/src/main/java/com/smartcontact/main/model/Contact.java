package com.smartcontact.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Contact {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer cid;
	private String name;
	private String nickname;
	@Column(length = 1200)
	private String description;

	private boolean enabled;
	private String work;
	@Column(unique = true)
	private String email;
	private Integer phoneno;
	@ManyToOne
	private User user;
	
	

}

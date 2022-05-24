package com.springboot.restApi.model;

public class JwtAuthRequest {

String username;
String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public JwtAuthRequest(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public JwtAuthRequest() {
	super();
	// TODO Auto-generated constructor stub
}



}

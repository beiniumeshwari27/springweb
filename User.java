package com.codegnan.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
@NotNull(message="name should not be null")
@Size(min=5,message="name should be atleast 5 characters")
private String name;
@NotNull(message="Email should not be null")
@Email(message="Invalid Email format")
private String email;
@NotNull(message="Password should not be null")
@Size(min=6,message="Password should be atleast 6 characters")
private String password;
@NotNull(message="Address should not be null")
@Size(min=5,message="Address should not be empty")
private String address;
@NotNull(message="Mobile should not be null")
@Pattern(regexp="^[6-9]\\d{9}$",
message="Mobile number must be 10 digits and start with 6-9")
private String mobile;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", password=" + password + ", address=" + address + ", mobile="
			+ mobile + "]";
}
public User(String name, String email, String password, String address, String mobile) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.address = address;
	this.mobile = mobile;
}

}
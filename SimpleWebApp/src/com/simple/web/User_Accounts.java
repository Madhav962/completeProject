package com.simple.web;

public class User_Accounts {
	public  static final String Gender_Male="Male";
	public static final String Gender_Female="Female";
	
	private String userName;
	private String password;
	private String gender;
	
	
 public User_Accounts()
{
	
}
 public String getUserName()
 {
	return userName; 
 }
 public void setUserName(String userName)
 {
	 this.userName=userName;
 }
 public String getGender()
 {
	return gender; 
 }
 public void setGender(String gender)
 {
	 this.gender=gender;
 }
 public String getPassword()
 {
	return password; 
 }
 public void setPassword(String password)
 {
	 this.password=password;
 }
 
 
}

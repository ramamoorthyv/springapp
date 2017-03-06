package com.lib;

public class User {
	private String name;
	private Integer age;
	private String sex;
	
	public void setName(String name){
		this.name = name;		
	}
	public void setAge(Integer age){
		this.age = age;		
	}
	public void setSex(String sex){
		this.sex = sex;		
	}
	
	public String getName(){
		return name;		
	}
	
	public Integer getAge(){
		return age;
	}
	
	public String getSex(){
		return sex;
	}
	

}

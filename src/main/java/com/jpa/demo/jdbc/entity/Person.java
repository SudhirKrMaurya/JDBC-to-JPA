
package com.jpa.demo.jdbc.entity;

import java.sql.Date;

public class Person {
	private int id;
	private String name;
	private String location;
	private Date birthDate;
	
	public Person()
	{
		
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	

}
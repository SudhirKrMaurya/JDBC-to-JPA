package com.jpa.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jpa.demo.jdbc.entity.Person;

@Repository
public class PersonJdbcDao {  
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Person> findAll() {
		return  jdbcTemplate.query("Select * from person", 
				new BeanPropertyRowMapper<Person>(Person.class));
		
	}

	
	

}

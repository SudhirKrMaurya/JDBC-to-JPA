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
	public Person findByID(int id) {
		return jdbcTemplate.queryForObject("SELECT * from person where id=?",new Object[] {id}, 
				new BeanPropertyRowMapper<Person>(Person.class));
		
	}
	public Person findByName(String name) {
		
		return jdbcTemplate.queryForObject("SELECT * from person where name=?",new Object[] {name},
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deleteById(int id) {
		return jdbcTemplate.update("Delete from person where id=?", new Object[] {id});
		
	}
	/*public int insert(Person person) {
		return jdbcTemplate.update("insert into person(name,location,birthdate) values(?,?,?)",new Object[]
				{ person.getName(),person.getLocation(),new Timestamp(person.getBirthDate().getTime())});
		
	}
	
	public int update(Person person) {
		return jdbcTemplate.update("update  person set name=?,location=?,birthdate=? where id=?",new Object[]
				{ person.getName(),person.getLocation(),new Timestamp(person.getBirthDate().getTime()),person.getId()});
		
	}*/
}

package com.jpa.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.demo.jdbc.entity.Person;
import com.jpa.demo.repo.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
 @Autowired 
 PersonJpaRepository repository;
 
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("person by id->{}",repository.findById(102));
		logger.info("update person data->>{}",repository.insert(new Person("sudhir maurya","noida")));
		logger.info("update person data->>{}",repository.update(new Person(102,"sudhir kr  maurya","gurugaon")));
		//repository.deleteById(109);
		logger.info("all person==->{}",repository.findAll());
		
}
}

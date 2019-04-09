package com.jpa.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.demo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
 @Autowired 
 PersonJdbcDao dao;
 
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("person info->{}",dao.findAll());
		
	}

}

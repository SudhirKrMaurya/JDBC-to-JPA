package com.jpa.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import com.jpa.demo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
 @Autowired 
 PersonJdbcDao dao;
 
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*logger.info("person info->{}",dao.findAll());
		logger.info("person by id->{}",dao.findByID(102));
		logger.info("person by name->>>{}",dao.findByName("ranjeet"));*/
		//logger.info("Delete by id->>{}",dao.deleteById(101));
		//logger.info("insert person data->>{}",dao.insert(new Person("sudhir","gurugaon",new Date())));
	
		//logger.info("update person data->>{}",dao.update(new Person("sudhir maurya","noida", new Date())));
}

}

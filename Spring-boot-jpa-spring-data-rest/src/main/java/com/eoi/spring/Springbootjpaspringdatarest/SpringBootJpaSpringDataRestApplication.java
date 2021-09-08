package com.eoi.spring.Springbootjpaspringdatarest;

import com.eoi.spring.Springbootjpaspringdatarest.modelo.StudentDataRestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaSpringDataRestApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentDataRestRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaSpringDataRestApplication.class, args);
	}

}

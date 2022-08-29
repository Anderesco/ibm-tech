package com.ibm.tech;

import com.ibm.tech.dao.PersonDao;
import com.ibm.tech.util.Utils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TechApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PersonDao personDao){
		return args -> {
			personDao.saveAll(Utils.getListPersons());
		};
	}
}

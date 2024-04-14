package com.SpringDataJPA.SpringDataJPA;

import com.SpringDataJPA.SpringDataJPA.Entity.Student;
import com.SpringDataJPA.SpringDataJPA.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaApplication.class, args);

	}

}

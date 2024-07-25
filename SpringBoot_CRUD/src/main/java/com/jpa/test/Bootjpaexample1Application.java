package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Repo.StudentRepository;
import com.jpa.test.entitites.User;

@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {
//		ApplicationContext conn=
		SpringApplication.run(Bootjpaexample1Application.class, args);
//		StudentRepository studentRepository = conn.getBean(StudentRepository.class);
//		
//		
//		
////		List<User> aList = studentRepository.findAll();
//		
//		
////		Optional<User> user=studentRepository.findById(101l);
////		System.out.println(user.get());
//		
////		Delete 
////		studentRepository.deleteById(11l);
//		List<User> list =studentRepository.findByName("Owais");
//		System.out.println(list);
	}

}

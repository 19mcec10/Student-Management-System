package com.example.smsMVCproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.smsMVCproject.entity.Student;
import com.example.smsMVCproject.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication  {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}


}

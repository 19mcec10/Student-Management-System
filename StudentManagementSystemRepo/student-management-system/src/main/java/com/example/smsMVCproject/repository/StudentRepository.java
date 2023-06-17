package com.example.smsMVCproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.smsMVCproject.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{
	
	
}

package com.example.smsMVCproject.service;

import java.util.List;

import com.example.smsMVCproject.entity.Student;

public interface StudentService {

	
	 List<Student> getAllStudents();
		
	Student saveStudent(Student student);
	Student getStudentID(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Student student);
}
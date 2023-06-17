package com.example.smsMVCproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.smsMVCproject.entity.Student;
import com.example.smsMVCproject.repository.StudentRepository;
import com.example.smsMVCproject.service.StudentService;

@Service
public class StudentServiceImppl implements StudentService {
	
	
	private StudentRepository studentRepository;
	
	

	public StudentServiceImppl(StudentRepository studentRepository) {
		
		this.studentRepository = studentRepository;
	}


    @Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentID(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudent(Student student) {
		
		studentRepository.delete(student);
	}



	


  

}

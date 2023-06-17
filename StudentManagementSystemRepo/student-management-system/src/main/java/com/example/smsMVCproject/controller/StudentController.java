package com.example.smsMVCproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.smsMVCproject.entity.Student;
import com.example.smsMVCproject.service.StudentService;



@Controller
public class StudentController   {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		
		this.studentService = studentService;
	}
	
	
	// handler method to handle list students and return model and view
	
	
	
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "createStudent";
	}
	
	
	@PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student ) {
    	studentService.saveStudent(student);
    	return "redirect:/students";
    }
	
	
	@GetMapping("/students/edit/{id}")
	public String editForm(@PathVariable Long id, Model model ) {
		model.addAttribute("student", studentService.getStudentID(id));
		return "edit_student";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		//get student from db with id
		Student existingStudent = studentService.getStudentID(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		
		studentService.updateStudent(existingStudent);
		
		return "redirect:/students";
		
	}
	
	
	
	@GetMapping("/students/delete/{id}")
	public String deleteForm(@PathVariable Long id ) {
		Student studentToDelete = studentService.getStudentID(id);
		studentService.deleteStudent(studentToDelete);
		return "redirect:/students";
	}
	
}

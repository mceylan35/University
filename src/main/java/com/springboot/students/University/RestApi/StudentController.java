package com.springboot.students.University.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.students.University.Business.IStudentService;
import com.springboot.students.University.Entities.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	private	IStudentService studentService;
	@Autowired
	public StudentController(IStudentService studentService) {
	
		this.studentService = studentService;
	}
	@GetMapping("students")
	public List<Student> get()
	{
		return studentService.getAll();
	}
	
}

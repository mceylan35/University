package com.springboot.students.University.RestApi;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.students.University.Business.IStudentService;
import com.springboot.students.University.Entities.Student;
import com.springboot.students.University.Entities.UniversityModel;

@RestController
@RequestMapping("/api")
public class StudentController {

	private	IStudentService studentService;
	@Autowired
	public StudentController(IStudentService studentService) {
	
		this.studentService = studentService;
	}
	@GetMapping("/students")
	public List<Student> get()
	{
		return studentService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Student student) {
		this.studentService.add(student);
	}
	
	@GetMapping("/students/{id}")
	public Student detay(@PathVariable int id) {
		return studentService.detay(id);
	}
	
	@GetMapping("/model")
	public UniversityModel model() {
		
		
	return null;
	}
	
}


package com.springboot.students.University.RestApi;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.students.University.Business.IStudentService;
import com.springboot.students.University.Entities.Student;
import com.springboot.students.University.Schemas.StudentErrorPost;
import com.springboot.students.University.Schemas.StudentNotFound;

@RestController
@RequestMapping("/api")
public class StudentController {

	private	IStudentService studentService;
	@Autowired
	public StudentController(IStudentService studentService) {
	
		this.studentService = studentService;
	}
	//öğrencileri listeler
	@GetMapping("/students")
	public ResponseEntity<List<Student>> get()
	{
		return ResponseEntity.ok(studentService.getAll());
		//liste boşsa notfound gönder
	}
	//öğrenci ekleme
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Student student) {
		
		//öğreci  üniversiteye başlangıç tarihi bugünden büyük olamaz.
		
		Date now = new Date();
		  
		Date date = student.getStarted_at();
		 
		if(now.getTime() > date.getTime()){
		 
	
		
		
		boolean ekle= this.studentService.add(student);
		if(ekle) {
			return ResponseEntity.ok(student);
		}
		else {
			  StudentErrorPost studentErrorPost = new StudentErrorPost("error","Öğrenci eklerken hata oluştu.");
	            return ResponseEntity.status(422).body(studentErrorPost);
		}
		
		}
		else {
			  StudentErrorPost studentErrorPost = new StudentErrorPost("error","Öğrenci eklerken hata oluştu.");
	            return ResponseEntity.status(422).body(studentErrorPost);
			
		}
		
		
		
	}
	//öğrenci detay
	@GetMapping("/students/{id}")
	public ResponseEntity<?> detay(@PathVariable int id) {
		if(studentService.detay(id)!=null)
		{
			return ResponseEntity.ok(studentService.detay(id));
		}
		else {
			StudentNotFound notFound = new StudentNotFound("error",id + " numaralı öğrenci kaydı bulunamadı.");
            return ResponseEntity.status(404).body(notFound);
		}
		
	}
	
	
}


































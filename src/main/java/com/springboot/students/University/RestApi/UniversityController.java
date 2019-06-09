package com.springboot.students.University.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.students.University.Business.IUniversityService;
import com.springboot.students.University.Entities.University;


@RestController
@RequestMapping("/api")
public class UniversityController {
	IUniversityService universityService;
	@Autowired
	public UniversityController(IUniversityService universityService) {
		
		this.universityService = universityService;
	}
	//üniversiteleri listeler
	@GetMapping("/universities")
	public ResponseEntity<List<University>> get()
	{
		return ResponseEntity.ok(universityService.getAll());
	}
	//üniversite detay
	@GetMapping("/universities/{id}")
	public ResponseEntity<University> detay(@PathVariable int id) {
		return ResponseEntity.ok(universityService.detay(id));
	}
	
	
	
}

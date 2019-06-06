package com.springboot.students.University.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/universities")
	public List<University> get()
	{
		return universityService.getAll();
	}

	@GetMapping("/universities/{id}")
	public University detay(@PathVariable int id) {
		return universityService.detay(id);
	}
	
	
	
}

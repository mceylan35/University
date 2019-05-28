package com.springboot.students.University.Business;

import java.util.List;

import com.springboot.students.University.Entities.University;

public interface IUniversityService {
	
	List<University> getAll();
	University detay (int id);

}

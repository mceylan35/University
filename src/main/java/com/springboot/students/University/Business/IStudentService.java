package com.springboot.students.University.Business;

import java.util.List;

import com.springboot.students.University.Entities.Student;

public interface IStudentService {
	
	List<Student> getAll();
	boolean add(Student student);	
	Student detay (int id);

}

package com.springboot.students.University.Business;

import java.util.List;

import com.springboot.students.University.Entities.Student;

public interface IStudentService {
	
	List<Student> getAll();
	void add(Student student);
	void update(Student student);
	void delete (int id);

}

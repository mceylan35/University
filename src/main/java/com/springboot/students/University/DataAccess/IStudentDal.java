package com.springboot.students.University.DataAccess;
import java.util.List;

import com.springboot.students.University.Entities.Student;
public interface IStudentDal {

	List<Student> getAll();
	void add(Student student);	
	Student detay (int id);
}

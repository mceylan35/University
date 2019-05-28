package com.springboot.students.University.DataAccess;
import java.util.List;

import com.springboot.students.University.Entities.Student;
public interface IStudentDal {

	List<Student> GetAll();
	void add(Student student);
	void update(Student student);
	void delete (int id);
}

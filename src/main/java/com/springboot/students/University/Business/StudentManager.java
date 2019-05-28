package com.springboot.students.University.Business;

import java.util.List;

import com.springboot.students.University.DataAccess.IStudentDal;
import com.springboot.students.University.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentManager implements IStudentService {

	private IStudentDal studentDal;
	
	@Autowired
	public StudentManager(IStudentDal studentDal) {
		
		this.studentDal = studentDal;
	}

	@Override
	@Transactional
	public List<Student> getAll() {
		
		return this.studentDal.getAll();
	}

	@Override
	@Transactional
	public void add(Student student) {
		
		this.studentDal.add(student);
	}

	

	@Override
	@Transactional
	public Student detay(int id) {
		
		return this.studentDal.detay(id);
	}

}

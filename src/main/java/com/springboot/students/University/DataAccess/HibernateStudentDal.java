package com.springboot.students.University.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.students.University.Entities.Student;
@Repository
public class HibernateStudentDal implements IStudentDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateStudentDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	
		List<Student> students = session.createQuery("from Student",Student.class).getResultList();
		return students;
	}

	@Override
	@Transactional
	public void add(Student student) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(student);
		
	}

	

	@Override
	@Transactional
	public Student detay(int id) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		Student student=session.get(Student.class, id);
		return student;
		
		
	}

}

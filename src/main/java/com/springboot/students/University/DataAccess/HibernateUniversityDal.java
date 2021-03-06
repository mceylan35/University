package com.springboot.students.University.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.hibernate.Session;

import com.mysql.cj.Query;
import com.springboot.students.University.Entities.University;
@Repository
public class HibernateUniversityDal implements IUniversityDal  {

	private EntityManager entityManager;
	
	
	@Autowired
	public HibernateUniversityDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}
	
	
	
	@Override
	@Transactional
	public List<University> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<University> universities=session.createQuery("from University",University.class).getResultList();                    
		return universities;
	}

	
	@Override
	@Transactional
	public University detay(int id) {

		Session session=entityManager.unwrap(Session.class);
		University university=session.get(University.class, id);
		return university;
	}



	

	
	


	@Override
	@Transactional
	public University universitegetir(int id) {
		
		
		Session session=entityManager.unwrap(Session.class);
		
	University university=session.get(University.class, id);
		//University university=session.createQuery("from University where api_id =: api_id", University.class)
			//	.setParameter("api_id", api_id).getSingleResult();
		
	
		return university;
	}



	@Override
	@Transactional
	public void add(University university) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(university);
		
	}

	
	

	
}

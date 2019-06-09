package com.springboot.students.University.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.students.University.DataAccess.IUniversityDal;
import org.springframework.stereotype.Service;
import com.springboot.students.University.Entities.University;

@Service
public class UniversityManager implements IUniversityService {

	IUniversityDal universityDal;
	
	@Autowired
	public UniversityManager(IUniversityDal universityDal) {

		this.universityDal = universityDal;
	}
	
	@Override
	@Transactional
	public List<University> getAll() {

		return universityDal.getAll();
	}

	@Override
	@Transactional
	public University detay(int id) {
		// TODO Auto-generated method stub
		return universityDal.detay(id);
	}

}

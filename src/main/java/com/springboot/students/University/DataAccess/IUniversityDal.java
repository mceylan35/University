package com.springboot.students.University.DataAccess;

import java.util.List;
import com.springboot.students.University.Entities.University;

public interface IUniversityDal {

	List<University> getAll();
	
	University detay (int id);
}

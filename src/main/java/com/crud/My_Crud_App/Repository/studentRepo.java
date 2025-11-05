package com.crud.My_Crud_App.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.My_Crud_App.Entity.Student;

@Repository
public interface studentRepo extends JpaRepository<Student,Integer>{
	
}

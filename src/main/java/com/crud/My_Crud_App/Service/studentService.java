package com.crud.My_Crud_App.Service;


import java.util.List;

import com.crud.My_Crud_App.Entity.Student;
import com.crud.My_Crud_App.Exception.StudentNotFoundException;

public interface studentService {

	// method to insert student record in student database
	Student insertRecord(Student student);

	// method to update the student data
	Student updateEmail(int id, Student student);

	// method to delete the student data
	String deleteRecord(int id);

	// method to find the Student detail by id
	Student findRecordById(int id) throws StudentNotFoundException; 

	// method to give all student details
	List<Student> findAllRecord();

}

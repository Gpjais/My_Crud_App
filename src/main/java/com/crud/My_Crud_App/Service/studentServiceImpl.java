package com.crud.My_Crud_App.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crud.My_Crud_App.Entity.Student;
import com.crud.My_Crud_App.Repository.studentRepo;

@Service
public class studentServiceImpl implements studentService {

	@Autowired
	studentRepo repo;

	ResponseEntity<Student> responseEntity;

	@Override
	public Student insertRecord(Student student) {
		
		return repo.save(student);
	}

	@Override
	public String deleteRecord(int id) {
		
		String str = "Record deleted";
		Optional<Student> s = repo.findById(id);
		if (s.get() != null) {
			repo.deleteById(id);
		}else{
			return "Student not found";
		}
		return str;
	}

	@Override
	public Student findRecordById(int id) {
		Optional<Student> s = repo.findById(id);
		return s.get();
	}

	@Override
	public List<Student> findAllRecord() {
		List<Student> studentList = repo.findAll();
		return studentList;
	}

	@Override
	public Student updateEmail(int id, Student student){
		// TODO Auto-generated method stub
		Student s =repo.findById(id).orElseGet(null);
		if(s !=null) {
			s.setEmail(student.getEmail());
		}else {
		   return null;
		}
		repo.save(s);
		return s;
	}

}

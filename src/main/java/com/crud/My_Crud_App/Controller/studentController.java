package com.crud.My_Crud_App.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.My_Crud_App.Entity.Student;
import com.crud.My_Crud_App.Service.studentService;

@RestController
@RequestMapping("/students")
public class studentController {

	@Autowired
	studentService stuService;

	// findByID
	@GetMapping("/info/{id}")
	public ResponseEntity<Student> findStudentById(@PathVariable int id) {
		Student s = stuService.findRecordById(id);
		return ResponseEntity.ok(s);
	}

	
	//Insert Record in MyCrudApp Database
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		try {
			Student saved = stuService.insertRecord(student);
			return ResponseEntity.status(HttpStatus.CREATED).body(saved);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(student);
		}
	}
	
	//find All Records Of the Students
	public ResponseEntity<List<Student>> findAllStudents(){
		List<Student> studentLists = stuService.findAllRecord();
		return ResponseEntity.ok(studentLists);
	}
	
	//delete record of Student
	@GetMapping("/delete{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id){
		     stuService.deleteRecord(id);
		     return ResponseEntity.ok("Student deleted successfully"+id);
	}
	
	//update Email of Student
	@PostMapping("/update{id}")
	public ResponseEntity<Student> updateEmail(@PathVariable int id, @RequestBody Student student){
		Student students = stuService.findRecordById(id);
		stuService.updateEmail(id,student);
		return ResponseEntity.ok(students);
		
	}
	
	

}

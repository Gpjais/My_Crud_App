package com.crud.My_Crud_App.Exception;

public class StudentNotFoundException extends RuntimeException {

	int sid;

	public StudentNotFoundException(int id) {
		this.sid = id;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String message = "Student with id : "+sid+ " is not present";
		return message;
	}

	public String toString() {
		return "StudentNotFoundException : " + getMessage();
	}

	
}

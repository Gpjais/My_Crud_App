package com.crud.My_Crud_App.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	
	@Column(name="name")
	String s_name;
	
	@Column(name="email")
	String email;
	
	@Column(name="mobile")
	Long mobile;
	
	@Column(name="amount")
	double amount;
	
}

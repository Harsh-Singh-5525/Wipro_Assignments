package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")


public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int E_id;
	private String E_name;
	
	
	public int getE_id() {
		return E_id;
	}


	public void setE_id(int e_id) {
		E_id = e_id;
	}


	public String getE_name() {
		return E_name;
	}


	public void setE_name(String e_name) {
		E_name = e_name;
	}


	public String getE_Department() {
		return E_Department;
	}


	public void setE_Department(String e_Department) {
		E_Department = e_Department;
	}


	private String E_Department;
	}
	


package com.pluralcamp.mvc.controller;

import com.pluralcamp.mvc.model.Employee;

//Controller
public interface Controller {
	void displayEnrolledEmployees();

	void addEmployee(Employee employee);

	void removeEmployee(String employeeId);
}

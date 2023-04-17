package com.pluralcamp.mvc.view;

import java.util.List;

import com.pluralcamp.mvc.model.Employee;

public interface View {
	void showEnrolledEmployees(List<Employee> enrolledEmployees);
}

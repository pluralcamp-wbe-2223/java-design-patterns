package com.pluralcamp.mvc.view;

import java.util.List;

import com.pluralcamp.mvc.model.Employee;

//ConsoleView class

public class ConsoleView implements View {
	@Override
	public void showEnrolledEmployees(List<Employee> enrolledEmployees) {
		System.out.println("\n ***This is a console view of currently enrolled employees.*** ");
		for (Employee employee : enrolledEmployees) {
			System.out.println(employee);
		}
		System.out.println("---------------------");
	}
}
package com.pluralcamp.mvc;

import com.pluralcamp.mvc.controller.Controller;
import com.pluralcamp.mvc.controller.EmployeeController;
import com.pluralcamp.mvc.model.Employee;
import com.pluralcamp.mvc.model.EmployeeModel;
import com.pluralcamp.mvc.model.Model;
import com.pluralcamp.mvc.view.ConsoleView;
import com.pluralcamp.mvc.view.MobileView;
import com.pluralcamp.mvc.view.View;

public class Main {
	public static void main(String[] args) {
		System.out.println("***MVC architecture Demo***\n");
		// Model
		Model model = new EmployeeModel();

		// View
		View view = new ConsoleView();

		// Controller
		Controller controller = new EmployeeController(model, view);
		controller.displayEnrolledEmployees();

		// Add an employee
		controller.addEmployee(new Employee("Kevin", "E4"));
		controller.displayEnrolledEmployees();

		// Remove an existing employee using the employee id.
		controller.removeEmployee("E2");
		controller.displayEnrolledEmployees();

		// Cannot remove an employee who does not belong to the list.
		controller.removeEmployee("E5");
		controller.displayEnrolledEmployees();

		// Avoiding duplicate entry
		controller.addEmployee(new Employee("Kevin", "E4"));

		// This segment is addeed to discuss a question in "Q&A Session"
		view = new MobileView();
		controller = new EmployeeController(model, view);
		controller.displayEnrolledEmployees();
	}
}

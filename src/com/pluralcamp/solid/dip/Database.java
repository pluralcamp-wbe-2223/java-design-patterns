package com.pluralcamp.solid.dip;

/*
 * Dependency Inversion Principle:
 * 
 * High level modules simply should NOT depend
 * on low-level modules in any way
 */
public interface Database {
	void saveEmpInDatabase(String empId);
}

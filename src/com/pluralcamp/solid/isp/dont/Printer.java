package com.pluralcamp.solid.isp.dont;

/*
 * Interface Segregation Principle:
 * classes should not depend on interface
 * methods they do not use.
 */
public interface Printer {

	void printDocument();

	void sendFax(); //Using any fax
	
	/*
	 * Adding this at a later time,
	 * when we have specific types of fax.
	 * Breaks OCP too.
	 */
	void sendFax(Fax faxType); 
	
}

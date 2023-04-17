package com.pluralcamp.solid.isp.dont;

public class EFax implements Fax {

	@Override
	public void faxType() {		
		System.out.println("Using internet fax (efax) to send the fax.");
	}

}

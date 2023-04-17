package com.pluralcamp.solid.isp.dont;

public class LanFax implements Fax {
	
	@Override
	public void faxType() {
		System.out.println("Using lan fax to send the fax.");
	}

}

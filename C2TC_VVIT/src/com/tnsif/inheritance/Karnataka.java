package com.tnsif.inheritance;

class India {
	protected String lang="Hindi";
	void displayNationalIndia() {
	System.out.println("National Lang "+lang);
	}
}
class Kerala extends India {
	public String lang="Malyalam";
	void displaylocalKerala() {
		System.out.println("Local Lang of kerala "+lang);
	}
}
public class Karnataka extends India{
	public String lang="Kannada";
	void displaylocalKarnataka() {
		System.out.println("Local Lang of karnataka "+lang);
	}

}

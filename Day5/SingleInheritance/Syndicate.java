package com.Day5.SingleInheritance;

public class Syndicate extends RBI {
	
	String locatiion;
	String Branch;
	
	public Syndicate() {
		
	}
	
	
	public Syndicate(String locatiion, String branch) {
		super();
		this.locatiion = locatiion;
		Branch = branch;
	}


	public String getLocatiion() {
		return locatiion;
	}


	public void setLocatiion(String locatiion) {
		this.locatiion = locatiion;
	}


	public String getBranch() {
		return Branch;
	}


	public void setBranch(String branch) {
		Branch = branch;
	}


	@Override
	public String toString() {
		return "Syndicate [locatiion=" + locatiion + ", Branch=" + Branch + ", bankno=" + bankno + ", IFSC_code="
				+ IFSC_code + ", city=" + city + ", getLocatiion()=" + getLocatiion() + ", getBranch()=" + getBranch()
				+ ", getBankno()=" + getBankno() + ", getIFSC_code()=" + getIFSC_code() + ", getCity()=" + getCity()
				+ "]";
	}



	
	
	
	
	
	
	
	
	

}

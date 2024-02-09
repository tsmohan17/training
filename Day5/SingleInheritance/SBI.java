package com.Day5.SingleInheritance;

public class SBI extends RBI {
	
	String Branch;
	String Location;
	
	public SBI() {
		
	}
	
	public SBI(String branch, String location) {
		super();
		this.Branch = branch;
		this.Location = location;
	}
	
	
	public String getBranch() {
		return Branch;
	}


	public void setBranch(String branch) {
		Branch = branch;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	@Override
	public String toString() {
		return "SBI [Branch=" + Branch + ", Location=" + Location + ", bankno=" + bankno + ", IFSC_code=" + IFSC_code
				+ ", city=" + city + ", getBranch()=" + getBranch() + ", getLocation()=" + getLocation()
				+ ", getBankno()=" + getBankno() + ", getIFSC_code()=" + getIFSC_code() + ", getCity()=" + getCity()
				+ "]";
	}

}

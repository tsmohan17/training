package com.Day5.SingleInheritance;

public class RBI {
	String bankno;
	String IFSC_code;
	String city;
	
	public RBI() {
		super();
	}


	public RBI(String bankno, String iFSC_code, String city) {
		super();
		this.bankno = bankno;
		this.IFSC_code = iFSC_code;
		this.city = city;
	}


	public String getBankno() {
		return bankno;
	}


	public void setBankno(String bankno) {
		this.bankno = bankno;
	}


	public String getIFSC_code() {
		return IFSC_code;
	}


	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "RBI [bankno=" + bankno + ", IFSC_code=" + IFSC_code + ", city=" + city + "]";
	}

}

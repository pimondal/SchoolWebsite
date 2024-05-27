package com.SchoolWebsite.Beans;

public class AdminBean {
	private String aname;
	private String apassword;
	
	
	
	public AdminBean() {
		super();
	}

	public AdminBean(String aname, String apassword) {
		super();
		this.aname = aname;
		this.apassword = apassword;
	}
	
	

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApassword() {
		return apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	
	

}

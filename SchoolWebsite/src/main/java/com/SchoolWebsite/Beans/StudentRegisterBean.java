package com.SchoolWebsite.Beans;

public class StudentRegisterBean {
	private String name;
	private String email;
	private String password;
	private String phone;
	private String cls;
	private String stream;
	
	public StudentRegisterBean() {
		super();
	}


	public StudentRegisterBean(String name, String email, String password, String phone, String cls, String stream) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.cls = cls;
		this.stream = stream;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getClas() {
		return cls;
	}
	public void setClas(String cls) {
		this.cls = cls;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

}

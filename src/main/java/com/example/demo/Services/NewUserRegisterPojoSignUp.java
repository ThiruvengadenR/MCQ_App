package com.example.demo.Services;

public class NewUserRegisterPojoSignUp {
	
	private Integer rollNo ;
	private String firstName ;
	private String lastName ;
	private String gender ;
	private String dateOfBirth ;
	private String email ;
	private String password ;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	
	public NewUserRegisterPojoSignUp()
	{
		
	}
	public NewUserRegisterPojoSignUp(Integer rollNo, String firstName, String lastName, String gender, String dateOfBirth,
			String email, String password) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "NewUserRegisterPojo [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", password=" + password
				+ "]";
	}

	
	
}

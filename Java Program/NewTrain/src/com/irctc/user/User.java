package com.irctc.user;

import java.time.LocalDateTime;

public class User {
	private int custId;
	private String firstName;
	private String lastName;
	private String address;
	private String mobile;
	private String eMail;
	private String gender;
	private String userName;
	private String password;
	private LocalDateTime registerDate;
//	// Assuming you have a ResultSet object named "resultSet" containing the query result
//	Timestamp timestamp = resultSet.getTimestamp("registerDate");
//	LocalDateTime localDateTime = timestamp.toLocalDateTime();
//
//	// You can now work with the LocalDateTime object as needed
//	System.out.println("Register date and time: " + localDateTime);

	public User() {
		
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "User [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", mobile=" + mobile + ", eMail=" + eMail + ", gender=" + gender + ", userName=" + userName
				+ ", password=" + password + ", registerDate=" + registerDate + "]";
	}
	public User(String firstName, String lastName, String address, String mobile, String eMail, String gender,
			String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.eMail = eMail;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}
	public User(int custId, String firstName, String lastName, String address, String mobile, String eMail,
			String gender, String userName, String password) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.eMail = eMail;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}
	
//	private String;
}

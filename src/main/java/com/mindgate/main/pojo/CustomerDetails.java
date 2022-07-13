package com.mindgate.main.pojo;

public class CustomerDetails {
	private String firstName;
	private String lastName;
	private UserLogin userLogin;
	private String address;
	private String city;
	private String sate;
	private int zipCode;
	private long mobile;
	private String email;
	private long customerId;
	private String status;

	public CustomerDetails() {

	}

	public CustomerDetails(String firstName, String lastName, UserLogin userLogin, String address, String city,
			String sate, int zipCode, long mobile, String email, long customerId, String status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userLogin = userLogin;
		this.address = address;
		this.city = city;
		this.sate = sate;
		this.zipCode = zipCode;
		this.mobile = mobile;
		this.email = email;
		this.customerId = customerId;
		this.status = status;
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

	public UserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSate() {
		return sate;
	}

	public void setSate(String sate) {
		this.sate = sate;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CustomerDetails [firstName=" + firstName + ", lastName=" + lastName + ", userLogin=" + userLogin
				+ ", address=" + address + ", city=" + city + ", sate=" + sate + ", zipCode=" + zipCode + ", mobile="
				+ mobile + ", email=" + email + ", customerId=" + customerId + ", status=" + status + "]";
	}

}

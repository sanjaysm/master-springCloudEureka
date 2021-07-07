package com.sanjay.feignClient.notificationService.entity;

public class EmailRequest {
	private String userName;
	private String userEmail;
	private String noficationType;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getNoficationType() {
		return noficationType;
	}
	public void setNoficationType(String noficationType) {
		this.noficationType = noficationType;
	}
	

}

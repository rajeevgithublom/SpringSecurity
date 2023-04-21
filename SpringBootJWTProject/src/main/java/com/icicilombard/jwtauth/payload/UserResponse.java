package com.icicilombard.jwtauth.payload;

import lombok.Data;

@Data
public class UserResponse {
	
	private String token;
	private String note;
	
	
	
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponse(String token, String note) {
		super();
		this.token = token;
		this.note = note;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
	
	
	

}

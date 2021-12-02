package com.example.hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long accountID;
	private String content;
	private String password;

	protected Account() {}
	
	public Account(String content) {
		//this.sid = sid;
		this.content = content;
	}
	  
	@Override
	public String toString() {
		return String.format(
	      "Account[accountID=%d, content='%s']",
	      accountID, content);
	}

	public Long getId() {
		return accountID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}

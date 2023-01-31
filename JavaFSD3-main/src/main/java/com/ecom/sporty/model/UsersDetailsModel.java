package com.ecom.sporty.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userstable")
public class UsersDetailsModel {

	@Id
	@GeneratedValue
	private int pid;
	private String username;
	private String password;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UsersDetailsModel [pid=" + pid + ", username=" + username + ", password=" + password + "]";
	}

}

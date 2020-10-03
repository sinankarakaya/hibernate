package com.sinan.orm.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guser")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3783560350493150415L;
	
	
	@Id
	private int userPK;
	private String userName;
	private String userSurname;
	public int getUserPK() {
		return userPK;
	}
	public void setUserPK(int userPK) {
		this.userPK = userPK;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	
	
	
	
}

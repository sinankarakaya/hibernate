package com.sinan.hibernate_embedded_embeddable.pojo;


import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userPK;
	private String userName;
	private String userSurname;
	@Embedded
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}

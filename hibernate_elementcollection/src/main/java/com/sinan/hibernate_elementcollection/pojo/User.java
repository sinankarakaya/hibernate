package com.sinan.hibernate_elementcollection.pojo;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
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
	@ElementCollection
	private Set<Address> address = new HashSet<>();
	
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
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
}

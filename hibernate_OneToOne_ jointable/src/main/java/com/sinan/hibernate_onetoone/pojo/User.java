package com.sinan.hibernate_onetoone.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "user_address", 
    joinColumns = 
      { @JoinColumn(name = "userFK", referencedColumnName = "userPK") },
    inverseJoinColumns = 
      { @JoinColumn(name = "addressFK", referencedColumnName = "addressPK") })
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

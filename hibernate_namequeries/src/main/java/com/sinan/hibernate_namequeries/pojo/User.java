package com.sinan.hibernate_namequeries.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "guser")
@NamedQueries({
	@NamedQuery(name="getAllUser", query = "from User"),
	@NamedQuery(name="user.username", query = "from User where userName = :username"),
	@NamedQuery(name="user.surname", query = "from User where userSurname = :usersurname")
})
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

package com.sinan.hibernate_onetomany.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1530874273449784001L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rolePK;
	private String role;
	
	@OneToMany
	@JoinTable(name="USER_ROLE", joinColumns = @JoinColumn(name="rolePK"), inverseJoinColumns = @JoinColumn(name="userPK"))
	private List<User> user;
	
	public int getRolePK() {
		return rolePK;
	}
	public void setRolePK(int rolePK) {
		this.rolePK = rolePK;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
	
}

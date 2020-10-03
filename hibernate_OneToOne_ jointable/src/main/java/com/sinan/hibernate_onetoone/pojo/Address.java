package com.sinan.hibernate_onetoone.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7238508929685822285L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressPK;
	private String province;
	private String district;
	private String neighborhood;
	@OneToOne(mappedBy = "address")
	private User user;
	
	public int getAddressPK() {
		return addressPK;
	}
	public void setAddressPK(int addressPK) {
		this.addressPK = addressPK;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	

	
	
}

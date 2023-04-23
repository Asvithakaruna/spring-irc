package com.example.day4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carmodel")
public class CarModel {
	@Id
	@Column(name="eid")
	private int eid;
	private String ename;
	private int emodel;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmodel() {
		return emodel;
	}
	public void setEmodel(int emodel) {
		this.emodel = emodel;
	}

}

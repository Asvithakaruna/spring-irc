package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Food")
public class Food {
     
	@Id
	@Column(name="Fno")
	private int Fno;
	private String Fname;
	private int Fprice;
	public int getFno() {
		return Fno;
	}
	public void setFno(int fno) {
		Fno = fno;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public int getFprice() {
		return Fprice;
	}
	public void setFprice(int fprice) {
		Fprice = fprice;
	}
	
	
}

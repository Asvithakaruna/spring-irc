package com.example.project1.JeeApplication;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Jeeapplication")
public class JeeModel {
   @Id
   @Column(name="canditateid")
   private int canditateid;
   private String canditatename;
   private String fathername;
   private String mothername;
   private String district;
   private String gender;
   private String country;
   private String state;
   private int userid;
   private String uname;
   private String password;
public int getCanditateid() {
	return canditateid;
}
public void setCanditateid(int canditateid) {
	this.canditateid = canditateid;
}
public String getCanditatename() {
	return canditatename;
}
public void setCanditatename(String canditatename) {
	this.canditatename = canditatename;
}
public String getFathername() {
	return fathername;
}
public void setFathername(String fathername) {
	this.fathername = fathername;
}
public String getMothername() {
	return mothername;
}
public void setMothername(String mothername) {
	this.mothername = mothername;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   

}

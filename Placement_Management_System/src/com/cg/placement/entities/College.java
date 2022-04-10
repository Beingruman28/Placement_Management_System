package com.cg.placement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//INSERT TABLE NAME THAT IS CREATED IN MYSQL(E.G_COLLEGE)
@Table(name="college")   
public class College 
{
	
@Id
@Column(name = "id")
private int id;
@OneToOne
@JoinColumn(name = "user_id ")
private User collegeAdmin;
private String collegeName;
private String location;



//CREATE GETTERS AND SETTERS FOR ALL ATTRIBUTES
public int getId() {                             
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public User getCollegeAdmin() {
	return collegeAdmin;
}
public void setCollegeAdmin(User collegeAdmin) {
	this.collegeAdmin = collegeAdmin;
}

}


package com.idbackend4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class idbackend4 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
String cname;
String ctc;
String email;
String name;
String stripend;

String cgpa;
String location;
String role;
String position;
String test;
String groupact;
String interview;
String suggestion;
String resources;

public idbackend4() {
	super();
	// TODO Auto-generated constructor stub
}



public idbackend4(int id, String cname, String ctc, String email, String name,String stripend,String cgpa, String location,
		String role, String position, String test, String groupact
		, String interview, String suggestion,
		String resources
		) {
	super();
	this.id = id;
	this.cname = cname;
	this.ctc = ctc;
	this.email = email;
	this.name = name;
	this.stripend=stripend;
	this.cgpa=cgpa;
	this.location=location;
	this.role=role;
	this.position=position;
	this.test=test;
	this.groupact=groupact;
	this.interview=interview;
	this.suggestion=suggestion;
	this.resources=resources;
}

public String getGroupact() {
	return groupact;
}

public void setGroup(String groupact) {
	this.groupact = groupact;
}

public String getInterview() {
	return interview;
}

public void setInterview(String interview) {
	this.interview = interview;
}

public String getSuggestion() {
	return suggestion;
}

public void setSuggestion(String suggestion) {
	this.suggestion = suggestion;
}

public String getResources() {
	return resources;
}

public void setResources(String resources) {
	this.resources = resources;
}

public String getCgpa() {
	return cgpa;
}

public void setCgpa(String cgpa) {
	this.cgpa = cgpa;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getTest() {
	return test;
}

public void setTest(String test) {
	this.test = test;
}

public String getStripend() {
	return stripend;
}

public void setStripend(String stripend) {
	this.stripend = stripend;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCtc() {
	return ctc;
}
public void setCtc(String ctc) {
	this.ctc = ctc;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}


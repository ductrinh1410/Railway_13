package com.vti.entity;
import java.time.LocalDate;

public class Account {
     short   id;
     String  email;
     String  username;
     String  fullname;
     Department department;
     Position position;
     LocalDate createDate;
     Group[] groups;

     
	// a:
	public Account() {
	}
	
	public Account(String username) {
		this.username = username;
		
	}

	// b:
	public Account(short id, String email, String username, String firstname, String lastname) {
		this.id = id;
		this.email=email;
		this.username=username;
		this.fullname=firstname  + lastname;
	}

	// c:
	public Account(short id, String email, String username, String firstname, String lastname, Position position) {
		this.id = id;
		this.email=email;
		this.username=username;
		this.fullname=firstname  + lastname;
		this.position=position;
		this.createDate=LocalDate.now();
	}

	// d:
	public Account(short id, String email, String username, String firstname, String lastname, Position position,
			LocalDate createDate) {
		this.id = id;
		this.email=email;
		this.username=username;
		this.fullname=firstname  + lastname;
		this.position=position;
		this.createDate=LocalDate.now();
	}

	

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

}


package com.vti.entity;

import java.time.LocalDate;
import java.util.Iterator;

public class Group {
	private byte id;
	private String name;
	private Account creator;
	private LocalDate createDate;
	private Account[] accounts;

	// a
	public Group() {

	}

	// b
	public Group( byte id ,String name, Account creator, Account[] accounts, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator ;
		this.accounts = accounts;
		this.createDate = LocalDate.now();

	}

	// c
	public Group(byte id ,String name, Account creator, String[] username, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator ;
		Account[]accounts = new Account[username.length];
		for(int i = 0 ; i < username.length ; i++) {
			accounts[i] = new Account(username[i]);
		}
		this.accounts = accounts;
		this.createDate = createDate;
		

	}

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

}

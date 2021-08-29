package com.vti.entity;

public class Canbo {
	private short id;
	private String name;
	private byte age;
	private Gender gender;
	private String address;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Canbo() {

	}

	public Canbo(short id, String name, byte age, Gender gender, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;

	}
	public String toString() {
		return "[id= " + id + " ,name= "+ name + "age= " + age + " ,gender= "+ gender +",address= "+ address +"]";
	}
}

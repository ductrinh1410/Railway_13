package com.vti.entity;

public class CongNhan extends Canbo {
	private byte bac;

	public byte getBac() {
		return bac;
	}

	public void setBac(byte bac) {
		this.bac = bac;
	}

	public CongNhan() {

	}

	public CongNhan(short id, String name, byte age, Gender gender, String address) {
		super(id, name, age, gender, address);
	}
	public String toString() {
		return "CongNhan [ "+ super.toString() + " [bac= "+ bac +"]";
		
	}
}

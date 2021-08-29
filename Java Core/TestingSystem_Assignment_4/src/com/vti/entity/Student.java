package com.vti.entity;

public class Student {
	private byte id;
	private String name;
	private String hometown;
	private double point;

	public Student(byte id, String name, String hometown) {
		this.id = id;
		this.name = name;
		this.hometown = hometown;
	}
	
	public void setPoint(double point) {
		this.point = point;
	}
	
	public void plusPoint(double point) {
       this.point = this.point + point;
	}
	
	public void printInformation() {
		System.out.println(this.name);
		
		if (this.point < 4.0 ) {
			System.out.println("học lực yếu");
		}
		else if (this.point < 6.0 ){
			System.out.println("học lực trung bình");
			
		}
		else if (this.point < 8.0) {
			System.out.println("học lực khá");
			
		}
		else if (this.point > 8.0) {
			System.out.println("học lực giỏi");
			
		}
		
	}

}
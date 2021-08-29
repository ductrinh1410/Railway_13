package com.vti.entity;

public class KySu extends Canbo{
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public KySu () {
		
	}
	
	public KySu (short id , String name ,byte age , Gender gender ,String address,String nganhDaoTao) {
		super(id, name, age, gender, address);
		this.nganhDaoTao = nganhDaoTao;
	}
	public String toString() {
		return "KySu [ "+ super.toString() + " [Nganh Dao Tao= "+ nganhDaoTao +"]";
		
	}
}

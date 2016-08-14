package com.spring;

public class Sim {

	private String sid;
	private float price;
	
	public Sim(){
		System.out.println("#(#*##*#*#*#sim is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("#(#*##*#*#*#sim is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("#(#*##*#*#*#sim is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("#(#*##*#*#*#sim is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sim [sid=" + sid + ", price=" + price + "]";
	}

}

package com.fruit.mvc.controller.form;

public class FruitForm {

	private int fid;
	private String name;
	private String email;
	private String mobile;
	private String taste;
	private float price;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FruitForm [fid=" + fid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", taste="
				+ taste + ", price=" + price + "]";
	}

}

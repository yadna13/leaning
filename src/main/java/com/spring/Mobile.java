package com.spring;

public class Mobile {

	private String name;
	private String color;
	private float price;
	private Sim sim;
	
	public Mobile(){
		System.out.println("#(#*##*#*#*#mobile is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("#(#*##*#*#*#mobile is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("#(#*##*#*#*#mobile is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("#(#*##*#*#*#mobile is created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void dance(){
		System.out.println("Mobile is dancing now!!!!!!!!!!!!!!!!!!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", price=" + price + ", sim=" + sim + "]";
	}

}

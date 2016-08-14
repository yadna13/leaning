package com.spring.anno;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/*
 * @Author
 * 
 */
@Service("Dog")
public class Dog {
	private String name;
	private String color;
	private float price;
	
	@PostConstruct
	public void init() {
		name="Jhon";
		color="white";
		price=12.0F;
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
		return "Dog [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}

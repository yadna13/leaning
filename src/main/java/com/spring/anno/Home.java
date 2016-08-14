package com.spring.anno;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//<bean id="Home" class="com.spring.anno.Home"/>
@Service("Home")
public class Home {

	private String name;
	private String address;
	
	//<property name="dog" ref="Dog"/>
	@Autowired
	@Qualifier("Dog")
	private Dog dog;
	
	@PostConstruct
	public void init() {
		name="Amana";
		address="H-154,Sec-23";
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Home [name=" + name + ", address=" + address + ", dog=" + dog + "]";
	}

}

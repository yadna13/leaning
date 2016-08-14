package com.spring;

public class  MobileMain {
	
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setColor("white");
		mobile.setName("Nokia");
		mobile.setPrice(22F);
		System.out.println(mobile);  //mobile.toString();
		mobile.dance();
	}

}

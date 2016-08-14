package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EagerMobileDemo {
	
	   public static void main(String[] args) {
			    ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("eager-mobile.xml");
			    System.out.println("()#(#((#(#(#WE ARE Not using bean!!!!!!!!!!!!!!!!");
	}

}

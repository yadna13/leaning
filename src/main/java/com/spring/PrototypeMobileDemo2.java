package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeMobileDemo2 {
	
	   public static void main(String[] args) {
			    ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("prototype-mobile.xml");
			   Mobile mobile= (Mobile)applicationContext.getBean("pmobile");
			   System.out.println(mobile);
			   mobile.dance();
			   System.out.println("__@@)Accesiing the SIM now");
			   
			   Mobile mobile1= (Mobile)applicationContext.getBean("pmobile");
			   Mobile mobile2= (Mobile)applicationContext.getBean("pmobile");
			   
			   System.out.println(mobile1.hashCode());
			   System.out.println(mobile2.hashCode());
			   
	}

}

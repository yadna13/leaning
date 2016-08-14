package com.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMobileMain {
	
	   public static void main(String[] args) {
			    ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("mobile.xml");
			   Mobile mobile= (Mobile)applicationContext.getBean("pmobile");
			   System.out.println(mobile);
			   mobile.dance();
			   System.out.println("__@@)Accesiing the SIM now");
			   Sim sim= (Sim)applicationContext.getBean("psim");
			   System.out.println(sim);
	}

}

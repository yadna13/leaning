package com.spring.anno;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeDogMain {
	
	   public static void main(String[] args) {
			    ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("home-dog.xml");
			    Home home= (Home)applicationContext.getBean("Home");
			   System.out.println(home);
			   System.out.println(home.getDog());
	}

}

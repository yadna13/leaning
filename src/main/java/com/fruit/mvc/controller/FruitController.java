package com.fruit.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fruit.mvc.controller.form.FruitForm;

@Controller
public class FruitController {
	
	private List<String> fruitList=new  ArrayList<>();
	
	
	@RequestMapping(value="/uploadFruit.do",method=RequestMethod.GET)
	public String fruitProfile(Model model){
		return "fruitProfile";  //  /checkFruit.jsp
	}
	
	@RequestMapping(value="/uploadFruit.do",method=RequestMethod.POST)
	public String fruitProfile(@ModelAttribute("fruit") FruitForm fruitForm, Model model){
		System.out.println(fruitForm);
		model.addAttribute("ApplicationMessage", "Hey your fruit is uploaded successfully into the database!");
		return "fruitProfile";  //  /checkFruit.jsp
	}
	
	public FruitController(){
		fruitList.add("mango");
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grapes");
		fruitList.add("guava");
		fruitList.add("papaya");
		fruitList.add("orage");
		fruitList.add("peers");
	}
 	
	@RequestMapping(value="/checkFruit.do",method=RequestMethod.GET)
	public String checkFruit(HttpServletRequest request,Model model){
		String fruitName=request.getParameter("fruitName");
		System.out.println("fruitName = "+fruitName);
		if(fruitList.contains(fruitName.toLowerCase())){
			model.addAttribute("ApplicationMessage", fruitName+" is a valid fruit!!!!!");
		}else {
			model.addAttribute("ApplicationMessage", fruitName+" is not a valid fruit!!!!!");
		}
		return "checkFruit";  //  /checkFruit.jsp
	}

}

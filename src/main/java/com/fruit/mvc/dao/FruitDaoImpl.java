package com.fruit.mvc.dao;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fruit.mvc.controller.form.FruitForm;

@Repository("FruitDaoImpl")
public class FruitDaoImpl {
	
	@Autowired
	@Qualifier("fruitJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public String addProfile(FruitForm fruitForm){
		String jdbc="insert into fruits_tbl(name,price,taste,email,mobile,doe) values(?,?,?,?,?,?)";
		jdbcTemplate.update(jdbc,new Object[]{fruitForm.getName(),fruitForm.getPrice(),fruitForm.getTaste(),fruitForm.getEmail(),fruitForm.getMobile(),new Timestamp(new Date().getTime())});
		return "success";
	}
	
}

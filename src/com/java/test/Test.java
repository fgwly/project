package com.java.test;

import java.util.Date;

import javax.annotation.Resource;

public class Test {
	
	@Resource(name="date")
	private Date date;
	
	@org.junit.Test
	public void say(){
		System.out.println(date);
	}
	
}

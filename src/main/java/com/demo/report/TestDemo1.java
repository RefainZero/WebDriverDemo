package com.demo.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo1{

	@Test(description="测试DEMO1")
	public void testDemo1(){
		Reporter.log("this is demo!");
		Assert.assertEquals("a", "b", "should be equals.");
	} 
}

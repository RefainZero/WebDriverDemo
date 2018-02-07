package com.demo.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//@Listeners({ZTestReport.class})
public class TestDemo2 {

	@Test(description="测试DEMO2",dataProvider="test")
	public void testDemo2(int a){
		Reporter.log("this is demo!");
		Assert.assertEquals(a, 1, "should be equals.");
	} 
	

	@DataProvider(name="test")
	public Object[][] dataProvider(){
		return new Object[][]{{1},{2}};
	}
	
}

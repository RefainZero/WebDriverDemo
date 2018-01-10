package com.demo.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/9.
 * TestNG注解使用介绍
 */
public class TestNGTest {

    @BeforeMethod
    //表示在测试方法执行之前执行
    public void setUp() {
        System.out.println("setUp method....");
    }

    @Test
    //表示该方法是一个测试方法，在运行时，会自动的运行有@Test的方法。
    public void test() {
        System.out.println("test...");
    }

    @AfterMethod
    //表示在测试方法执行之后执行
    public void tearDown() {
        System.out.println("tearDown method....");
    }
}

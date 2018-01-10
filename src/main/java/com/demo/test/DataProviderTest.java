package com.demo.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/9.
 *
 * @DataProvider参数化使用
 * @Test(dataProvider = "test")必须为参数化方法名
 * @DataProvider 注脚的方法名
 */
public class DataProviderTest {

    @Test(dataProvider = "test")
    public void test(int i, int j) {
        System.out.println(i + "\t" + j);
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    //  参数化部分
    @DataProvider
    public Object[][] test() {
        return new Object[][]{{1, 2}, {2, 4},
        };
    }
}

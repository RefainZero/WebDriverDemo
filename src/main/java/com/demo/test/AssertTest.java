package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/1/10.
 * Assert 一般断言使用介绍
 */
public class AssertTest {
    @Test
    public void test() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        Assert.assertNotEquals(demo1, demo2);
    }

    @Test
    public void test3() {
        Assert.assertFalse(1 == 2);
    }

    class Demo {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}

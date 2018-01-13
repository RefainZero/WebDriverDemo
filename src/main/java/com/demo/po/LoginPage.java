package com.demo.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2018/1/13.
 * 登录页面
 */
public class LoginPage {

    private WebDriver driver;
    private String url;
    private static final String userName = "loginform-username";
    private static final String passWord = "loginform-password";
    private static final String loginButton = "login-button";

    public LoginPage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
    }


    /**
     * 用户名输入
     */
    private void userName() {
        driver.get(url);
        //输入用户名
        driver.findElement(By.id(LoginPage.userName)).clear();
        driver.findElement(By.id(LoginPage.userName)).sendKeys("username");
    }

    /**
     * 密码输入
     */
    private void passWord() {
        //输入密码
        driver.findElement(By.id(LoginPage.passWord)).clear();
        driver.findElement(By.id(LoginPage.passWord)).sendKeys("password");
    }

    /**
     * 登录按钮
     */
    private void loginButton() {
        //登录按钮
        driver.findElement(By.name(LoginPage.loginButton)).click();
    }

    /**
     * 获取登录成功标题
     *
     * @return
     */
    public String getTitle() {
        String title = driver.getTitle();
        return title;
    }

    /**
     * 登录过程
     */
    public String login() {
        //输入用户名
        userName();
        //输入密码
        passWord();
        //点击登录
        loginButton();
        //获取页面标题
        String title = getTitle();
        return title;
    }
}

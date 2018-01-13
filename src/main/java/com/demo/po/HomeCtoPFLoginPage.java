package com.demo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/1/13.
 */
public class HomeCtoPFLoginPage {
    WebDriver driver;

    //把元素定义为对象
    @FindBy(id = "loginform-username")
    WebElement userName;
    @FindBy(id = "loginform-password")
    WebElement passWord;
    @FindBy(name = "login-button")
    WebElement loginButton;

    public HomeCtoPFLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * 输入用户名
     */
    public void inputUserName() {
        userName.clear();
        userName.sendKeys("username");
    }

    ;

    /**
     * 输入密码
     */
    public void inputPassWord() {
        passWord.clear();
        passWord.sendKeys("password");
    }

    ;

    /**
     * 点击登录
     */
    public void clickButton() {
        loginButton.click();
    }

    ;

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
     * 登录
     */
    public String login() {
        //输入用户名
        inputUserName();
        //输入密码
        inputPassWord();
        //点击登录
        clickButton();
        return getTitle();
    }

}

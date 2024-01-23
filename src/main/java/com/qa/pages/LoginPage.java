package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.base.Base.*;

public class LoginPage {

    @FindBy(name="email")
    WebElement email;
    @FindBy(name="password")
    WebElement password;
    @FindBy(xpath="//button[@data-cy='login']")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public String loginPageTitle(){
        return driver.getTitle();
    }
    public void setEmail(String mail){
        email.sendKeys(mail);
    }
    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }
    public CustomerPage clickLogin(){
        loginBtn.click();
        return new CustomerPage();
    }
}

package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    //Locator find element
    @FindBy(xpath = "//div[@class='container-login100']")
    private WebElement halamanLogin;

    @FindBy(xpath = "//*[@id='main-message']/h1/span")
    private WebElement halamanInvalidLogin;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement btnLogin;

    @FindBy(xpath = "//center[normalize-space()='Selamat datang, Feri Nugraha 1']")
    private WebElement TxtDashboard;

    @FindBy(xpath = "//b[normalize-space()='Username atau Password Salah!']")
    private WebElement TxtInvalid;


    public String halamanAwalLogin(){ return halamanLogin.getText();}

    public String halamanInvalidAwalLogin(){ return halamanInvalidLogin.getText();}

    public void formLogin(){
        username.sendKeys("feriansyah");
        password.sendKeys("a");
        btnLogin.click();
    }

    public void inputUsername(String username){
        this.username.sendKeys(username);
    }

    public void inputPassword (String password){
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getTxtDashboard(){
        return TxtDashboard.getText();
    }

    public String getTxtInvalid(){
        return TxtInvalid.getText();
    }

}

package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {
    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User di halaman login")
    public void User_di_halaman_login(){
        driver.get("https://staging.ptkta.com/xcashback_sociolla/login");
        extentTest.log(LogStatus.PASS,"User di halaman login");
    }

    @When("User memasukan username yang valid")
    public void User_memasukan_username_yang_valid(){
        loginPage.inputUsername("feriansyah");
        extentTest.log(LogStatus.PASS,"User memasukan username yang valid");
    }

    @And("User memasukan password yang valid")
    public void User_memasukan_password_yang_valid(){
        loginPage.inputPassword("a");
        extentTest.log(LogStatus.PASS,"User memasukan password yang valid");
    }

    @And("User klik tombol login")
    public void User_klik_tombol_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS,"User klik tombol login");
    }

    @Then("User berhasil login dan diarahkan ke dashbor")
    public void User_berhasil_login_dan_diarahkan_ke_halaman_dashbor(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Selamat datang, Feri Nugraha 1");
        extentTest.log(LogStatus.PASS,"User berhasil login dan diarahkan ke halaman utama");
    }

//--------------------negatif-username--------------------

    @When("User memasukan username yang invalid")
    public void User_memasukan_username_yang_invalid() {
        loginPage.inputUsername("feriansyah2");
        extentTest.log(LogStatus.PASS, "User memasukan username yang valid");
    }

    @Then("User tidak berhasil login dan diarahkan ke halaman login")
    public void User_tidak_berhasil_login_dan_diarahkan_ke_halaman_login(){
        Assert.assertEquals(loginPage.getTxtInvalid(),"Username atau Password Salah!");
        extentTest.log(LogStatus.PASS,"User tidak berhasil login dan diarahkan ke halaman login");
    }

//--------------------negatif-password--------------------
    @And("User memasukan password yang invalid")
    public void User_memasukan_password_yang_invalid(){
        loginPage.inputPassword("aa");
        extentTest.log(LogStatus.PASS,"User memasukan password yang valid");
    }



}

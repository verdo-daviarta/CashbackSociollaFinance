package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class UrlTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    public UrlTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Input URL Cashback Sociolla Tunjungan Surabaya yang valid")
    public void Input_URL_Cashback_Sociolla_Tunjungan_Surabaya_yang_valid(){
        driver.get("https://staging.ptkta.com/xcashback_sociolla/login");

    }

    @When("Klik tombol enter pada keyboard")
    public void Klik_tombol_enter_pada_keyboard(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);
    }

    @Then("Menampilkan halaman Login")
    public void Menampilkan_halaman_Login(){
        Assert.assertEquals(loginPage.halamanAwalLogin(),"SOCIOLLA TUNJUNGAN SURABAYA\n" +
                "LOGIN");
    }

//------------NEGATIF----------

    @Given("Input URL yang salah Cashback Sociolla Tunjungan Surabaya yang valid")
    public void Input_URL_yang_salah_Cashback_Sociolla_Tunjungan_Surabaya_yang_valid(){
        driver.get("https://staging.ptktat.com/xcashback_sociolla/login");
    }

    @Then("tidak Menampilkan halaman Login")
    public void tidak_Menampilkan_halaman_Login(){
        Assert.assertEquals(loginPage.halamanInvalidAwalLogin(),"This site can’t be reached");
    }


}

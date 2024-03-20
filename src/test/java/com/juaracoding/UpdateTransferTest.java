package com.juaracoding;

import com.juaracoding.pages.FinancePage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class UpdateTransferTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static FinancePage financePage = new FinancePage();

    public UpdateTransferTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User login")
    public void User_login(){
        driver.get("https://staging.ptkta.com/xcashback_sociolla/login");
        loginPage.formLogin();
        extentTest.log(LogStatus.PASS,"User login");
    }

    @When("User klik menu finance")
    public void User_klik_menu_finance(){
        financePage.clickFinanceMenu();
        extentTest.log(LogStatus.PASS,"User klik menu finance");
    }

    @And("User mencari data yang sudah di transfer")
    public void User_mencari_data_yang_sudah_di_transfer(){
        financePage.clickCloumnSearch();
        extentTest.log(LogStatus.PASS,"User mencari data yang sudah di transfer");
    }

    @And("User klik button cekbox")
    public void User_klik_button_cekbox(){
        financePage.clickCheckBox();
        extentTest.log(LogStatus.PASS,"User klik button cekbox");
    }

    @And("User klik button update sudah di transfer")
    public void User_klik_button_update_sudah_di_transfer(){
        financePage.clickBtnUpdate();
        extentTest.log(LogStatus.PASS,"User klik button update sudah di transfer");
    }






}

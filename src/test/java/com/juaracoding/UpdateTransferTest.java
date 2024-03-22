package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.FinancePage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User login");
    }

    @When("User klik menu finance")
    public void User_klik_menu_finance(){
        financePage.clickFinanceMenu();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User klik menu finance");
    }

    @And("User mencari data yang sudah di transfer")
    public void User_mencari_data_yang_sudah_di_transfer(){
        financePage.clickCloumnSearch();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User mencari data yang sudah di transfer");
    }

    @And("User klik button cekbox")
    public void User_klik_button_cekbox(){
        financePage.clickCheckBox();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User klik button cekbox");
    }

    @And("User klik button update sudah di transfer")
    public void User_klik_button_update_sudah_di_transfer(){
        financePage.clickBtnUpdate();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User klik button update sudah di transfer");
    }

    @And("User klik button save")
    public void User_klik_button_save(){
        financePage.clickBtnSave();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"User klik button save");
    }

    @Then("User berhasil update data yang sudah ditransfer")
    public void User_berhasil_update_data_yang_sudah_ditransfer() {
        Assert.assertEquals(financePage.getTxtValid(), "Sukses! Berhasil diupdate!");
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "User klik button save");
    }

//-----------Kembalikan ke verifikator Scene-------------

    @And("User klik button kembalikan ke verifikator")
    public void User_klik_button_kembalikan_ke_verifikator(){
        financePage.clickBtnUpdate();
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS,"User klik button kembalikan ke verifikator");
    }
    @Then("User berhasil mengembalikan data ke verifikator")
    public void User_berhasil_mengembalikan_data_ke_verifikator() {
        Assert.assertEquals(financePage.getTxtValid(), "Sukses! Berhasil diupdate!");
        DriverSingleton.delay(3);
        extentTest.log(LogStatus.PASS, "User klik button save");
    }


}

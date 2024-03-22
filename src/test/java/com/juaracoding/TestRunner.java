package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/003Finance.feature"},
        glue = "com.juaracoding",
        tags = "@positif-kembalikanKeVerifikator",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}

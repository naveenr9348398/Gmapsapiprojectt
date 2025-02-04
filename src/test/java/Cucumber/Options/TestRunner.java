package Cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\navee\\eclipse-workspace\\Newcucumberproject\\src\\test\\java\\Features",glue = "Stepdefinitions",tags = "@Regression",plugin = "json:target/jsonReports/cucumber-Reports.json")

public class TestRunner {

}

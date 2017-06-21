package com.sample.springboot.cucumber;

/**
 * Created by satish on 20/06/17.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", features = "src/test/resources/cucumber")
public class CucumberTest {

}

package com.hsbc.fluav;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"json:cucumber/cucumber.json", "html:cucumber/cucumber.html", "pretty"},
        features={"src/test/resources/feature/Demo.feature"},
        glue = "com.hsbc.fluav"
)
public class CucumberTest {
}

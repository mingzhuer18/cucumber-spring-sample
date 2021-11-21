package com.hsbc.fluav;//import com.paula.Variables;
import com.hsbc.fluav.ApplicationMain;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = ApplicationMain.class)
@CucumberContextConfiguration
public class DemoSteps {
    private String name;

    @Given("^I am (.*)")
    public void setName(String name){
        this.name=name;
        System.out.println(name);
    }

    @When("^print the name")
    public void PrintName(){
        System.out.println(String.format("this is print %s",this.name));
    }

    @When("^show the name (.*)")
    public void showName(String name){
        Assert.assertEquals(name, this.name);
    }
}

package com.demoblaze.qa.stepdefinitions;

import com.demoblaze.qa.models.PayOrderData;
import com.demoblaze.qa.taks.*;
import com.demoblaze.qa.userinterfaces.DemoBlazeRegisterPayOrder;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DemoBlazeStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrower;



    private Actor juan = Actor.named("Juan");
    private DemoBlazeRegisterPayOrder page;

    @Before
    public void setUp(){
        juan.can(BrowseTheWeb.with(hisBrower));
    }


    @Given("^I want to search an electronic component$")
    public void iWantToSearchAnElectronicComponent() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions

        juan.wasAbleTo(OpenBrowser.on());
        juan.wasAbleTo(GoTo.Categories());
        WebDriverWait wait = new WebDriverWait(hisBrower,30);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }


    @When("^I add an electronic component to cart$")
    public void iAddAnElectronicComponentToCart(List <PayOrderData> data) {
        // Write code here that turns the phrase above into concrete actions
        juan.attemptsTo(GoToCart.toPay());
        juan.attemptsTo(Register.payOrder(data));


    }

    @Then("^I should see my data on pay order$")
    public void iShouldSeeMyDataOnPayOrder() {
        // Write code here that turns the phrase above into concrete actions
        //juan.should(seeThat());

    }


}

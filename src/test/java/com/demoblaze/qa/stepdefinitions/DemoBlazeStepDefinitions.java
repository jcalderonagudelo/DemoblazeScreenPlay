package com.demoblaze.qa.stepdefinitions;

import com.demoblaze.qa.models.LogInData;
import com.demoblaze.qa.models.PayOrderData;
import com.demoblaze.qa.questions.IsCorrectComponent;
import com.demoblaze.qa.questions.Purchase;
import com.demoblaze.qa.taks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DemoBlazeStepDefinitions {

    @Managed(driver = "chrome")
    private  WebDriver hisBrowser;


    private final Actor juan = Actor.named("Juan");


    @Before
    public void setUp(){

        juan.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();


    }


    @Given("^I am on demoblaze website$")
    public void iAmOnDemoblazeWebsite() {
        // Write code here that turns the phrase above into concrete actions
        juan.wasAbleTo(OpenBrowser.on());
    }


    @When("^I login on page with the credentials$")
    public void iLoginOnPageWithTheCredentials( List<LogInData> logInData) {
        juan.attemptsTo(LogIn.onPage(logInData));

    }


    @Given("^I want to search an electronic component$")
    public void iWantToSearchAnElectronicComponent() {
        juan.wasAbleTo(GoTo.Categories());
        WebDriverWait wait = new WebDriverWait(hisBrowser,30);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }


    @When("^I add an electronic component to cart$")
    public void iAddAnElectronicComponentToCart(List <PayOrderData> data) {
        juan.attemptsTo(GoToCart.toPay());
        juan.should(seeThat(IsCorrectComponent.choosed()));
        juan.attemptsTo(Register.payOrder(data));
    }

    @Then("^I should see my data on pay order$")
    public void iShouldSeeMyDataOnPayOrder() {
        juan.should(seeThat(Purchase.isVisible()));

    }




}

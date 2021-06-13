package com.demoblaze.qa.stepdefinitions;

import com.demoblaze.qa.taks.GoTo;
import com.demoblaze.qa.taks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DemoBlazeStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrower;

    private Actor juan = Actor.named("Juan");

    @Before
    public void setUp(){
        juan.can(BrowseTheWeb.with(hisBrower));
    }


    @Given("^I want to search a electronic component$")
    public void i_want_to_search_a_electronic_component() {
        // Write code here that turns the phrase above into concrete actions

        juan.wasAbleTo(OpenBrowser.on());
        juan.wasAbleTo(GoTo.Categories());

    }


    @When("^I add a electronic component to cart$")
    public void i_add_a_electronic_component_to_cart() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see my data on pay order$")
    public void i_should_see_my_data_on_pay_order() {
        // Write code here that turns the phrase above into concrete actions

    }


}

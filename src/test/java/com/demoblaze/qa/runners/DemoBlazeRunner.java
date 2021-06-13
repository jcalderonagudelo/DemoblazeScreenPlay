package com.demoblaze.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demoblaze.feature",
        glue = "com.demoblaze.qa.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class DemoBlazeRunner {
}

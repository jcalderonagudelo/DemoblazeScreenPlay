package com.demoblaze.qa.taks;

import com.demoblaze.qa.userinterfaces.DemoBlazeCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.statematchers.IsPresentMatcher;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {


    public static GoTo Categories() {
        return instrumented(GoTo.class) ;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(Click.on(DemoBlazeCategories.CATEGORIES));
    actor.attemptsTo(Click.on(DemoBlazeCategories.CELLPHONE));
    actor.attemptsTo(Click.on(DemoBlazeCategories.ADDCART));
    }
}

package com.demoblaze.qa.taks;

import com.demoblaze.qa.userinterfaces.DemoBlazeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Task {

    public static OpenBrowser on() {
        return instrumented(OpenBrowser.class);
    }

    @Step("{0} opens the browser on Demo Blaze Home Page")
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(new DemoBlazeHomePage()));
    }
}

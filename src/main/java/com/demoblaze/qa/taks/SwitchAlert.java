package com.demoblaze.qa.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Switch;

public class SwitchAlert implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toAlert());
    }
    public static SwitchAlert offAlert(){
        return instrumented(SwitchAlert.class);
    }
}

package com.demoblaze.qa.taks;

import com.demoblaze.qa.userinterfaces.DemoBlazeCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

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

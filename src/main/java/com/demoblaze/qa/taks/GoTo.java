package com.demoblaze.qa.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {
    public static GoTo Categories() {
        return instrumented(GoTo.class) ;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}

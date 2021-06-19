package com.demoblaze.qa.taks;

import com.demoblaze.qa.questions.IsCorrectComponent;
import com.demoblaze.qa.userinterfaces.DemoBlazeCart;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCart implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DemoBlazeCart.CART));
        actor.should(seeThat(IsCorrectComponent.choosed()));
        actor.attemptsTo(Click.on(DemoBlazeCart.PLACEORDER));
    }
    public static GoToCart toPay(){
        return Tasks.instrumented(GoToCart.class);
    }
}

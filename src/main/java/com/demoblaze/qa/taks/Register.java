package com.demoblaze.qa.taks;

import com.demoblaze.qa.models.PayOrderData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.demoblaze.qa.userinterfaces.DemoBlazeRegisterPayOrder.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Register implements Task {

    List<PayOrderData> payOrderData;

    public Register(List<PayOrderData> payOrderData)
    {
        this.payOrderData = payOrderData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getName()).into(NAME));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getCountry()).into(COUNTRY));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getCity()).into(CITY));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getCreditCard()).into(CREDITCARD));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getMonth()).into(MONTH));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getYear()).into(YEAR));
        actor.attemptsTo(Click.on(BTNPURCHASE));
    }

    public static Register payOrder(List<PayOrderData> payOrderData )
    {
        return instrumented(Register.class, payOrderData);
    }
}

package com.demoblaze.qa.taks;

import com.demoblaze.qa.models.PayOrderData;
import com.demoblaze.qa.userinterfaces.DemoBlazeRegisterPayOrder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {
    private PayOrderData payOrderData;

    public Register(PayOrderData payOrderData){
        this.payOrderData = payOrderData;
    }

    public static Register payOrder(PayOrderData payOrderData) {
        return instrumented(Register.class, payOrderData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(payOrderData.getName()).into(DemoBlazeRegisterPayOrder.NAME));

    }

}

package com.demoblaze.qa.questions;

import com.demoblaze.qa.models.PayOrderData;
import com.demoblaze.qa.userinterfaces.DemoBlazePurchasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static com.demoblaze.qa.userinterfaces.DemoBlazeRegisterPayOrder.NAME;


public class Purchase implements Question<Boolean> {


  //  private final String message;

  //  public Purchase(String message) {this.message = message;}

    List<PayOrderData> payOrderData;

    public Purchase(List<PayOrderData> payOrderData)
    {
        this.payOrderData = payOrderData;

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getName()).into(NAME));


        return Text.of(DemoBlazePurchasePage.NAME).viewedBy(actor).asString().substring(61, 73)
                .equals(payOrderData.get(0).getName());
    }

    public static Purchase withTarget(List<PayOrderData> payOrderData){
        return new Purchase(payOrderData);
    }
}


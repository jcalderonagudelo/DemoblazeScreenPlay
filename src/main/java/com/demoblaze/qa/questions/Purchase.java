package com.demoblaze.qa.questions;


import static com.demoblaze.qa.userinterfaces.DemoBlazePurchasePage.NAME;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class Purchase implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        return the(NAME).answeredBy(actor).isCurrentlyVisible(); //Text.of(DemoBlazePurchasePage.NAME).viewedBy(actor).asString().substring(61, 73)
              //  .equals(payOrderData.get(0).getName());
    }

    public static Question<Boolean> isVisible() {
        return new Purchase();
    }
}


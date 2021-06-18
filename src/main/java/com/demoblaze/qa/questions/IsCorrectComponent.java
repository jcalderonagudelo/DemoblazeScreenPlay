package com.demoblaze.qa.questions;

import static com.demoblaze.qa.userinterfaces.DemoBlazeCart.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class IsCorrectComponent implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(TBODYID).answeredBy(actor).containsText("Iphone 6 32gb");
    }
    public static Question<Boolean> choosed(){
        return new IsCorrectComponent();
    }
}


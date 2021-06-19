package com.demoblaze.qa.questions;


import static com.demoblaze.qa.userinterfaces.DemoBlazeCategories.CATEGORIES;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class NotFindCategories implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(CATEGORIES).answeredBy(actor).isClickable();
    }

    public static Question<Boolean> button() {
        return new com.demoblaze.qa.questions.NotFindCategories();
    }

}

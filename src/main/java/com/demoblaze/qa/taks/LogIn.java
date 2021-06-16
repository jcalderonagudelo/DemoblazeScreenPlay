package com.demoblaze.qa.taks;

import com.demoblaze.qa.models.LogInData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.demoblaze.qa.userinterfaces.DemoBlazeLogIn.*;
import java.util.List;

public class LogIn implements Task {
    List<LogInData> logInData;

    public LogIn(List<LogInData> logInData){this.logInData = logInData; }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN));
        actor.attemptsTo(Enter.theValue(logInData.get(0).getUserName()).into(USERNAMELOGIN));
        actor.attemptsTo(Enter.theValue(logInData.get(0).getPassWord()).into(PASSLOGIN));
        actor.attemptsTo(Click.on(LOGINBUTTON));

    }
    public static LogIn onPage(List<LogInData> logInData) {
        return instrumented(LogIn.class, logInData);
    }

}

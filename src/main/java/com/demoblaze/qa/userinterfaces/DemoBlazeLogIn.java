package com.demoblaze.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeLogIn {

    public static final Target LOGIN = Target.the("Login Button")
            .located(By.id("login2"));
    public static final Target USERNAMELOGIN = Target.the("UserName to LogIn")
            .located(By.id("loginusername"));
    public static final Target PASSLOGIN = Target.the("Password to LogIn")
            .located(By.id("loginpassword"));
    public static final Target LOGINBUTTON = Target.the("Log In button")
            .located(By.xpath("//button[@onclick='logIn()']"));

}

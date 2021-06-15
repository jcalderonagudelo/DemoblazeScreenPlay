package com.demoblaze.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeRegisterPayOrder extends PageObject {

    public static Target NAME = Target.the("Name")
            .located(By.id("name"));
    public static Target COUNTRY = Target.the("Country")
            .located(By.id("country"));
    public static Target CITY = Target.the("City")
            .located(By.id("city"));
    public static Target CREDITCARD = Target.the("Credit Card")
            .located(By.id("card"));
    public static Target MONTH = Target.the("Month")
            .located(By.id("month"));
    public static Target YEAR = Target.the("Year")
            .located(By.id("year"));

    public static Target BTNPURCHASE = Target.the("BUTTON PURCHASE")
            .located(By.xpath("//button[@onclick='purchaseOrder()']"));

}

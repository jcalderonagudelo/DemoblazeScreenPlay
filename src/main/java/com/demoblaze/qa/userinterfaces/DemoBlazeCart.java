package com.demoblaze.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeCart {

    public static final Target CART = Target.the("Show Cart")
            .located(By.id("cartur"));   //xpath("//a[@id=\"cartur\"]"));
    public static final Target PLACEORDER = Target.the("Place Order")
            .located(By.xpath("//button[@class=\"btn btn-success\"]"));
}

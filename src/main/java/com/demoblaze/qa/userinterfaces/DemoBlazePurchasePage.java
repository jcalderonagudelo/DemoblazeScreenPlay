package com.demoblaze.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazePurchasePage {

    public static final Target NAME = Target.the("Name Purchaser")
            .located(By.xpath("//p[@class='lead text-muted ']"));
}

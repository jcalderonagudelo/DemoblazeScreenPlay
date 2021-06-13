package com.demoblaze.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeCategories {
    public static final Target CATEGORIES = Target.the("Categories Button")
            .located(By.xpath("//a[@onclick=\"byCat('phone')\"]"));
    public static final Target
}

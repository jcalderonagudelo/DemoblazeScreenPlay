package com.demoblaze.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class DemoBlazeCategories {
    public static final Target CATEGORIES = Target.the("Categories Button")
            .located(By.xpath("//a[@id='itemc'][1]"));
    public static final Target CELLPHONE = Target.the("Iphone 32gb")
            .located(By.xpath("//h4/a[@href='prod.html?idp_=5']"));
    public static final Target ADDCART = Target.the("Add to Cart")
            .located(By.xpath("//a[@class='btn btn-success btn-lg']"));


}

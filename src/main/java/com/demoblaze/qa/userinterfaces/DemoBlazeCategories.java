package com.demoblaze.qa.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;


public class DemoBlazeCategories {
    public static final Target CATEGORIES = Target.the("Categories Button")
            .located(By.xpath("//a[@onclick=\"byCat('phone')\"]"));
    public static final Target CELLPHONE = Target.the("Iphone 32gb")
            .located(By.xpath("//h4/a[@href=\"prod.html?idp_=5\"]"));
    public static final Target ADDCART = Target.the("Add to Cart")
            .located(By.xpath("//a[@class=\"btn btn-success btn-lg\"]"));
    public static final Target CART = Target.the("Show Cart")
            .located(By.id("cartur"));   //xpath("//a[@id=\"cartur\"]"));
    public static final Target PLACEORDER = Target.the("Place Order")
            .located(By.xpath("//button[@class=\"btn btn-success\"]"));
    //public static final Target ALERT = Target.the(" alert")
            //.getClass(Switch.toAlert());

}

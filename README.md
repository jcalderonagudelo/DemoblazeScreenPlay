# DemoblazeScreenPlay

Realiza la automatización en la pagina de E-Commerce
[Demo Blaze](https://www.demoblaze.com/) realizado con
[Gradle](https://gradle.org/), [Java](https://www.java.com/es/), [SerenityBDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html), [Cucumber](https://cucumber.io/) 
& Screenplay pattern.


## Estructura código fuente

La estructura del codigo fue realizada con Screenplay pattern de la siguiente forma:
<table>
<tr>
  <th>Tasks</th>
  <td>
    <h6>Contiene todas las tareas que se realizarán en la automatización</h6>
  </td>
</tr>
 
  <tr>
  <th>Models</th>
  <td>
    <h6>Contiene todos los modelos que se utilizaran para la construccion de la automatizacion</h6>
  </td>
</tr>
  <tr>
  <th>User Interfaces</th>
  <td>
    <h6>Contiene todos los elementos de la interface usuario mapeados en la pagina</h6>
  </td>
</tr>
  <tr>
  <th>Runners</th>
  <td>
    <h6>Contiene todos los ejecutores de las pruebas automatizadas</h6>
  </td>
</tr>
  <tr>
  <th>Steps Definitions</th>
  <td>
    <h6>Contiene todos los pasos de la ejecucion de cada prueba automatizada</h6>
  </td>
</tr>
  <tr>
  <th>Features</th>
  <td>
    <h6>Contiene todos los esenarios codificados en lenguaje Gherking</h6>
  </td>
</tr>
</table>



### Tasks

#### OpenBrowser

Realiza la apertura del explorador Google Chrome, esta tarea implementa 
la interfaz Task y sobreescribe su metodo. 
```java
    package com.demoblaze.qa.taks;

import com.demoblaze.qa.userinterfaces.DemoBlazeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Task {

    public static OpenBrowser on() {
        return instrumented(OpenBrowser.class);
    }

    @Step("{0} opens the browser on Demo Blaze Home Page")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new DemoBlazeHomePage()));
    }
}
```
#### LogIn

Realiza la tarea de iniciar sesión con un usuario y contraseña
creados previamente a la prueba, esta tarea implementa
la interfaz Task y sobreescribe su metodo, recibe parámetros de tipo String.


```java
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
```
#### GoTo
Realiza la tarea de escoger la categoría Phones en la página
principal, escoger un smartphone y añadirlo al carrito de compras,
esta tarea implementa la interfaz Task y sobreescribe
su metodo.



```java
package com.demoblaze.qa.taks;

import com.demoblaze.qa.exceptions.NotFindCategories;
import com.demoblaze.qa.userinterfaces.DemoBlazeCategories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    public static GoTo Categories() {
        return instrumented(GoTo.class) ;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(DemoBlazeCategories.CATEGORIES));
    actor.attemptsTo(Click.on(DemoBlazeCategories.CELLPHONE));
    actor.attemptsTo(Click.on(DemoBlazeCategories.ADDCART));

    }

    public String getNoFindCategoriesMessage(){
        return String.format(NotFindCategories.getNoFindCategoriesMessage());
    }
}

```
#### GoToCart

Realiza la tarea de dirigirse al carrito de compras para 
poder realizar el registro de pago, esta tarea implementa
la interfaz Task y sobreescribe su metodo.

```java
package com.demoblaze.qa.taks;

import com.demoblaze.qa.userinterfaces.DemoBlazeCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DemoBlazeCart.CART));
        actor.attemptsTo(Click.on(DemoBlazeCart.PLACEORDER));
    }
    public static GoToCart toPay(){
        return Tasks.instrumented(GoToCart.class);
    }
}

```

#### Register


Realiza la tarea de llenar los datos para el registro de 
la compra para posteriormente dar click sobre el boton de 
comprar, esta tarea implementa la interfaz Task 
y sobreescribe su metodo, recibe parámetros de tipo String.


```java
package com.demoblaze.qa.taks;

import com.demoblaze.qa.models.PayOrderData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.demoblaze.qa.userinterfaces.DemoBlazeRegisterPayOrder.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Register implements Task {

    List<PayOrderData> payOrderData;

    public Register(List<PayOrderData> payOrderData)
    {
        this.payOrderData = payOrderData;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getName()).into(NAME));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getCountry()).into(COUNTRY));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getCity()).into(CITY));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getCreditCard()).into(CREDITCARD));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getMonth()).into(MONTH));
        actor.attemptsTo(Enter.theValue(payOrderData.get(0).getYear()).into(YEAR));
        actor.attemptsTo(Click.on(BTNPURCHASE));

    }

    public static Register payOrder(List<PayOrderData> payOrderData )
    {
        return instrumented(Register.class, payOrderData);
    }
}

```

### Models

#### LogInData

Esta clase crea un objeto de tipo LogInData que contiene 
variables de tipo string, el constructor y los getter y setter
correspondiente a cada variable.

```java
package com.demoblaze.qa.models;


public class LogInData {

    private final String userName;
    private final String passWord;

    public LogInData(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }
    public String getUserName(){return userName;}

    public String getPassWord(){return passWord;}

}
```
#### PayOrderData
Esta clase crea un objeto de tipo PayOrderData que contiene
las variables de tipo string correspondientes para el respectivo 
registro, el constructor y los getter y setter
correspondiente a cada variable.

```java
package com.demoblaze.qa.models;

public class PayOrderData {

    private final String name;
    private final String country;
    private final String city;
    private final String creditCard;
    private final String month;
    private final String year;

    public PayOrderData(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public String getCountry() {return country; }

    public String getCity() {return city;}

    public String getCreditCard() {
        return creditCard;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {return year; }

}
```

### User Interface
Contiene todos los mapeos para los respectivos localizadores
ubicados en cada una de las páginas mostradas en el sitio web.

### Runners
#### DemoBlazeRunner
Ejecuta llama los pasos asignados en el feature 
`demoblaze.feature` y  busca 
los metodos correspondientes en el paquete de 
`stepDefinitions` para realizar la ejecucion. 
Esta clase corre mediante el `@RunWith` de la clase 
`CucumberWithSerenity.class` y mediante el 
`@CucumberOptions` llama al feature correspondiente, 
el paquete que contiene los `Steps Definitions` y 
el `CamelCase`.

```java
package com.demoblaze.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demoblaze.feature",
        glue = "com.demoblaze.qa.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class DemoBlazeRunner {
}
```


### Step Definitions
Los steps definitions contienen todos los métodos llamados mediante
el `Runner` al `Feature`. Los metodos ejecutan las `tasks` y `questions`
mediante un `actor`.
#### DemoBlazeStepDefinitions

Se ejecutan cada uno de los `Given` `When` `Then` establecidos en el feature.

```java
package com.demoblaze.qa.stepdefinitions;

import com.demoblaze.qa.models.LogInData;
import com.demoblaze.qa.models.PayOrderData;
import com.demoblaze.qa.questions.IsCorrectComponent;
import com.demoblaze.qa.questions.Purchase;
import com.demoblaze.qa.taks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.thucydides.core.annotations.Managed;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class DemoBlazeStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver hisBrowser;
    private final Actor juan = Actor.named("Juan");

    @Before
    public void setUp(){
        juan.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }

    @Given("^I am on demoblaze website$")
    public void iAmOnDemoblazeWebsite() {
        juan.wasAbleTo(OpenBrowser.on());
    }

    @When("^I login on page with the credentials$")
    public void iLoginOnPageWithTheCredentials( List<LogInData> logInData) {
        juan.attemptsTo(LogIn.onPage(logInData));
    }

    @Given("^I want to search an electronic component$")
    public void iWantToSearchAnElectronicComponent() {
        juan.wasAbleTo(GoTo.Categories());
        WebDriverWait wait = new WebDriverWait(hisBrowser,30);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    @When("^I add an electronic component to cart$")
    public void iAddAnElectronicComponentToCart(List <PayOrderData> data) {
        juan.attemptsTo(GoToCart.toPay());
        juan.should(seeThat(IsCorrectComponent.choosed()));
        juan.attemptsTo(Register.payOrder(data));
    }

    @Then("^I should see my data on pay order$")
    public void iShouldSeeMyDataOnPayOrder() {
        juan.should(seeThat(Purchase.isVisible()));
    }
}
```




### Features 
#### demoblaze.feature
Contiene los escenarios exitosos, alternos y los datos
a utilizar en cada escenario digitado en lenguaje Gherking. Es aquí donde
se declaran los `Given` `When` & `Then`.
```gherkin
#Author: jcalderonagudelo@gmail.com

Feature: Purchasing an electronic component
  I as demoblaze website user, i search an electronic component, i put on cart and make the pay process.

  Background:
    Given I am on demoblaze website
    When I login on page with the credentials
      | userName | passWord |
      | JuanMa   | Juan123@ |

  Scenario: Buy an electronic component on demoblaze website
    Given I want to search an electronic component
    When I add an electronic component to cart
      | name   | country  | city     | creditCard          | month   | year |
      | JuanMa | Colombia | Medellin | 1234 5678 9876 5432 | February | 2029 |
    Then I should see my data on pay order
```
 


## Ejecutar el proyecto 
Al momento de ejecutar el proyecto y obtener el reporte debemos 
ubicarnos en la carpeta del proyecto y abrir el `CMD` (en caso de tener Windows), 
y ejecutar el siguiente comando.

```yml
    gradle clean test aggregate
```

Al finalizar la ejecución debemos ingresar a la siguiente ruta y abrir el archivo `index.html`

```yml
  <projectName>\target\site\serenity\index.html
```

El reporte generado al momento de subir este repositorio se puede 
visualizar en html básico en el siguiente link [Reporte Serenity](https://htmlpreview.github.io/?https://github.com/jcalderonagudelo/DemoblazeScreenPlay/blob/master/target/site/serenity/index.html)


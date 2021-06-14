#Author: jcalderonagudelo@gmail.com

Feature: Purchasing an electronic component
  I as demoblaze website user, i search an electronic component, i put on cart and make the pay process.
    # HU1
    #Yo como usuario de la página demoblaze, realizó la búsqueda de un componente
    #electrónico, lo agrego al carrito y realizar el proceso del pago.
  Scenario Outline: Buy an electronic component on demoblaze website
    Given I want to search an electronic component
    When I add an electronic component to cart
      | <name> | <country> | <city> | <creditCard> | <month> | <year> |
    Then I should see my data on pay order
    Examples:
      | name   | country  | city     | creditCard          | month   | year |
      | Juanch | Colombia | Medellin | 1234 5678 9876 5432 | Febrero | 2029 |





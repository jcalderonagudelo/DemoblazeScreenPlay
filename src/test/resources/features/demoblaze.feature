
  Feature: Purchasing an electronic component
    I as demoblaze website user, i search an electronic component, i put on cart and make the pay process.
    # HU1
    #Yo como usuario de la página demoblaze, realizó la búsqueda de un componente
    #electrónico, lo agrego al carrito y realizar el proceso del pago.
    Scenario: Buy an electronic component on demoblaze website
      Given I want to search a electronic component
      When I add a electronic component to cart
      Then I should see my data on pay order





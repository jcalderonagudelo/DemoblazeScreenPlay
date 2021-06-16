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
      | name         |
      | Name: JuanMa |








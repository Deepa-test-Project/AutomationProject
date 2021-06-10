Feature: Test Online shopping functionality in AdvantageDemo Online Shopping App

  Scenario Outline: Check user registration with valid credentials
    Given AdvantageDemo Online Shopping App
    And User clicks on NewUser
    And User click on Create Account
    When User enters <username>, <password>, <email> and <confirmPWD>
    And User select I Agree option
    Then User click on Register button

    Examples: 
      | username | password | email              | confirmPWD |
      | Deepa    | Deepa123 | deepa.cn@gmail.com | Deepa123   |

  Scenario Outline: Verify user able to Search the products
    Given AdvantageDemo Online Shopping App
    And User clicks on NewUser
    And User enters login details <userN> and <passW>
    And User click on SIGN IN button
    When user click on seauch options
    Then User should be able search for <products>

    Examples: 
      | userN | passW    | products     |
      | Deepa | Deepa123 | HP ENVY X360 |


  Scenario Outline: Verify user able to add the products to CARD
    Given User is on list of products
    When User click on the product
    Then User should be able to add the products to CART


  Scenario: Verify user able to purcchase the selected products
    #Given AdvantageDemo Online Shopping App
    #And User clicks on NewUser
    #And User enters login details <userN> and <passW>
    #And User click on SIGN IN button
    And User is on CART
    And User click on CHECKOUT
    And User is able to ORDER PAYMENT screen
    When click on Next button
    And User will select payment option as SafePay
    And User click on Paynow button
    Then User should see ORDER PAYMENT screen
    And User should see "Thank you for buying with Advantage" message
    
    
  #Examples: 
      #| userN | passW    | products     |
      #| Deepa | Deepa123 | HP ENVY X360 |
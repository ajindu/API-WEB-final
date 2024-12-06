Feature: Web Automation Negative Test

  @web
  Scenario: Test login checkout product without fill any data
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome
    And user click laptops menu
    And user click product "MacBook air"
    And user click add to cart
    And user click cart icon
    And user click place order
    And user click purchase
    Then user will see message "Please fill out Name"

  @web
  Scenario: Test login checkout product only fill name and credit card
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome
    And user click monitors menu
    And user click product "ASUS"
    And user click add to cart
    And user click cart icon
    And user click place order
    And user input name "Bambang"
    And user input card "1111111"
    And user click purchase

  @web
  Scenario: Test login and checkout without any product in the cart
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome
    And user click monitors menu
    And user click product "ASUS"
    And user click add to cart
    And user click cart icon
    And user click delete
    And user click place order
    And user input name "Pak Vinsen"
    And user input card "54321"
    And user click purchase

  @web
  Scenario: Test checkout product without login
    Given open web page
    And user click monitors menu
    And user click product "ASUS"
    And user click add to cart
    And user click cart icon
    And user click delete
    And user click place order
    And user input name "Husen"
    And user input card "999999"
    And user click purchase

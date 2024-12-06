Feature: Web Automation Positive Test

  @web
    Scenario: Test login view product details
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome
    And user click phones menu
    And user click product "Iphone 6"

  @web
    Scenario: Test login add to cart
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome
    And user click laptops menu
    And user click product "MacBook air"
    And user click add to cart

  @web
  Scenario: Test login add to cart multiple product
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome
    And user click laptops menu
    And user click product "MacBook air"
    And user click add to cart
    And user click home
    And user click phones menu
    And user click product "Iphone"
    And user click add to cart
    And user click home
    And user click monitors menu
    And user click product "Apple monitor"
    And user click add to cart
    And user click cart icon

  @web
    Scenario: Test login remove from cart
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
    And user click delete

  @web
    Scenario: Test login checkout product
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
    And user input name "Yudhi"
    And user input country "Indonesia"
    And user input city "Jakarta"
    And user input card "12345"
    And user input month "03"
    And user input year "2025"
    And user click purchase

  @web
  Scenario: Test login checkout multiple product
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
    And user click home
    And user click phones menu
    And user click product "Iphone 6"
    And user click add to cart
    And user click cart icon
    And user click place order
    And user input name "Yudhi"
    And user input country "Indonesia"
    And user input city "Jakarta"
    And user input card "12345"
    And user input month "03"
    And user input year "2025"
    And user click purchase

  @web
    Scenario: Test login and log out
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome
    And user click log out
    Then user will see login icon
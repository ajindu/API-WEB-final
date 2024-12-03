Feature: Web Automation Test

  @web
  Scenario: Test create a new account
    Given open web page
    And user click icon sign up
    And user input sign up username "userNew123mm"
    And user input sign up password "secret"
    And user click sign up button
    Then user will see message "Sign up successful"

  @web
  Scenario: Test login user normal
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    Then user will see text welcome "Welcome user5758"

  @web
  Scenario: Test login with invalid username or password
    Given open web page
    And user click login icon
    And user input username "user5758910"
    And user input password "secret"
    And user click login button
    Then user will see message "User does not exist"

  @web
  Scenario: Test login view product details
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome "Welcome user5758"
    And user click menu "Phones"
    And user click product "Iphone 6"

  @web
  Scenario: Test login add to cart
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome "Welcome user5758"
    And user click menu "Laptops"
    And user click product "MacBook air"
    And user click add to cart

  @web
  Scenario: Test login remove from cart
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome "Welcome user5758"
    And user click menu "Laptops"
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
    And user will see text welcome "Welcome user5758"
    And user click menu "Laptops"
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
  Scenario: Test login checkout product without fill any data
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome "Welcome user5758"
    And user click menu "Laptops"
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
    And user will see text welcome "Welcome user5758"
    And user click menu "Monitors"
    And user click product "ASUS"
    And user click add to cart
    And user click cart icon
    And user click place order
    And user input name "Bambang"
    And user input card "1111111"
    And user click purchase

  @web
  Scenario: Test login and log out
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "secret"
    And user click login button
    And user will see text welcome "Welcome user5758"
    And user click log out
    Then user will see login icon

Feature: Web Automation Test Login and Sign Up

  @web
  Scenario: Test create a new account
    Given open web page
    And user click icon sign up
    And user input sign up username "userNew123YY"
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
    Then user will see text welcome

  @web
  Scenario: Test login with invalid username
    Given open web page
    And user click login icon
    And user input username "user5758910"
    And user input password "secret"
    And user click login button
    Then user will see message "User does not exist"

  @web
  Scenario: Test login with wrong password
    Given open web page
    And user click login icon
    And user input username "user5758"
    And user input password "zzz"
    And user click login button
    Then user will see message "Wrong password"

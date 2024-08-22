Feature: Login Page Feature
  I want to Login
  
  Background:
  Given user is on login page
  
  @test
  Scenario: Login Page Title
    When user gets the title of the page
    Then page title should be "Login - My Shop"
@test
Scenario: Login with correct credentials
    When user enters username "venkata.rajesh59@gmail.com"
    And user enters password "Rajesh@2084"
    And user clicks on login button
    Then user gets the title of the page
    And page title should be "My account - My Shop"

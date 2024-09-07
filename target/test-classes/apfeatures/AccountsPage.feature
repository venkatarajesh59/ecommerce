Feature: Accounts Page Feature
  I want to be in Accounts page

  Background: 
    Given user has already logged in to application
    |username|passwd|
    |venkata.rajesh59@gmail.com|Rajesh@2084|

  @test1
  Scenario: Accounts Page Title
    Given user is on accounts page
    When user gets the title of the page
    Then page title should be "My account - My Shop"

  @test1
  Scenario: Accounts section count
  Given user is on accounts page
  Then user gets accounts section
  |ADD MY FIRST ADDRESS|
  |ORDER HISTORY AND DETAILS|
  |MY CREDIT SLIPS|
  |MY ADDRESSES|
  |MY PERSONAL INFORMATION|
  |Home|
  And account could should be 6

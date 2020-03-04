@LoginPage
Feature: Login
  As a student of Test Pro
  I want to test the login page of a site using
  the websites credentials
  In order to test the login functionality

  Background: User navigate to the Login Page
    Given User open chrome and launch the application

  Scenario: Successful login
    When I  fill Username as "tomsmith" and Password as "SuperSecretPassword!"
    And I click on Login
    Then I should see "You logged into a secure area!"
    And quit the browser

  Scenario: Failed login using wrong credentials
    When I fill Username as "chrislim" and Password as "TestProRocks!2020"
    And I click on Login
    Then I should see "Your username is invalid!"
    And quit the browser






#@LoginPage
#Feature: Login
#  As a student of Test Pro
#  I want to test the login page of a site using
#  the websites credentials
#  In order to test the login functionality
#
#  Background: User navigate to the Login Page
#    Given User open chrome and launch the application
#
#  @Smoke
#  Scenario: Successful login
#    When I  fill Username as "tomsmith" and Password as "SuperSecretPassword!"
#    And I click on Login
#    Then I should see "You logged into a secure area!"
#    And quit the browser
#
#    @Regression
#  Scenario Outline: Failed login using wrong credentials
#    When I fill Username as "<username>" and Password as "<password>"
#    And I click on Login
#    Then I should see "<alert>"
#    And quit the browser
#
#      Examples:
#
#      | username        | password             | alert                     |
#      |                 |                      |                           |
#      | invalidUsername | invalidPassword      | Your username is invalid! |
#      | chrislim        | TestProRocks!2020    | Your username is invalid! |





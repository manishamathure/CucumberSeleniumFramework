Feature: RTW create new account Feature

Scenario Outline: RTW create new account Feature Test Scenario

Given open the site and launch the application 
Then user click on cookies navbar
Then user is on login page click on create new account link
Then please enter "<firstname>" and "<lastname>" and "<email>" and "<password>" and "<confirmpassword>"
Then select radio button option which describes you
Then click on create account button
Then close the browser

Examples:
| firstname | lastname | email | password | confirmpassword |
| TestAutomationn | TestAutomationn | ttestautomation@gmail.com | Test@12345 | Test@12345 | 
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Balram/eclipse-workspace/CucumberFrameworkForRTW/src/main/java/Features/accountcreation.feature");
formatter.feature({
  "line": 1,
  "name": "RTW create new account Feature",
  "description": "",
  "id": "rtw-create-new-account-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "RTW create new account Feature Test Scenario",
  "description": "",
  "id": "rtw-create-new-account-feature;rtw-create-new-account-feature-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "open the site and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on cookies navbar",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on login page click on create new account link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "please enter \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" and \"\u003cconfirmpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "select radio button option which describes you",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on create account button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "rtw-create-new-account-feature;rtw-create-new-account-feature-test-scenario;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password",
        "confirmpassword"
      ],
      "line": 14,
      "id": "rtw-create-new-account-feature;rtw-create-new-account-feature-test-scenario;;1"
    },
    {
      "cells": [
        "TestAutomationn",
        "TestAutomationn",
        "ttestautomation@gmail.com",
        "Test@12345",
        "Test@12345"
      ],
      "line": 15,
      "id": "rtw-create-new-account-feature;rtw-create-new-account-feature-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "RTW create new account Feature Test Scenario",
  "description": "",
  "id": "rtw-create-new-account-feature;rtw-create-new-account-feature-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "open the site and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on cookies navbar",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on login page click on create new account link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "please enter \"TestAutomationn\" and \"TestAutomationn\" and \"ttestautomation@gmail.com\" and \"Test@12345\" and \"Test@12345\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "select radio button option which describes you",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on create account button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "accountcreation.open_the_site_and_launch_the_application()"
});
formatter.result({
  "duration": 8089702700,
  "status": "passed"
});
formatter.match({
  "location": "accountcreation.user_click_on_cookies_navbar()"
});
formatter.result({
  "duration": 4493146900,
  "status": "passed"
});
formatter.match({
  "location": "accountcreation.user_is_on_login_page_click_on_create_new_account_link()"
});
formatter.result({
  "duration": 103442800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAutomationn",
      "offset": 14
    },
    {
      "val": "TestAutomationn",
      "offset": 36
    },
    {
      "val": "ttestautomation@gmail.com",
      "offset": 58
    },
    {
      "val": "Test@12345",
      "offset": 90
    },
    {
      "val": "Test@12345",
      "offset": 107
    }
  ],
  "location": "accountcreation.please_enter_first_name_and_last_name_and_email_and_password_and_confirm_password(String,String,String,String,String)"
});
formatter.result({
  "duration": 801765600,
  "status": "passed"
});
formatter.match({
  "location": "accountcreation.select_radio_button_option_which_describes_you()"
});
formatter.result({
  "duration": 81684600,
  "status": "passed"
});
formatter.match({
  "location": "accountcreation.click_on_create_account_button()"
});
formatter.result({
  "duration": 82843100,
  "status": "passed"
});
formatter.match({
  "location": "accountcreation.close_the_browser()"
});
formatter.result({
  "duration": 4452709000,
  "status": "passed"
});
});
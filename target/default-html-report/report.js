$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/employeeMembership.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As an admin user should be able to add memberships to any employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userStory12"
    }
  ]
});
formatter.step({
  "name": "user should be able to login with valid admin credentials",
  "keyword": "Given "
});
formatter.step({
  "name": "clicks on PIM and searches employee by \"14327\" and clicks from dataTable",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Memberships link and clicks on AddMembershipDetailBtn",
  "keyword": "And "
});
formatter.step({
  "name": "user fills \"\u003cMembership\u003e\",\"\u003cSubscriptionPaidBy\u003e\",\"\u003cSubscriptionAmount\u003e\",\"\u003cCurrency\u003e\",\"\u003cSubscriptionCommenceDate\u003e\",\"\u003cSubscriptionRenewalDate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "name": "I verify the Assigned Membership \"RedTeam\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Membership",
        "SubscriptionPaidBy",
        "SubscriptionAmount",
        "Currency",
        "SubscriptionCommenceDate",
        "SubscriptionRenewalDate"
      ]
    },
    {
      "cells": [
        "RedTeam",
        "Company",
        "100",
        "United States Dollar",
        "2020-Jun-22",
        "2023-Jun-19"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As an admin user should be able to add memberships to any employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userStory12"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddMembership.user_should_be_able_to_login_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on PIM and searches employee by \"14327\" and clicks from dataTable",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.employeeMembership.clicks_on_PIM_and_searches_employee_by_and_clicks_from_dataTable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Memberships link and clicks on AddMembershipDetailBtn",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.employeeMembership.user_clicks_on_Memberships_link_and_clicks_on_AddMembershipDetailBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills \"RedTeam\",\"Company\",\"100\",\"United States Dollar\",\"2020-Jun-22\",\"2023-Jun-19\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.employeeMembership.user_fills(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.employeeMembership.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the Assigned Membership \"RedTeam\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.employeeMembership.i_verify_the_Assigned_Membership(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
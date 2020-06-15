$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addMembership.feature");
formatter.feature({
  "name": "Add membership",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As an admin user should be able to add different memberships under qualifications",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addMembership"
    },
    {
      "name": "@UserStrory_11"
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
  "name": "user clicks on \"Admin\" tab on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddMembership.user_clicks_on_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Qualifications and \"Membership\" dropdown and clicks on addBtn",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddMembership.user_clicks_on_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters different Membership and clicks on saveBtn and Validate membership in dataTable",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddMembership.user_chooses_different(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validates \"NOVA SoftwareQAs\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddMembership.validates_is_added_successfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/paybills.feature");
formatter.feature({
  "name": "Pay Bills page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"pay_bills\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryPageDefinitions.navigate_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Warning message should display when user tries to complete the payment without entering amount",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user tries to complete payment without inserting amount",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsDefinitions.user_tries_to_complete_payment_without_inserting_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "warning message \"Please fill in this field.\" message is popped up for \"amount\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsDefinitions.warning_message_message_is_popped_up_for(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"pay_bills\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryPageDefinitions.navigate_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Warning message should display when user tries to complete the payment without entering  date",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user tries to complete payment without inserting date",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsDefinitions.user_tries_to_complete_payment_without_inserting_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "warning message \"Please fill in this field.\" message is popped up for \"date\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.PayBillsDefinitions.warning_message_message_is_popped_up_for(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
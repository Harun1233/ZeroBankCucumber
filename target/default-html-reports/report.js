$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/accountsummary.feature");
formatter.feature({
  "name": "Account summary page",
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
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginDefinitions.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account summary page title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "navigate to Account summary page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryPageDefinitions.navigate_to_Account_summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the page title is \"Zero – Account summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryPageDefinitions.verify_that_the_page_title_is(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Verify the title\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat com.zerobank.stepdefinitions.AccountSummaryPageDefinitions.verify_that_the_page_title_is(AccountSummaryPageDefinitions.java:22)\r\n\tat ✽.verify that the page title is \"Zero – Account summary\"(file:///C:/Users/Home/IdeaProjects/ZeroBankCucumber/src/test/resources/features/accountsummary.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});
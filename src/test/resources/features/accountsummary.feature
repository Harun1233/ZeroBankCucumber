@wip
Feature: Account summary page

  Background:
    Given user is on the login page
    Then user enters valid credentials
    Then navigate to "account_summary" page


  Scenario: Account summary page title verification

    Then verify that the page title is "Zero – Account summary"

  Scenario:  Account summary pages should have the given account type


    Then verify that following given account types are displayed on the page

      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |


  Scenario: Credit Accounts under Account summary page should have given account types

    Then verify that following given account types are displayed under Credit Accounts column
      | Account     |
      | Credit Card |
      | Balance     |
@wip
Feature: Account summary page

  Background:
    Given user is on the login page
    Then user enters valid credentials

  Scenario: Account summary page title verification
    Given navigate to Account summary page
    Then verify that the page title is "Zero - Account summary."

  Scenario Outline: Account summary pages should have the given account type

    Given navigate to Account summary page
    Then verify that following <accountTypes> are displayed
    Then verify that following <columnNames> are displayed under Credit Accounts

    Examples:
      | accountTypes        | columnNames |
      | Cash Accounts       | Account     |
      | Investment Accounts | Credit Card |
      | Credit Accounts     | Balance     |
      | Loan Accounts       |             |
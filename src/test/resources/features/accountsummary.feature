Feature: Account summary page

  Background:
    Given user is on the login page
    Then user enters valid credentials


  Scenario: Account summary page title verification
    Given navigate to Account summary page
    Then verify that the page title is "Zero – Account summary"
  @wip
  Scenario:  Account summary pages should have the given account type

    Given navigate to Account summary page
    Then verify that following given account types are displayed on the page

      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Credit Accounts under Account summary page should have given account types
    Given navigate to Account summary page
    Then verify that following given account types are displayed under Credit Accounts column
      | Account     |
      | Credit Card |
      | Balance     |
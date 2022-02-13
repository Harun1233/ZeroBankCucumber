@wip
Feature: Account Activity page

  Background:
    Given user is on the login page
    Then user enters valid credentials


  Scenario: Title,dropdown and transaction table verification
    Given navigate to "account_activity" page
    And verify that the page title is "Zero - Account Activity"
    And account dropdown should have "Savings" as a default option
    And account dropdown should have given options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then transaction table should have the given options as column name
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |

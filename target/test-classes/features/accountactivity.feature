@wip
Feature: Account Activity page

  Background:
    Given user is on the login page
    Then user enters valid credentials
    Then navigate to "account_activity" page
    
    Scenario: Title verification
      Then verify that the page title is "Zero – Account activity"

      Scenario: Account dropdown options verification
        Then account dropdown should have "Savings" as a default option
        Then account dropdown should have "Savings, Checking, Loan, Credit Card, Brokerage" options

        Scenario: Transaction table column names verification

          Then transaction table should have "Date, Description, Deposit,Withdrawal" as column name


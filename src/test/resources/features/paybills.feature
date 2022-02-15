Feature: Pay Bills page

  Background:
    Given user is on the login page
    And user enters valid credentials
    Then navigate to "pay_bills" page

  Scenario: Verify the page title
    Then verify that the page title is "Zero - Pay Bills"

  Scenario: Complete the form succesfully, and verify the message
    Given user completes the form succesfully
    Then verify that "The payment was successfully submitted." message is displayed


  Scenario: Warning message should display when user tries to complete the payment without entering amount
    Given user tries to complete payment without inserting amount
    And warning message "Please fill in this field." message is popped up for "amount"


  Scenario: Warning message should display when user tries to complete the payment without entering  date
    And user tries to complete payment without inserting date
    Then warning message "Please fill in this field." message is popped up for "date"
  @wip
  Scenario: Amount section should not accept alphabetical characters
    Given user completes the payment form by inserting "abc" amount input box
    Then verify that "The payment was successfully submitted." warning message is not displayed
    @wip
    Scenario: Amount section should not accept special characters
    Given user completes the payment form by inserting "£$%" amount input box
    Then verify that "The payment was successfully submitted." warning message is not displayed

  @wip
  Scenario: Date section should not accept alphabetical characters
    Given user complete the payment form by inserting "abc" into date input box
    Then verify that "The payment was successfully submitted." warning message is not displayed



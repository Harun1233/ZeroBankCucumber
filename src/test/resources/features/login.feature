
Feature: Users should be able to login only with valid credentials


  Background:
    Given user is on the login page

  @wip
  Scenario:
    Given user enters valid credentials
    Then user should be able to login

  Scenario:
    Given user enters invalid credentials
    Then user should se "Login and/or password are wrong." message



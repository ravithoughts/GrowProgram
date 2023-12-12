Feature: Sign In Functionality

  Background:
    Given Launch registration page

  Scenario Outline: Signing into the application

    Given Enter the required details <username> for login
    When login into the page
    Then verify login is successful

    Examples:
      | username                   |
      | ravikumar.origin@gmail.com |
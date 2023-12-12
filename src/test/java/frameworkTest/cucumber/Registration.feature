Feature: Registration Functionality

  Background:
    Given Launch registration page

  Scenario Outline: Submitting the registration

    Given Enter the required details <email> for registration
    When submit the registration
    Then verify Registration is successful

    Examples:
      | email                      |
      | ravikumar.origin@gmail.com |
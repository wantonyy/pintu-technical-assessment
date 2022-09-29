@Login
Feature: feature to test login scenario

  @LoginSuccess
  Scenario: Check login is successful with valid credentials
    Given user open VERSION V4 app
    When user on login page
    And user input email "abcd@gmail.com" in email field
    And user input password "1234" in password field
    And user tap on login button
    Then user is navigated to the home page

  @LoginEmailSyntax
  Scenario Outline: Check login is not success because wrong email syntax
    Given user open VERSION V4 app
    When user on login page
    And user input email <email> in email field
    And user input password <password> in password field
    And user tap on login button
    Then system will show error on the email field

    Examples:
      | email         | password |
      | "abcd"        | 1234     |
      | "abcd@"       | 1234     |
      | "abcd@gmail"  | 1234     |
      | "abcd@gmail." | 1234     |
      | "abcd@.com"   | 1234     |


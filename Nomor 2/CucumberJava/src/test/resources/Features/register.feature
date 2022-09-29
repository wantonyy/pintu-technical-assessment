@Register
Feature: feature to test register scenario

  @RegisterSuccessful
  Scenario: Check register is successful
    Given user on login page
    When user tap on create account section
    And user verify if user is on register page
    And user input name "William" on name field
    And user input email "abcd@gmail.com" on email field
    And user input password "1234" on password field
    And user input confirm password "1234" on confirm password field
    And user tap register button
    Then system will pop up registration success notification

  @RegisterAccountRegistered
  Scenario: check if account is already created
    Given user on login page
    When user tap on create account section
    And user verify if user is on register page
    And user input name "William" on name field
    And user input email "abcd@gmail.com" on email field
    And user input password "1234" on password field
    And user input confirm password "1234" on confirm password field
    And user tap register button
    Then system will pop up notifcation that indicate email already existed

  @RegisterEmailSyntax
  Scenario Outline: Check email syntax on register page
    Given user on login page
    When user tap on create account section
    And user verify if user is on register page
    And user input name <name> on name field
    And user input email <email> on email field
    And user input password <password> on password field
    And user input confirm password <confirmation> on confirm password field
    And user tap register button
    Then system will show error message on email field

    Examples: 
      | name    | email    | password | confirmation |
      | William | abc      |     1234 |         1234 |
      | William | abc@     |     1234 |         1234 |
      | William | abc@d    |     1234 |         1234 |
      | William | abc@d.   |     1234 |         1234 |
      | William | abc@.com |     1234 |         1234 |
      | William | abc@.    |     1234 |         1234 |

  @RegisterCheckPassword
  Scenario Outline: Check confirmation password on register page
    Given user on login page
    When user tap on create account section
    And user verify if user is on register page
    And user input name <name> on name field
    And user input email <email> on email field
    And user input password <password> on password field
    And user input confirm password <confirmation> on confirm password field
    And user tap register button
    Then system will show error message on confirm password field

    Examples: 
      | name    | email          | password | confirmation |
      | William | abcd@gmail.com |     1234 |          123 |
      | William | abcd@gmail.com |      123 |         1234 |

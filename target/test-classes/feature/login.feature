Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given I open the browser and navigate to the login page
    When I enter username "standard_user" and password "secret_sauce"
    Then I should see the homepage

  Scenario: Unsuccessful login with invalid credentials
    Given I open the browser and navigate to the login page
    When I enter username "invalid_user" and password "wrong_password"
    Then I should see the homepage

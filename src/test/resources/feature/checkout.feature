#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: E-Commerce Checkout

  Scenario: User completes checkout process
    Given User is on the login page
    When User logs in with "standard_user" and "secret_sauce"
    And User searches for "Laptop"
    And User adds product to cart
    And User proceeds to checkout
    And User enters shipping details and places the order
    Then Order confirmation message should be displayed


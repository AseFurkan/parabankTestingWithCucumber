Feature: Updating Contact Information

  Background:
    When Navigate to Website
    Then  Enter username and password and click login button
    And   User should login successfully

  @Contact @Regression
  Scenario: Update Contact Information
    When Navigate to Update Profile
    Then Update registration information
    And  Updates have been added to the system
    And  Error message
    And   Clik to logout
    And   User should logout successfully

  @Contact @Regression
  Scenario: login with positive action
    Then Enter username and password and click login button
    And  User should login successfully
    And  View current changes
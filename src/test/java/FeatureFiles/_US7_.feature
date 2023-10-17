Feature: Updating Contact Information

  Background:
    When Navigate to Website
    Then  Enter username and password and click login button
    And   User should login successfully

  @Contact @Regression
  Scenario: Update Contact Information
    When Navigate to Update Profile
    Then Update registration information
    And  Error message
    And  Fix the error and update profile again
    And  Updates have been added to the system
    And  Clik to logout
    And  User should logout successfully

    And Enter username and password and click login button
    And  User should login successfully
    And Navigate to Update Profile
    And  View current changes
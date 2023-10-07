Feature:

  Background:
    When Navigate to Website
    Then  Enter username and password and click login button
    And   User should login successfully

  @Contact @Regression
  Scenario: Update Contact Information
    When Navigate to Update Profile
    Then Update registration information
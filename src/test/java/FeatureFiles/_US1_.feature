Feature:

  @Accounts @Smoke @Regression
  Scenario: Register
    When Navigate to Website
    Then  Complete the registration process
    And   User should register successfully

Feature:
  Background:
    When Navigate to Website

  @Accounts @Smoke @Regression
  Scenario: login with positive action
    Then  Enter username and password and click login button
    And   User should login successfully
    And   Clik to logout
    And   User should logout successfully

  @Accounts @Smoke @Regression
  Scenario Outline:login with negative action
    Then  Enter invalid "<username>" or invaliid "<password>" and click button
    And   User should not login successfully

    Examples:
      | username | password |
      | teamyedi |          |
      | teamyedi | team     |
      |          | team7    |
      | team     | team7    |
      |          |          |
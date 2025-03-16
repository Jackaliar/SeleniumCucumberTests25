Feature: New User Registration View

  @Functional #tags for cucumberoptions in runner
  Scenario: Validate new user is able to view after clicking on new Registration
    Given User navigates to the login page
    When User clicks on new Registration button
    Then User should be able to view the Registration page

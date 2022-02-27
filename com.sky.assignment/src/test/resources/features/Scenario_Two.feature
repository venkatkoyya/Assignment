Feature: This feature will make sure that the shop page is navigable and usable.

  Scenario: User sees tiles on the shop page
    Given I am on the home page
    When I try to sign in with invalid credentials
    Then I should see a box with the text ‘Create your My Sky password’
Feature: This feature will make sure that the shop page is navigable and usable.

  Scenario: User sees a list of deals on the deals page
    Given I am on the ‘https://www.sky.com/deals‘ page
    Then I see a list of deals with a price

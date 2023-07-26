Feature: Gift Feature

  @SmokeTest
  Scenario Outline: Amazon Gift Cards
    Given user is on Login Page
    When title page is amazon signin
    Then user login to site
    Then user is on home page
    Then user click gift card
    Then user click birthday section
    Then user can see birthday gift options
    Then user close browser
    
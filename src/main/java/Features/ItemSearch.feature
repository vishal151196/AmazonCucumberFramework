Feature: Search Item Feature

  @SmokeTest @RegressionTest
  Scenario: searching item
    Given user is on Login Page
    When title page is amazon signin
    Then user login to site
    Then user is on home page
    Then user search product
      | item  |
      | watch |
      | bag   |
      | shoes |
    #Then confirm search result  
    Then user close browser

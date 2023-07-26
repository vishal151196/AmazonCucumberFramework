Feature: Amazon login

#Scenario without example

#Scenario: Amazon Test scenario
#
#Given user is on Login Page 
#When title page is amazon signin
#Then user enter "vjayantipatel@gmail.com" and "genius@best"
#And user clicks on signin button
#Then user is on home page
#Then user close browser

#Scenario with example
Scenario Outline: Amazon Test scenario

Given user is on Login Page 
When title page is amazon signin
Then user login to site
Then user is on home page
Then user close browser

Examples:
|username	|	pwd	|
|vjayantipatel@gmail.com|genius@best|

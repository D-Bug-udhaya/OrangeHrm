Feature: OrangeHRM Login
Scenario: Successful login with valid credentials
Given User is on OrangeHRM login page
When User enters username and password 
And Clicks on login button
Then User should be navigated to the dashboard


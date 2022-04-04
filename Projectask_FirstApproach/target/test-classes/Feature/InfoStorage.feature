 
 Feature: Login Credentials Stored in Local Browser
 
 Scenario:  Check whether login credentials stored on browsers local storage
 
Given User is on Facebook Home Page
When  User stores login information in local browser
Then  User able to see stored information in local browser
 
Feature: Taligate Secured Page

Scenario:  Check whether after logout user could able to access friends page 

Given User is on Facebook Sign in Screen 
When  User navigate to the facebook friends page without sigin in 
Then  User gets error message 

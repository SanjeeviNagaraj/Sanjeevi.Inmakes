Feature: To Validate the login functionality of facebook
Scenario: To validate with valid username and invalid password
Scenario: To validate with empty username and empty password
Given To launch the chrome browser and maximizewindow
When To launch the url of the facebook apllication
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To Check Wheather navigate to the home page or not
Then To close the browser



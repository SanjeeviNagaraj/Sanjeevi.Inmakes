Feature: To Validate the login functionality of facebook
Background:
Given To launch the chrome browser and maximizewindow

Scenario: To validate with valid username and invalid password
When To launch the url of the facebook apllication
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To Check Wheather navigate to the home page or not
Then To close the browser

Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the browser and maximize the window
When User has to hit the facebook url
And User has to pass the data "<emaildates>"in email field
And User has to pass the data "<passworddates>"in password field
And User has to click login button
Then User has to close the browser

Examples:
|emaildates              |passworddates|
|sanjeevi@gmail.com      |Inmakes      |
|sanju@gmail.com         |passworddes  |
|datada@gmail.com        |Inmakesda    |
|emaild@gmail.com        |Gilo         |
|sanjei@gmail.com        |Hello        |


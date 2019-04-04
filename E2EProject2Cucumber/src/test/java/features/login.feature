Feature: Log in into application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome driver
And navigate to the "http://qaclickacademy.com" site
And Click on Login link on home page to land on secure sign in page
When User enters <username> and <password> and logs in
Then verify user is successfully logged in
And Close browsers

Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test123@gmail.com	|123457		|

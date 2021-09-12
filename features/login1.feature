Feature: Login Functionality of Leaftaps Application

Background:
Given Open the Chrome Browser
And Load the Application url 'http://leaftaps.com/opentaps/'

Scenario Outline: TC001_Login Test using positive credential

Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then HomePage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: TC002_Login Test using Invalid credential Negative Scenario

Given Enter the username as 'demoCSR'
And Enter the password as 'crm'
When Click on Login button
But ErrorMessage should be displayed

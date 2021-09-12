Feature: Login Functionality of Leaftaps Application

Scenario: TC001_Login Test using positive credential

#Given Load the application in Chrome Browser
#And Load the Application url
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed


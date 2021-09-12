Feature: Creation of Lead in Leaftaps Application

Scenario Outline: TC001_Creating Lead with valid data

Given Create a Lead with <company> and <fname> and <lname> and <phone>
Then Verify Lead created successfully

Examples:
|company|fname|lname|phone|
|'TestLeaf7'|'FName7'|'LName7'|'7991'|
|'TestLeaf8'|'FName8'|'LName8'|'8991'|
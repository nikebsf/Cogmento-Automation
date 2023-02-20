#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Add a new contact in CRM site

Scenario: Login and add a new contact in FreeCRM site

Given user is already on login page2
When the title of page2 is "Cogmento CRM" 
Then user enters2 "noobhacker.one@gmail.com" and "Nikunj@crm" 
Then user clicks on Login button2
Given user is now on Homepage2 
When the display name2 is present "Nikunj Patel" 
Then user clicks on contacts button2 from navigation panel on left side 
Given user is on create new Contact page2 
When the flagBtn2 is displayed 
Then user2 enters "b" and "b" 
Then user click on save btn2 
Then user quit2
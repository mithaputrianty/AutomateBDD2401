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
@LoginFeature
Feature: Login
  I want to login to OrangeHRM websites1

  @TCL01
  Scenario: Login using valid credential
    Given User access OrangeHRM website
		When User enter valid username
		And User enter valid password
		And User click Login button
		Then User redirect to Dashboard page
      
  @TCL02
  Scenario Outline: Login using invalid credential
    Given User access OrangeHRM website
		When User enter invalid <username>
		And User enter invalid <password>
		And User click Login button
		Then User see error message on Login page

    Examples: 
      | username		| password		|
      | Admin123		| admin123		|
      | Admin				| admiiin			|
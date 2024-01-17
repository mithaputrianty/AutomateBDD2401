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

Feature: Login
  I want to login to Cura Healthcare website
  		
	Scenario Outline: Login using invalid credential
		Given User access Cura Healthcare websites
		#When User enter invalid data <username> ands <password>
		#And User click Login button on Cura Login pages
		#Then User expect to see error message on Login pages
		
		Examples:
			| username | password |
			| JohnDoe | ThisIsNotAPassword |
			#| John Doe | ThisIsAPassword |
		
	Scenario Outline: Login using invalid credential
		Given User access Cura Healthcare websites
		When User input <username> 
		And User input <password>
		#And User click Login button on Cura Login pages
		#Then User expect to see error message on Login pages
		
		
		
		
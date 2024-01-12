#Author: mitha.fairuz@wgs-id.com
#Gherkin Implementation

@LoginFeature
Feature: Login
  I want to login to OrangeHRM websites

  @TCL01
  Scenario: Login using valid credential
    Given User access OrangeHRM website
		When User enter valid username and password on OrangeHRM website
		And User click Login button
		Then User redirect to Dashboard page

  @TCL02
  Scenario Outline: Login using invalid credential
    Given User access OrangeHRM website
		When User enter invalid username <username>
		And User enter invalid password <password>
		And User click Login button
		Then User see error message on Login page

    Examples: 
      | username		| password		|
      | Admin123		| admin123		|
      | Admin				| admiiin			|
      
      
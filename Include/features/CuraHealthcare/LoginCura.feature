#Author: mitha.fairuz@wgs-id.com

@LoginFeature
Feature: Login
  I want to login to Cura Healthcare websites 
  
  @LoginCura
  Scenario Outline: Login using valid credential
  	Given User access Cura Healthcare website
		When User enter valid data <username> and <password>
		And User click Login button on Cura Login page
		Then User redirect to Appointment page

    Examples: 
      | username	| password						|
      | John Doe	|	ThisIsNotAPassword	|
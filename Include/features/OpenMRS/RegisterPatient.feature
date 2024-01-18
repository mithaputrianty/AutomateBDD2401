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
@tag
Feature: Register a new patient
  I want to regist a new patient
  
  Background:
  	Given User already logged in as Inpatient Ward

  @tag1
  Scenario Outline: Register a new patient
    Given User click register icon
    When User input given name <given>
    And User input middle name <middle>
    And User input family name <family>
    And User click button next
    And User select gender
    And User click button next
    And User input birth date <bdate>
    And User select birth month <bmonth>
    And User input birth year <byear>
    #And User input estimated years <eyear>
    #And User input estimated month <emonth>
    And User click button next
    And User input address field 1 <address1>
    And User input address field 2 <address2>
    And User input city field <city>
    And User input state field <state>
    And User input country field <country>
    And User input postal code field <postal>
    And User click button next
    And User input phone number <phone>
    And User click button next
    And User select relative <relative>
    And User input person name <person>
    And User click button next
    And User click button confirm
    Then User registration should be successful

    Examples: 
      | given  | middle | family 	 | gender | bdate | bmonth | byear | eyear | emonth | address1 | address2 | city 		| state 		 | country 	 | postal | phone 			 | relative 															| person |
      | Haris  | D		  | Abdullah | M			| 4			| 4	 		 | 1996	 | 27		 | 9			| Testing1 | Testing2 | Bandung	| Jawa Barat | Indonesia | 40212	| 081547115471 | 8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A |	Ina		 |
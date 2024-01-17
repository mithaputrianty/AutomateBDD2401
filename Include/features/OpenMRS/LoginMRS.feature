#Author: mitha.fairuz@wgs-id.com
#Gherkin Implementation

@LoginMRS
Feature: Login MRS
  I want to login to Open MRS website

  Scenario Outline: Login using valid credential as Super User at <location>
    Given User access Open MRS website
    When User input valid username <username> on Open MRS
    And User input valid password <password> on Open MRS
    And User choose Location <location> for the session
    And User click Login button on Open MRS
    Then User redirect to homepage as Super User at <location>

    Examples: 
      | username  | password	| location	|
      |	Admin	|	Admin123	| Inpatient Ward	|
      |	Admin	|	Admin123	| Isolation Ward	|
      |	Admin	|	Admin123	| Laboratory	|
      |	Admin	|	Admin123	| Outpatient Clinic	|
      |	Admin	|	Admin123	| Pharmacy	|
      |	Admin	|	Admin123	| Registration Desk	|
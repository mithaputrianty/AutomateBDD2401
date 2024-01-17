#Author: mitha.fairuz@wgs-id.com
#Gherkin Implementation

@userManagementAdminFeature
Feature: User Management

  @TCUM01
  Scenario Outline: Searching user by username
    Given User login as Admin
    And User redirect to Dashboard page
    When User click Admin menu
    And User input username <username> on System Users
    And User click Search button on System Users
    Then User will see search result on username table

    Examples:
    | username	| 
    | admin			|
    
  @TCUM02  
  Scenario Outline: Add new user
    Given User login as Admin
    And User redirect to Dashboard page
    And User click Admin menu
    When User click Add button on User Management
    And User redirect to Add User form
    And User choose Role <role>
    And User choose Employee Name <employeeName>
    And User choose Status <status>
    And User input Username <username>
    And User input Password <password>
    And User input Confirm Password <confirmPassword>
    And User click Save button on Add User form
    Then 

    Examples:
    | role	| 
    | Admin	|
    |	ESS	|
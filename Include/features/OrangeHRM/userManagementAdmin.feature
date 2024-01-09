#Author: mitha.fairuz@wgs-id.com
#Gherkin Implementation

@userManagementAdminFeature
Feature: User Management
  
  @TCUM01
  Scenario Outline: Searching user by username
    Given User login as Admin
    And User redirect to Dashboard page
    When User click Admin menu
    And User input <username> on Username field
    And User click Search button
    Then User will see search result on username table

    Examples:
    | username	| 
    | admin			|
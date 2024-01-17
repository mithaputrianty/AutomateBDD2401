Feature: Assign Leave

Background:
    Given User Already Login

  Scenario: User assign leave using valid input 
    Given User Click Menu Leave
    And User Click Assign Leave 
    When User input Employee Name 
    And User select Leave Type
    And User select From Date 
    And User select To Date 
    And User input Comment
    And User Click button Assign
    Then User successfully assign leave

Feature: Leave List

Background:
    Given User Already Login

  Scenario: Search leave list employee 
    Given User Click Menu Leave 
    When User select From Date 
    And User select To Date
    And User select Show Leave with Status
    And User input Employee Name
    And User select Sub Unit
    And User Click button Search
    Then Show leave list employee on table based on search data
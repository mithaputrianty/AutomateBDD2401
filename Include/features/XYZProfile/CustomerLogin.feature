#Author: mitha.fairuz@wgs-id.com
#Gherkin Implementation

Feature: Login

  Scenario Outline: Login as Customer
    Given User access XYZ Profile website
    When User click Customer Login
    And User choose Your Name <yourName>
    And User click Login button on XYZ Profile
    Then User successfully login to XYZ Profile

    Examples: 
      | yourName |
      | Hermoine Granger	|
      | Harry Potter	|
      |	Ron Weasly	|
      |	Albus Dumbledore	|
      |	Neville Longbottom	|
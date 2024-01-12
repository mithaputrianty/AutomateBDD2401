#Author: mitha.fairuz@wgs-id.com
#Gherkin Implementation

Feature: Appointment

  Scenario Outline: Create a new appointment
    Given User login
    And User redirect to Appointment page
    When User choose Facility <facility>
    And User choose Healthcare Program <healthcareProgram>
    And User choose Visit Date <visitDate>
    And User input Comment <comment>
    And User click Book Appointment button
    Then Appointment has been created

    Examples: 
      | facility  | healthcareProgram | visitDate | comment |
      | Tokyo CURA Healthcare Center | Medicare | 26/01/2024 | ini adalah comment 1 |
      | Hongkong CURA Healthcare Center | Medicaid | 26/02/2024 | ini adalah comment 2 |
      | Seoul CURA Healthcare Center | None | 26/03/2024 | ini adalah comment 3 |
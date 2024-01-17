#Author: mitha.fairuz@wgs-id.com
#Gherkin Implementation

@CaptureVitals
Feature: Capture Vitals
  I want to add Capture Vitals for Patient

  Scenario Outline: Add capture vitals for patient
    Given User login as Super User at Inpatient Ward
    When User click Capture Vitals menu
    And User choose Patient Data <patientData>
    And User click Yes, Record Vitals button
    And User input patient's Height <height> cm
    And User input patient's Weight <weight> kg
    And User see patient's BMI
    And User input patient's Temperature <temperature> Celcius
    And User input patient's Pulse <pulse> per minutes
    And User input patient's Respiratory Rate <respiratoryRate> per minutes
    And User input patient's Blood Pressure <systolic> and <diastolic> 
    And User input patient's Oxygen Saturation <oxygenSaturation> per minutes
    And User see submission summary
    And User click Save button to save Vitals Form
    Then Capture Vitals for patient successfully created

    Examples: 
      |	patientData	|	height	|	weight	|	temperature	| pulse	| respiratoryRate	| systolic	|	diastolic	|	oxygenSaturation	|
      |	Justin Raj	|	167			|	56			|	36.5				|	80		|	16							|	121				|	85				|	98								|
      |	100HYE			|	167			|	56			|	36.5				|	80		|	16							|	121				|	85				|	98								|
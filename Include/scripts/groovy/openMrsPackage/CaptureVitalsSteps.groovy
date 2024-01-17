package openMrsPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CaptureVitalsSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User login as Super User at (.*)")
	def loginAsSuperUserAt(String location) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseUrl)
		WebUI.setText(findTestObject('Object Repository/OpenMRS/loginPage/usernameField'), GlobalVariable.Username)
		WebUI.setText(findTestObject('Object Repository/OpenMRS/loginPage/passwordField'), GlobalVariable.Password)
		WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/inpatientWardSession'))
		/**
		if (location == 'Inpatient Ward') {
			WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/inpatientWardSession'))
		}
		else if (location == 'Isolation Ward') {
			WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/isolationWardSession'))
		}
		else if (location == 'Laboratory') {
			WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/laboratorySession'))
		}
		else if (location == 'Outpatient Clinic') {
			WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/outpatientClinicSession'))
		}
		else if (location == 'Pharmacy') {
			WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/pharmacySession'))
		}
		else if (location == 'Registration Desk') {
			WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/registrationDeskSession'))
		}*/
		WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/loginBtn'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/homePage/selectedLocation'))
		WebUI.verifyTextPresent('Logged in as Super User (admin) at Inpatient Ward.', false)
		/**
		if (location == 'Inpatient Ward') {
			WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/homePage/selectedLocation'))
			WebUI.verifyTextPresent('Logged in as Super User (admin) at Inpatient Ward.', false)
		}
		else if (location == 'Isolation Ward') {
			WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/homePage/selectedLocation'))
			WebUI.verifyTextPresent('Logged in as Super User (admin) at Isolation Ward.', false)
		}
		else if (location == 'Laboratory') {
			WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/homePage/selectedLocation'))
			WebUI.verifyTextPresent('Logged in as Super User (admin) at Laboratory.', false)
		}
		else if (location == 'Outpatient Clinic') {
			WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/homePage/selectedLocation'))
			WebUI.verifyTextPresent('Logged in as Super User (admin) at Outpatient Clinic.', false)
		}
		else if (location == 'Pharmacy') {
			WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/homePage/selectedLocation'))
			WebUI.verifyTextPresent('Logged in as Super User (admin) at Pharmacy.', false)
		}
		else if (location == 'Registration Desk') {
			WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/homePage/selectedLocation'))
			WebUI.verifyTextPresent('Logged in as Super User (admin) at Registration Desk.', false)
		}*/
	}

	@And("User click Capture Vitals menu")
	def clickCaptureVitalsMenu() {
		WebUI.click(findTestObject('Object Repository/OpenMRS/homePage/captureVitalsBtn'))
	}
	
	@And("User choose Patient Data (.*)")
	def inputPatientData(String patientData) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/patientSearchField'), patientData)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/rowDataChosen'))
	}
	
	@And("User click Yes, Record Vitals button")
	def clickYesRecordVitalsBtn() {
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/yesRecordVitalsBtn'))
	}
	
	@And("User input patient's Height (.*) cm")
	def inputPatientsHeight(String height) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/heightField'), height)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	
	@And("User input patient's Weight (.*) kg")
	def inputPatientsWeight(String weight) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/weightField'), weight)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	
	@And("User see patient's BMI")
	def seePatientsBMI() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/OpenMRS/captureVitalsPage/patientBMI'), 0)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	@And("User input patient's Temperature (.*) Celcius")
	def inputPatientsTemperature(String temperature) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/temperatureField'), temperature)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	
	@And("User input patient's Pulse (.*) per minutes")
	def inputPatientsPulse(String pulse) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/pulseField'), pulse)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	
	@And("User input patient's Respiratory Rate (.*) per minutes")
	def inputPatientsRespiratoryRate(String respiratoryRate) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/respiratoryField'), respiratoryRate)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	
	@And("User input patient's Blood Pressure (.*) and (.*)")
	def inputPatientsBloodPresure(String systolic, String diastolic) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/systolicField'), systolic)
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/diastolicField'), diastolic)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	
	@And("User input patient's Oxygen Saturation (.*) per minutes")
	def inputPatientsOxygenSaturation(String oxygenSaturation) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/captureVitalsPage/oxygenSaturationField'), oxygenSaturation)
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/nextBtn'))
	}
	
	@And("User see submission summary")
	def seeSubmissionSummary() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMRS/captureVitalsPage/submissionSummary'))
	}
	
	@And("User click Save button to save Vitals Form")
	def clickSaveBtnToSaveVitalsForm() {
		WebUI.click(findTestObject('Object Repository/OpenMRS/captureVitalsPage/saveBtn'))
	}
		
	@Then("Capture Vitals for patient successfully created")
	def captureVitalsForPatietCreated() {
		WebUI.verifyTextPresent('Entered Vitals for ', false)
		WebUI.verifyTextPresent('Capture Vitals for Patient', false)
		WebUI.closeBrowser()
	}
}
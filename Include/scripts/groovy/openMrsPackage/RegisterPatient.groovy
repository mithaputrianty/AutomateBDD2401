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



class RegisterPatient {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User already logged in as Inpatient Ward")
	def user_already_logged_in_as_inpatient_ward() {
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

	@Given("User click register icon")
	def user_click_register_icon() {
		WebUI.click(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/regist_icon"))
	}

	@When("User input given name(.*)")
	def user_input_given_name(String given) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/given_name"), given)
	}

	@And("User input middle name(.*)")
	def user_input_middle_name(String middle) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/middle_name"), middle)
	}

	@And("User input family name(.*)")
	def user_input_family_name(String family) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/family_name"), family)
	}

	@And("User click button next")
	def user_click_button_next() {
		WebUI.click(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/next_button"))
	}

	@And("User select gender")
	def user_select_gender() {
		WebUI.click(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/gender_male"))
	}

	@And("User input birth date(.*)")
	def user_input_birth_date(String bdate) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/birthdate_field"), bdate)
	}

	@And("User select birth month(.*)")
	def user_input_birth_month(String bmonth) {
		WebUI.selectOptionByIndex(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/birthmonth_field"), bmonth)
	}

	@And("User input birth year(.*)")
	def user_input_birth_year(String byear) {
//		WebUI.delay(1)	
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/birthyear_field"), byear)
	}

	@And("User input estimated year(.*)")
	def user_input_estimated_year(String eyear) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/estimated_year"), eyear)
	}

	@And("User input estimated month(.*)")
	def user_input_estimated_month(String emonth) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/estimated_month"), emonth)
	}

	@And("User input address field 1(.*)")
	def user_input_address_field1(String address1) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/address1"), address1)
	}

	@And("User input address field 2(.*)")
	def user_input_address_field2(String address2) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/address2"), address2)
	}

	@And("User input city field(.*)")
	def user_input_city_field(String city) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/city"), city)
	}

	@And("User input state field(.*)")
	def user_input_state_field(String state) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/state"), state)
	}

	@And("User input country field(.*)")
	def user_input_county_field(String country) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/country"), country)
	}

	@And("User input postal code field(.*)")
	def user_input_postal_field(String postal) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/postal_code"), postal)
	}

	@And("User input phone number(.*)")
	def user_input_phone_number(String phone) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/phone_numer"), phone)
	}

	@And("User select relative(.*)")
	def user_select_relative(String relative) {
		WebUI.selectOptionByValue("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/relation_type", relative, false)
	}

	@And("User input person name(.*)")
	def user_input_person_name(String person) {
		WebUI.setText(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/person_name"), person)
	}

	@And("User click button confirm")
	def user_click_button_confirm() {
		WebUI.click(findTestObject("Object Repository/OpenMRS/Inpatient Ward/Regist a patient/submit_form"))
	}

	@Then("User registration should be successful")
	def user_registration_should_be_successful(String status) {
	}
}
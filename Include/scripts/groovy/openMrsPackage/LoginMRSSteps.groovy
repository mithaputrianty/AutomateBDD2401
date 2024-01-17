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



class LoginMRSSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User access Open MRS website")
	def accessOpenMRSwebsite() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseUrl)
	}

	@When("User input valid username (.*) on Open MRS")
	def inputValidUsernameOpenMRS(String username) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/loginPage/usernameField'), username)	
	}
	
	@And("User input valid password (.*) on Open MRS")
	def inputValidPasswordOpenMRS(String password) {
		WebUI.setText(findTestObject('Object Repository/OpenMRS/loginPage/passwordField'), password)
	}
	
	@And("User choose Location (.*) for the session")
	def chooseLocationForTheSession(String location) {
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
		}
	}
	
	@And("User click Login button on Open MRS")
	def clickLoginBtnOnOpenMRS() {
		WebUI.click(findTestObject('Object Repository/OpenMRS/loginPage/loginBtn'))
	}

	@Then("User redirect to homepage as Super User at (.*)")
	def redirectToHomepageAsSuperUser(String location) {
		
	}
}
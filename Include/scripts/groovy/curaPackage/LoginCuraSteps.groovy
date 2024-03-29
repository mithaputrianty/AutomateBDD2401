package curaPackage
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



class LoginCuraSteps {
	@Given("User access Cura Healthcare website")
	def accessCura() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseUrl)
	}

	@When("User enter valid username and password")
	def enterValidUsernamePasswordCura() {
		WebUI.setText(findTestObject('Object Repository/Cura Healthcare/Login Page/usernameField'), GlobalVariable.usernameCura)
		WebUI.setText(findTestObject('Object Repository/Cura Healthcare/Login Page/passwordFIeld'), GlobalVariable.passwordCura)
	}

	@And("User click Login button on Cura Login page")
	def clickLoginBtn() {
		WebUI.click(findTestObject('Object Repository/Cura Healthcare/Login Page/loginBtn'))
	}

	@Then("User redirect to Appointment page")
	def redirectToAppointmentPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Cura Healthcare/Appointment Page/facilityDropdown'), 0)
		//WebUI.closeBrowser()
	}

	@When("User enter invalid data (.*) and (.*)")
	def enterInvalidData(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Cura Healthcare/Login Page/usernameField'), username)
		WebUI.setText(findTestObject('Object Repository/Cura Healthcare/Login Page/passwordFIeld'), password)
	}

	@Then("User expect to see error message on Login page")
	def seeErrorMessageonLoginPage() {
		WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', false)
		WebUI.closeBrowser()
	}

	def userValidLogin() {
		accessCura()
		enterValidUsernamePasswordCura()
		clickLoginBtn()
		redirectToAppointmentPage()
	}
}
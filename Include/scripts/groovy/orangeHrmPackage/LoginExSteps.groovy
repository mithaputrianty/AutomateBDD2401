package orangeHrmPackage
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


class LoginExSteps {


	@Given("User access OrangeHRM website")
	def accessOrangehrm() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.urlOrangeHrm)
	}

	@When("User enter valid username (.*) and (.*)")
	def User_enter_valid_username(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_username'), username)
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_password'), password)
	}

	@When("User enter valid username and password")
	def enterValidUsernamePassword() {
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_username'), GlobalVariable.usernameValidLogin)
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_password'), GlobalVariable.passwordValidLogin)
	}

	@When("User enter invalid username (.*)")
	def User_enter_invalid_username(String username) {
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_username'), username)
	}

	@When("User enter invalid password (.*)")
	def User_enter_invalid_password(String password) {
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_password'), password)
	}

	@When("User click Login button")
	def User_click_Login_button() {
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Login Page/button_Login'))
	}

	@Then("User see error message on Login page")
	def User_see_error_message_on_Login_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/OrangeHRM/Login Page/div_Invalid credentials'), FailureHandling.STOP_ON_FAILURE)
		//WebUI.click(findTestObject('Object Repository/OrangeHRM/Login Page/div_Invalid credentials'))
		WebUI.closeBrowser()
	}

	@Then("User redirect to Dashboard page")
	def User_redirect_to_Dashboard_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/OrangeHRM/Dashboard/h6_Dashboard'), FailureHandling.STOP_ON_FAILURE)
		//WebUI.closeBrowser()
	}
}
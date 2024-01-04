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

//import orangeHrmPackage.myCucumberRunner
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW


class LoginSteps {

	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		CucumberKW.GLUE = ['orangeHrmPackage']
	}

	@Given("User access OrangeHRM website")
	def accessOrangehrm() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	}

	@When("User enter valid (.*)")
	def User_enter_valid_username(String username) {
		WebUI.setText(findTestObject('Object Repository/Login feature/Page_OrangeHRM/input_username'), username)
	}

	@When("User enter invalid (.*)")
	def User_enter_invalid_username(String username) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Login feature/Page_OrangeHRM/input_username'), username)
	}

	@When("User enter valid (.*)")
	def User_enter_valid_password(String password) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Login feature/Page_OrangeHRM/input_password'), password)
	}

	@When("User enter invalid (.*)")
	def User_enter_invalid_password(String password) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Login feature/Page_OrangeHRM/input_password'), password)
	}

	@When("User click Login button")
	def User_click_Login_button() {
		WebUI.click(findTestObject('Object Repository/Login feature/Page_OrangeHRM/button_Login'))
	}

	@Then("User redirect to Dashboard page")
	def User_redirect_to_Dashboard_page() {
		WebUI.click(findTestObject('Object Repository/Login feature/Page_OrangeHRM/h6_Dashboard'))
	}

	@Then("User see error message on Login page")
	def User_see_error_message_on_Login_page() {
		WebUI.click(findTestObject('Object Repository/Login feature/Page_OrangeHRM/div_Invalid credentials'))
	}
}
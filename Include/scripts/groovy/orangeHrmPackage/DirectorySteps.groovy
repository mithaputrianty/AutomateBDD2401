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
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.server.handler.SendKeys
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



class DirectorySteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User Already Login")
	def User_already_login() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.urlOrangeHrm)
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_username'), GlobalVariable.usernameValidLogin)
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_password'), GlobalVariable.passwordValidLogin)
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Login Page/button_Login'))
	}

	@Given("User click Menu Directory")
	def User_click_menu_directory() {
		//		WebUI.waitForElementVisible('Object Repository/OrangeHRM/Directory/a_Directory', 5)
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Directory/a_Directory'))
	}

	@When("User input name (.*)")
	def User_input_name(String name) {
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Directory/employee_name'))
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Directory/employee_name'), name)
		WebUI.delay(2)
		WebUI.clickOffset(findTestObject('Object Repository/OrangeHRM/Directory/employee_name'), 20, 50)
//		WebUI.selectOptionByIndex(findTestObject('Object Repository/OrangeHRM/Directory/employee'), 0)
	}

	@And("User select job title")
	def User_select_job_title() {
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Directory/job_title'))
		WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/Directory/job_title'), 'q')
	}

	@And("User select location")
	def User_select_location() {
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Directory/location'))
		WebUI.selectOptionByIndex(findTestObject('Object Repository/OrangeHRM/Directory/location'), 1)
	}

	@And("User click button Search")
	def User_click_button_search() {
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Directory/button_search'))
	}

	@Then("User successfully search employee directory")
	def User_successfully_search_employee() {
		//
	}

	@And("Show search result on table")
	def Show_search_result_on_table() {
	}
}
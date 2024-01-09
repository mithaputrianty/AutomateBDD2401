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



class UserManagementAdminSteps {
	@Given("User login as Admin")
	def loginAsAdmin() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.urlOrangeHrm)
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_username'), GlobalVariable.usernameValidLogin)
		WebUI.setText(findTestObject('Object Repository/OrangeHRM/Login Page/input_password'), GlobalVariable.passwordValidLogin)
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Login Page/button_Login'))
	}
	
	@When("User click Admin menu")
	def accessAdminMenu() {
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Dashboard/admin_menu'))
		WebUI.click(findTestObject('Object Repository/OrangeHRM/Admin Page/admin_page'))
	}
		
	@And("User input (.*) on Username field")
	def inputUsernameManagement(String username) {
		
	}
	
	@And("User click Search button")
	def searchBtnUserManagement() {
		
	}

	@Then("User will see search result on username table")
	def searchResultValid() {
		
	}
}
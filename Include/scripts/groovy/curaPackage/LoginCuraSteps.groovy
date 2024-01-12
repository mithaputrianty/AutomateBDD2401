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
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')
	}

	@When("User enter valid data (.*) and (.*)")
	def User_enter_valid_username_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Cura Healthcare/Login Page/usernameField'), username)
		WebUI.setText(findTestObject('Object Repository/Cura Healthcare/Login Page/passwordFIeld'), password)
	}

	@And("User click Login button on Cura Login page")
	def User_click_Login_button_on_Cura_Login_page() {
		WebUI.click(findTestObject('Object Repository/Cura Healthcare/Login Page/loginBtn'))
	}

	@Then("User redirect to Appointment page")
	def User_redirect_to_Appointment_page() {
		WebUI.click(findTestObject('Object Repository/Cura Healthcare/Appointment Page/facilityDropdown'))
		//WebUI.closeBrowser()
	}
}
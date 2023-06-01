import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/basic-first-form-demo.html')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(Page_load)

WebUI.waitForElementClickable(findTestObject('Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/a_No, thanks'), Wait_general)

WebUI.click(findTestObject('Object Repository/Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/a_No, thanks'))

WebUI.setText(findTestObject('Object Repository/Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter message_user-message'), 
    'Bienvenidos a Katalon función Wait')

WebUI.waitForElementVisible(findTestObject('Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/button_Show Message'), 
    Wait_general)

WebUI.click(findTestObject('Object Repository/Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/button_Show Message'))

WebUI.setText(findTestObject('Object Repository/Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter a_sum1'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter b_sum2'), 
    '5')

WebUI.waitForElementPresent(findTestObject('Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/button_Get Total'), 
    Wait_general)

WebUI.click(findTestObject('Object Repository/Wait/Page_Selenium Easy Demo - Simple Form to Au_3f5468/button_Get Total'))

WebUI.closeBrowser()


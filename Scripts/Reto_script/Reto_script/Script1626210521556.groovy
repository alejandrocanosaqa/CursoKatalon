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

//Esperar el elemento
WebUI.waitForElementClickable(findTestObject('Object Repository/Reto_script/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/a_No, thanks'), 
    20)

WebUI.click(findTestObject('Object Repository/Reto_script/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/a_No, thanks'))

WebUI.setText(findTestObject('Object Repository/Reto_script/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/input_Enter message_user-message'), 
    'Bienvenidos a Katalon')

WebUI.click(findTestObject('Object Repository/Reto_script/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/button_Show Message'))

WebUI.scrollToPosition(0, 200)

WebUI.setText(findTestObject('Object Repository/Reto_script/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/input_Enter a_sum1'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Reto_script/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/input_Enter b_sum2'), 
    '5')

WebUI.click(findTestObject('Object Repository/Reto_script/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/button_Get Total'))

WebUI.closeBrowser()


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

WebUI.waitForElementClickable(findTestObject('Validar_campo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/a_No, thanks'), 
    3)

WebUI.click(findTestObject('Object Repository/Validar_campo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/a_No, thanks'))

WebUI.setText(findTestObject('Object Repository/Validar_campo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter a_sum1'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Validar_campo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/input_Enter b_sum2'), 
    '5')

WebUI.click(findTestObject('Object Repository/Validar_campo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/button_Get Total'))

resultado = WebUI.getText(findTestObject('Validar_campo/Page_Selenium Easy Demo - Simple Form to Au_3f5468/Page_Selenium Easy Demo - Simple Form to Automate using Selenium/span_10'))

print('El resultado es: ' + resultado)

WebUI.closeBrowser()


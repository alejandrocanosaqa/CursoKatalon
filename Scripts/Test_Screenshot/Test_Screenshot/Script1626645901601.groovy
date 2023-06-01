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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html')

WebUI.selectOptionByValue(findTestObject('Object Repository/Screshot/Page_Selenium Easy Demo - Automate All Scenarios/select_Please select Sunday  Monday  Tuesda_3c4b3e'), 
    'Monday', true)

WebUI.delay(4)

//String foto=WebUI.takeAreaScreenshot()
WebUI.takeScreenshot('C:\\Todo_Katalon\\Proyectos\\Proyecto_uno\\Imagenes\\test1.png')

WebUI.selectOptionByValue(findTestObject('Object Repository/Screshot/Page_Selenium Easy Demo - Automate All Scenarios/select_CaliforniaFloridaNew JerseyNew YorkO_db0549'), 
    'Florida', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Screshot/Page_Selenium Easy Demo - Automate All Scenarios/select_CaliforniaFloridaNew JerseyNew YorkO_db0549'), 
    'New Jersey', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Screshot/Page_Selenium Easy Demo - Automate All Scenarios/select_CaliforniaFloridaNew JerseyNew YorkO_db0549'), 
    'Florida', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Screshot/Page_Selenium Easy Demo - Automate All Scenarios/select_CaliforniaFloridaNew JerseyNew YorkO_db0549'), 
    'Florida', true)

WebUI.click(findTestObject('Object Repository/Screshot/Page_Selenium Easy Demo - Automate All Scenarios/button_First Selected'))

WebUI.click(findTestObject('Object Repository/Screshot/Page_Selenium Easy Demo - Automate All Scenarios/button_Get All Selected'))

WebUI.takeScreenshot('C:\\Todo_Katalon\\Proyectos\\Proyecto_uno\\Imagenes\\test2.png')

WebUI.closeBrowser()


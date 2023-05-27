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

WebUI.navigateToUrl('https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Doble_click/Page_Telerik Web UI TreeView WebForms TreeV_78f562/button_Accept and Close'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/Doble_click/Page_Telerik Web UI TreeView WebForms TreeV_78f562/span_WebForms TreeView Overview_rtMinus rtM_4103a7'))

WebUI.verifyElementClickable(findTestObject('Doble_click/Page_Telerik Web UI TreeView WebForms TreeV_78f562/span_WebForms TreeView Overview_rtMinus rtM_4103a7'))

WebUI.click(findTestObject('Doble_click/Page_Telerik Web UI TreeView WebForms TreeV_78f562/span_WebForms TreeView Overview_rtMinus rtM_4103a7'))

WebUI.doubleClick(findTestObject('Object Repository/Doble_click/Page_Telerik Web UI TreeView WebForms TreeV_78f562/span_WebForms TreeView Overview_rtPlus rtPlusHover'))

WebUI.closeBrowser()


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

WebUI.comment('Practica 9')

//cogemos el indice de la ventana actual
int IndiceVentanaActual = WebUI.getWindowIndex()

//conseguimos index de la ventana popup
WebUI.switchToWindowIndex(IndiceVentanaActual + 1)

//cogemos texto de contraseña
String password = WebUI.getText(findTestObject('AllTestLevel/TextoPassword'))

//volvemos a la ventana padre
WebUI.switchToWindowIndex(0)

//escribimos password
WebUI.setText(findTestObject('AllTestLevel/TextBox_nivel2'), password)

//pasamos a nivel 10
WebUI.click(findTestObject('AllTestLevel/Boton_Nivel2'))

WebUI.selectOptionByLabel(findTestObject(null), '', false)


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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Rellenar_Formulario/Nombre'), Nombre)

WebUI.delay(GlobalVariable.DelayLargo)

WebUI.setText(findTestObject('Rellenar_Formulario/Apellidos'), Apellidos)

WebUI.delay(GlobalVariable.DelayLargo)

WebUI.setText(findTestObject('Rellenar_Formulario/Email'), Email)

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('Rellenar_Formulario/RadioButton_male'))

WebUI.click(findTestObject('Rellenar_Formulario/RadioButton_male'))

WebUI.delay(1)

WebUI.setText(findTestObject('Rellenar_Formulario/Movil'), Movil)

String TextoMovil = WebUI.getText(findTestObject('Rellenar_Formulario/Movil'))

WebUI.verifyMatch('667356724', '(\\+34|0034|34)?[ -]*(6|7)([0-9]){2}[ -]?(([0-9]){2}[ -]?([0-9]){2}[ -]?([0-9]){2}|([0-9]){3}[ -]?([0-9]){3})', 
    true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Rellenar_Formulario/Cumpleaños'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Rellenar_Formulario/Mes'), '10', false)

WebUI.selectOptionByValue(findTestObject('Rellenar_Formulario/Año'), '1977', false)

WebUI.click(findTestObject('Rellenar_Formulario/Dia'))

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('Rellenar_Formulario/Asunto'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rellenar_Formulario/Asunto'))

WebUI.comment('No permite escribir en este elemento')

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('Rellenar_Formulario/Sports'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rellenar_Formulario/Sports'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Rellenar_Formulario/Subir_Archivo'), 'C:\\Users\\aleja\\Imagenes\\imagen.png')

WebUI.scrollToElement(findTestObject('Rellenar_Formulario/Direccion'), 0)

WebUI.click(findTestObject('Rellenar_Formulario/Direccion'))

WebUI.setText(findTestObject('Rellenar_Formulario/Direccion'), 'Calle alfonso VII numero 7 3')

WebUI.closeBrowser()


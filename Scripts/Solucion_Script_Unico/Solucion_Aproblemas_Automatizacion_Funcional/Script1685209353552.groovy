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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions


By Sourcelevel10 = By.id('source')

By Targetlevel10 = By.id('target')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://pruebaselenium.serviciosdetesting.com/')

WebUI.comment('Practica nivel 1')

WebUI.click(findTestObject('AllTestLevel/BotonEmpezar'))

WebUI.comment('Practica nivel 2')

WebUI.setText(findTestObject('AllTestLevel/Textbox_nivel2'), 'selenium')

WebUI.waitForElementClickable(findTestObject('AllTestLevel/Boton_Nivel2'), GlobalVariable.DelayCorto)

WebUI.click(findTestObject('AllTestLevel/Boton_Nivel2'))

WebUI.comment('Pratica nivel 3')

String Texto_label = WebUI.getText(findTestObject('AllTestLevel/Label_nivel3'))

WebUI.waitForElementClickable(findTestObject('AllTestLevel/Textbox_nivel2'), GlobalVariable.DelayCorto)

WebUI.setText(findTestObject('AllTestLevel/Textbox_nivel2'), Texto_label)

WebUI.waitForElementClickable(findTestObject('AllTestLevel/Boton_Nivel2'), GlobalVariable.DelayCorto)

WebUI.click(findTestObject('AllTestLevel/Boton_Nivel2'))

WebUI.comment('Practica nivel 4')

WebUI.waitForElementClickable(findTestObject('AllTestLevel/Boton1_nivel4'), GlobalVariable.DelayCorto)

WebUI.click(findTestObject('AllTestLevel/Boton1_nivel4'))

WebUI.waitForElementClickable(findTestObject('AllTestLevel/Boton2_nivel4'), GlobalVariable.DelayCorto)

WebUI.click(findTestObject('AllTestLevel/Boton2_nivel4'))

WebUI.waitForElementClickable(findTestObject('AllTestLevel/Boton3_nivel4'), GlobalVariable.DelayCorto)

WebUI.click(findTestObject('AllTestLevel/Boton3_nivel4'))

WebUI.waitForElementClickable(findTestObject('AllTestLevel/Boton4_nivel4'), GlobalVariable.DelayCorto)

WebUI.click(findTestObject('AllTestLevel/Boton4_nivel4'))

WebUI.delay(GlobalVariable.DelayCorto)

WebUI.comment('Practica nivel 5')

WebUI.click(findTestObject('AllTestLevel/Enlace_nivel5'))

WebUI.delay(GlobalVariable.DelayCorto)

WebUI.comment('Practica 6')

//Buscamos el objeto en el repositorio de objetos y le decimos en que carpeta
TestObject testObj = findTestObject('AllTestLevel/BotonOculto')

//Transformamos a elemento WebElement de la clase org.openqa.selenium.WebElement
WebElement BotonOculto = WebUI.findWebElement(testObj, 5)

WebUI.comment('Practica Nivel 7')

//Ejecutamos el javascript  del objeto oculto
WebUI.executeJavaScript('changePage();', Arrays.asList(BotonOculto), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('Practica Nivel 8')

//Guardamos el driver que utilizamos en la ejecucion chroome,firefox,ect
WebDriver driver = DriverFactory.getWebDriver()

//Escribimos el siguiente nivel en la ventana de la alerta
driver.switchTo().alert().sendKeys('9')

//pulsar aceptar
driver.switchTo().alert().accept()

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

WebUI.comment('Practica 10')

//clase para realizar acciones en objetos del DOM
Actions action = new Actions(driver)

WebElement from = driver.findElement(Sourcelevel10)

WebElement to = driver.findElement(Targetlevel10)

//copiamos el elemento origen en el destino
action.dragAndDrop(from, to).build().perform()

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('AllTestLevel/TextoFinalPractica'), '¡Enhorabuena! Has llegado al final de la práctica')

WebUI.closeBrowser()


package com.helper.comun

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.json.internal.Exceptions

import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions

import internal.GlobalVariable

public class MetodosComunes {

	@Keyword
	public void AbrirNavegador(String url,int tiempo) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(url)
		WebUI.waitForPageLoad(tiempo)
	}

	public void DrogAndDrog(String objetoOrigen,String contenedor) {

		By Elemento = By.id(objetoOrigen)

		By Contenedor= By.id(contenedor)

		//Guardamos el driver que utilizamos en la ejecucion chroome,firefox,ect
		WebDriver driver = DriverFactory.getWebDriver()

		//clase para realizar acciones en objetos del DOM
		Actions action = new Actions(driver)

		WebElement from = driver.findElement(Elemento)

		WebElement to = driver.findElement(Contenedor)

		//copiamos el elemento origen en el destino
	
		 action.dragAndDrop(from, to).build().perform()
	
	}
}

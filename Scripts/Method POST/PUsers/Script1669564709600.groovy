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

response = WS.sendRequest(findTestObject('Method POST/pusers'))
WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'id', '11')

GlobalVariable.name = 'bululu'
GlobalVariable.username = 'testing1'
GlobalVariable.email = 'bululu'
GlobalVariable.street = 'testing1'
GlobalVariable.name = 'bululu'
GlobalVariable.username = 'testing1'
GlobalVariable.suite = 'bululu'
GlobalVariable.city = 'testing1'
GlobalVariable.zipcode = 'bululu'
GlobalVariable.lat = 'testing1'
GlobalVariable.lng = 'bululu'
GlobalVariable.phone = 'testing1'
GlobalVariable.website = 'bululu'
GlobalVariable.company = 'testing1'
GlobalVariable.catchPhrase = 'bululu'
GlobalVariable.bs = 'testing1'



response = WS.sendRequest(findTestObject('POST/pusers'))

WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'name', 'bululu')
WS.verifyElementPropertyValue(response, 'username', 'testing1')
WS.verifyElementPropertyValue(response, 'email', 'bululu')
WS.verifyElementPropertyValue(response, 'street', 'testing1')
WS.verifyElementPropertyValue(response, 'name', 'bululu')
WS.verifyElementPropertyValue(response, 'username', 'testing1')
WS.verifyElementPropertyValue(response, 'suite', 'bululu')
WS.verifyElementPropertyValue(response, 'city', 'testing1')
WS.verifyElementPropertyValue(response, 'zipcode', 'bululu')
WS.verifyElementPropertyValue(response, 'lat', 'testing1')
WS.verifyElementPropertyValue(response, 'lng', 'bululu')
WS.verifyElementPropertyValue(response, 'phone', 'testing1')
WS.verifyElementPropertyValue(response, 'website', 'bululu')
WS.verifyElementPropertyValue(response, 'company', 'testing1')
WS.verifyElementPropertyValue(response, 'catchPharse', 'bululu')
WS.verifyElementPropertyValue(response, 'bs', 'testing1')





GlobalVariable.name = 'bululu'
GlobalVariable.username = 'testing1'
GlobalVariable.email = 'bululu'
GlobalVariable.street = 'testing1'
GlobalVariable.name = 'bululu'
GlobalVariable.username = 'testing1'
GlobalVariable.suite = 'bululu'
GlobalVariable.city = 'testing1'
GlobalVariable.zipcode = 'bululu'
GlobalVariable.lat = 'testing1'
GlobalVariable.lng = 'bululu'
GlobalVariable.phone = 'testing1'
GlobalVariable.website = 'bululu'
GlobalVariable.company = 'testing1'
GlobalVariable.catchPhrase = 'bululu'
GlobalVariable.bs = 'testing1'

response1 = WS.sendRequest(findTestObject('POST/pusers'))

WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response1, 'name', 'bululu2')
WS.verifyElementPropertyValue(response1, 'username', 'testing2')
WS.verifyElementPropertyValue(response1, 'email', 'bululu2')
WS.verifyElementPropertyValue(response1, 'street', 'testing2')
WS.verifyElementPropertyValue(response1, 'name', 'bululu2')
WS.verifyElementPropertyValue(response1, 'username', 'testing2')
WS.verifyElementPropertyValue(response1, 'suite', 'bululu2')
WS.verifyElementPropertyValue(response1, 'city', 'testing2')
WS.verifyElementPropertyValue(response1, 'zipcode', 'bululu2')
WS.verifyElementPropertyValue(response1, 'lat', 'testing2')
WS.verifyElementPropertyValue(response1, 'lng', 'bululu2')
WS.verifyElementPropertyValue(response1, 'phone', 'testing2')
WS.verifyElementPropertyValue(response1, 'website', 'bululu2')
WS.verifyElementPropertyValue(response1, 'company', 'testing2')
WS.verifyElementPropertyValue(response1, 'catchPharse', 'bululu2')
WS.verifyElementPropertyValue(response1, 'bs', 'testing2')

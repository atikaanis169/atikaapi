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

GlobalVariable.title = 'balalla'
GlobalVariable.body = 'testing1'

response = WS.sendRequest(findTestObject('POST/posts'))

WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'title', 'balalla')
WS.verifyElementPropertyValue(response, 'body', 'testing1')

GlobalVariable.title = 'anis'
GlobalVariable.body = 'testing2'

response1 = WS.sendRequest(findTestObject('POST/posts'))

WS.verifyResponseStatusCode(response1, 201)
WS.verifyElementPropertyValue(response1, 'title', 'anis')
WS.verifyElementPropertyValue(response1, 'body', 'testing2')
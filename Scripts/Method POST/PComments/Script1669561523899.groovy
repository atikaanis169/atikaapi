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

response = WS.sendRequest(findTestObject('Method POST/pcomments'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'id', '501')

GlobalVariable.title = 'bokululu'

GlobalVariable.body = 'teskkkkting1'

response = WS.sendRequest(findTestObject('Method GET/comments'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'title', 'bokululu')

WS.verifyElementPropertyValue(response, 'body', 'teskkkkting1')

GlobalVariable.title = 'manis1'

GlobalVariable.body = 'testing21'

response1 = WS.sendRequest(findTestObject('Method GET/comments'))

WS.verifyResponseStatusCode(response1, 201)

WS.verifyElementPropertyValue(response1, 'title', 'manis1')

WS.verifyElementPropertyValue(response1, 'body', 'testing21')


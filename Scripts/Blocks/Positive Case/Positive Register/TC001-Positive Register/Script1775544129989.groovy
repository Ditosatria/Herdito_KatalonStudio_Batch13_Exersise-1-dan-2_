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

WebUI.click(findTestObject('Object Repository/Page Regsiter/Page_Automation Practice Site/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page Regsiter/Page_My Account  Automation Practice Site/input__username'))

WebUI.setText(findTestObject('Object Repository/Page Regsiter/Page_My Account  Automation Practice Site/input__reg_email'), 
    CustomKeywords.'Utilities.randomInt'(12))

WebUI.setEncryptedText(findTestObject('Object Repository/Page Regsiter/Page_My Account  Automation Practice Site/input__reg_password'), 
    'aAEStc0wZsTJIUZUOM0yhg==')

WebUI.click(findTestObject('Object Repository/Page Regsiter/Page_My Account  Automation Practice Site/input_Anti-spam_register'))

WebUI.verifyElementVisible(findTestObject('Page Regsiter/p_Hello Diallo13 (not Diallo13 Sign out)'))


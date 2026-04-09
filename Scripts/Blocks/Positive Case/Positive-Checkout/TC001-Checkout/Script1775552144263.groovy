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

WebUI.callTestCase(findTestCase('Reusable Test Case/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Positive Case/Positive Login/TC001-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page Checkout/btn_Shop'))

WebUI.click(findTestObject('Object Repository/Page Checkout/btn_Add to basket'))

WebUI.click(findTestObject('Object Repository/Page Checkout/a_Add to basket_1'))

WebUI.click(findTestObject('Object Repository/Page Checkout/span_2 items'))

WebUI.click(findTestObject('Object Repository/Page Checkout/btn_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_first_name'), 'Diallo')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_last_name'), 'Ungs')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input_Company Name_billing_company'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_email'), 'Diallo@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_phone'), '08209109201')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_address_1'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_city'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_postcode'), '15267')

WebUI.click(findTestObject('Object Repository/Page Checkout/input_Check Payments_payment_method_cod'))

WebUI.click(findTestObject('Object Repository/Page Checkout/btn_input_PayPal Express Checkout_place_order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page Checkout/p_Thank you. Your order has been received'), 'Thank you. Your order has been received.')

WebUI.click(findTestObject('Object Repository/Page Checkout/div_Thank you. Your order has been received_5b3152'))


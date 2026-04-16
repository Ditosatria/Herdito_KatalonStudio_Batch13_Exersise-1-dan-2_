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

WebUI.click(findTestObject('Object Repository/Page Checkout/btn_Shop'))

WebUI.click(findTestObject('Object Repository/Page Checkout/btn_Add to basket'))

WebUI.click(findTestObject('Object Repository/Page Checkout/a_Add to basket_1'))

WebUI.click(findTestObject('Object Repository/Page Checkout/span_2 items'))

WebUI.click(findTestObject('Object Repository/Page Checkout/btn_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_first_name'), firstname)

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_last_name'), lastname)

WebUI.setText(findTestObject('Object Repository/Page Checkout/input_Company Name_billing_company'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_email'), email)

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_phone'), phone)

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_address_1'), address)

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_city'), city)

WebUI.setText(findTestObject('Object Repository/Page Checkout/input__billing_postcode'), postcode)

select_radio = payment

switch (select_radio) {
    case 'Direct Bank Transfer':
        WebUI.click(findTestObject('Page Checkout/input__payment_method_bacs'))

        break
    case 'Check Payments':
        WebUI.click(findTestObject('Page Checkout/input_Direct Bank Transfer_payment_method'))

        break
    case 'Cash on Delivery':
        WebUI.click(findTestObject('Page Checkout/input_Check Payments_payment_method'))

        break //	case 'PayPal Express Checkout' :
        //	WebUI.click(findTestObject('Page Checkout/Input_PayPal'))
        //	break
    default:
        break
}

WebUI.click(findTestObject('Page Checkout/btn_input_PayPal Express Checkout_place_order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page Checkout/p_Thank you. Your order has been received'), 'Thank you. Your order has been received.')


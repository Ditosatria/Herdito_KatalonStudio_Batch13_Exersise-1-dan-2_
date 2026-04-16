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

WebUI.click(findTestObject('Page Login/btn_My Account'))

// Input login
WebUI.setText(findTestObject('Page Login/input__username'), username)

WebUI.setText(findTestObject('Page Login/input__password'), password)

// Klik login
WebUI.click(findTestObject('Page Login/input__login'))

// Cek apakah dashboard/menu muncul
boolean isDashboardVisible = WebUI.verifyElementPresent(findTestObject('Page Login/a_Sign out'), 0, FailureHandling.OPTIONAL)

// If else validasi
if (isDashboardVisible) {
    WebUI.comment('Login berhasil → masuk ke dashboard')

    WebUI.callTestCase(findTestCase('Blocks/Positive Case/Positive-Checkout/TC001-Checkout'), [('firstname') : firstname
            , ('lastname') : lastname, ('email') : email, ('phone') : phone, ('address') : address, ('city') : city, ('postcode') : postcode
            , ('payment') : payment], FailureHandling.STOP_ON_FAILURE)
} else {
    String errorMsg = WebUI.getText(findTestObject('Page Login/Txt_ValidasiLogin_Salah'))
}


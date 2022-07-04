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

WebUI.openBrowser(GlobalVariable.ats_url)

WebUI.maximizeWindow()

WebUI.delay(20)

WebUI.click(findTestObject('BASS-T831/click_ats_reset_password'))

WebUI.sendKeys(findTestObject('BASS-T831/input_ats_reset_password_email'), GlobalVariable.email)

WebUI.click(findTestObject('BASS-T831/click_ats_submit'))

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(switch_to_gmail)

WebUI.navigateToUrl(GlobalVariable.gmail_url)

WebUI.sendKeys(findTestObject('BASS-T831/input_gmail_email'), GlobalVariable.email)

WebUI.click(findTestObject('BASS-T831/click_gmail_next'))

WebUI.delay(20)

WebUI.sendKeys(findTestObject('BASS-T831/input_gmail_password'), GlobalVariable.password)

WebUI.click(findTestObject('BASS-T831/click_gmail_next'))

WebUI.click(findTestObject('BASS-T831/click_gmail_change_password_email'))

WebUI.click(findTestObject('BASS-T831/click_gmail_reset_password_button'))

WebUI.switchToWindowIndex(switch_to_sign_in)

WebUI.sendKeys(findTestObject('BASS-T831/input_ats_new_password'), new_password)

WebUI.sendKeys(findTestObject('BASS-T831/input_ats_confirm_new_password'), new_password)

WebUI.click(findTestObject('BASS-T831/click_ats_save'))

WebUI.delay(10)

WebUI.sendKeys(findTestObject('BASS-T831/input_ats_email'), GlobalVariable.email)

WebUI.sendKeys(findTestObject('BASS-T831/input_ats_password'), new_password)

WebUI.click(findTestObject('BASS-T831/click_ats_sign_in_button'))

WebUI.delay(30)

WebUI.switchToWindowIndex(switch_to_gmail)

WebUI.click(findTestObject('BASS-T831/click_gmail_back_emails'))

WebUI.rightClick(findTestObject('BASS-T831/click_gmail_change_password_email'))

WebUI.click(findTestObject('BASS-T831/click_gmail_delete_button'))

WebUI.delay(5)

WebUI.closeBrowser()


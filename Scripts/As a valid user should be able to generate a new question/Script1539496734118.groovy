import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.valuevision.com/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Page_Log In/input_Forgot your username_Use'), 'armita.azari')

WebUI.setEncryptedText(findTestObject('Page_Log In/input_Forgot your password_Pas'), 'P22/mDurbpKyiHjASiOuog==')

WebUI.click(findTestObject('Page_Log In/input_Stay signed in_btn btn-d'))

WebUI.click(findTestObject('Page_Release features/input_Fixed Bugs._submitButton'))

WebUI.click(findTestObject('Object Repository/Page_Outputs/a_Create New Question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create New Question/select_(select)custom catana t'), 'Technology', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create New Question/select_null(select)IT'), 'IT', true)

WebUI.click(findTestObject('Object Repository/Page_Create New Question/li_Select all_search-field'))

WebUI.click(findTestObject('Object Repository/Page_Create New Question/a_newtest_search-choice-close'))

WebUI.click(findTestObject('Object Repository/Page_Create New Question/li_Select all_search-field'))

WebUI.click(findTestObject('Object Repository/Page_Create New Question/li_Select all_search-field_1'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Question/textarea_QUESTION_QuestionView'), 'automation test question')

WebUI.click(findTestObject('Object Repository/Page_Create New Question/label_Text Box'))

WebUI.click(findTestObject('Object Repository/Page_Create New Question/input_ANSWER TYPES_QuestionVie'))

WebUI.click(findTestObject('Object Repository/Page_Create New Question/span_Save  Close_fi-save vv-fi'))

WebUI.click(findTestObject('Object Repository/Page_Data Inquiries/label_automation test question'))

WebUI.verifyTextPresent('automation test question', false)

WebUI.closeBrowser()


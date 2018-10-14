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

WebUI.callTestCase(findTestCase('Pages/Manage Outputs Page/User should view the manage outpus dashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Outputs/a_Create New Question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create New Question/select_(select)custom catana t'), '40', 
    false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create New Question/select_null(select)IT'), '184', false)

WebUI.setText(findTestObject('Object Repository/Page_Create New Question/textarea_QUESTION_QuestionView'), 'automation test question')

WebUI.click(findTestObject('Object Repository/Page_Create New Question/input_ANSWER TYPES_QuestionVie'))

WebUI.click(findTestObject('Object Repository/Page_Create New Question/span_Save  Close_fi-save vv-fi'))

WebUI.verifyTextPresent('automation test question', false)


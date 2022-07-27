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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Username_username'), 
    username)

WebUI.setText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Password_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    facility, true)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Medicare_programs'))

WebUI.setText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), 
    visitDate)

WebUI.setText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    comment)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/button_Book Appointment'))

switch (facility) {
    case 'Seoul CURA Healthcare Center':
        WebUI.verifyElementText(findTestObject('Make Appointment/Page_CURA Healthcare Service/p_Seoul CURA Healthcare Center'), 
            'Seoul CURA Healthcare Center')
        break
    case 'Hongkong CURA Healthcare Center':
        WebUI.verifyElementText(findTestObject('Make Appointment/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
            'Hongkong CURA Healthcare Center')
        break
    case 'Tokyo CURA Healthcare Center':
        WebUI.verifyElementText(findTestObject('Make Appointment/Page_CURA Healthcare Service/p_Tokyo CURA Healthcare Center'), 
            'Tokyo CURA Healthcare Center')
        break
}

switch (healthCareProgram) {
	case 'Seoul CURA Healthcare Center':
		WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/p_Medicare'),
			'Medicare')
		break
	case 'Hongkong CURA Healthcare Center':
		WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/p_Medicaid'),
			'Medicaid')
		break
	case 'Tokyo CURA Healthcare Center':
		WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/p_None'),
			'None')
		break
}

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/a_Logout'))

WebUI.closeBrowser()


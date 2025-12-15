import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginValid {


	@Keyword
	public void e2eLelangMobilku(String email, String password) {

		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
		WebUI.delay(20)

		//Input Username
		WebUI.setText(findTestObject('Object Repository/Login/01.inpByNameDynamic',[('input'):'email']), email)
		//Input Password
		WebUI.setText(findTestObject('Object Repository/Login/01.inpByNameDynamic',[('input'):'password']), password)

		WebUI.delay(10)  //Options Click Captcha Manual

		//Click Checkbox agreement
		WebUI.click(findTestObject('Object Repository/Login/03.inpByIdDynamic',[('text'):'remember_me']))

		WebUI.takeScreenshot()

		//Click Button Login
		WebUI.click(findTestObject('Object Repository/Login/04.btnMasuk'), FailureHandling.STOP_ON_FAILURE)

		//Verify Dashboard After successfully login
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/05.vrfDashboardIcon'), 0)
		WebUI.takeScreenshot()
		
		//Click Button Lelang
		WebUI.click(findTestObject('Object Repository/Login/06.btnLelang'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/07.vrfLelang'), 0)
		WebUI.takeScreenshot()
		
		//Logout
		WebUI.click(findTestObject('Object Repository/Login/08.btnKeluar'))
		WebUI.takeScreenshot()

	}
}

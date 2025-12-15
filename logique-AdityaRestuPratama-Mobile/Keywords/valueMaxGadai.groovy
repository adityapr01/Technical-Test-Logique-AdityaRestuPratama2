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

public class valueMaxGadai {
	
	
	@Keyword
	public void registerAccount(String email, String namaLengkap, String noHp, String password, String confirmPassword) {
		
		
		// Navigate To Register
		Mobile.takeScreenshot()
		Mobile.tap(findTestObject('Object Repository/android.widget.btnProfil'), 0)
		Mobile.tap(findTestObject('Object Repository/android.view.btnRegister'), 0)
        
		// Input Credentials Account
		Mobile.delay(10)

		// Tap elemen dan Clear (opsional) sebelum setText
		Mobile.tap(findTestObject('Object Repository/android.widget.fldEmail'), 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.fldEmail'), email, 0)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/android.widget.namaLengkap'), 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.namaLengkap'), namaLengkap, 0)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/android.widget.noHp'),0)
		Mobile.setText(findTestObject('Object Repository/android.widget.noHp'), noHp, 0)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/android.widget.fldPassword'), 0)
		Mobile.sendKeys(findTestObject('Object Repository/android.widget.fldPassword'), password)
		Mobile.hideKeyboard()
		

		// Lakukan scroll jika Confirm Password tidak terlihat
		Mobile.tap(findTestObject('Object Repository/android.widget.fldConfirmPassword'), 0)
		Mobile.sendKeys(findTestObject('Object Repository/android.widget.fldConfirmPassword'), confirmPassword)
		Mobile.hideKeyboard()
        
		Mobile.takeScreenshot()
        
		// Click Button Register
		Mobile.tap(findTestObject('Object Repository/android.view.btnDaftar'), 0)
		

	}
	
	@Keyword
	public void loginCredentials(String email, String password) {
		
		
		
	}
}



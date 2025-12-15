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

String apkPath = "C:\\Users\\user\\Katalon Studio\\logique-AdityaRestuPratama-Mobile\\Data Files\\gvm-staging.apk"
Mobile.startApplication(apkPath, false)

TestData excelData = findTestData('Data Files/register')

for(int i = 1; i <= excelData.getRowNumbers(); i++) {
	
	String email = excelData.getValue('email', i)
	String namaLengkap = excelData.getValue('namaLengkap', i)
	String noHp = excelData.getValue('noHp', i)
	String password = excelData.getValue('password', i)
	String confirmPassword = excelData.getValue('confirmPassword', i)
	
	
	//Login dengan Valid
	CustomKeywords.'valueMaxGadai.registerAccount'(email, namaLengkap, noHp, password, confirmPassword)
}


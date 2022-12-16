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

WebUI.navigateToUrl('https://idcs-161de36299974feca164235cfaf83303.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=QUJMFocBNTGZdG0FOuHfWxfly63KHGPq3Gd10TYG7JY&nonce=oGrPfKzbrRhIsXq3hAdj_OamgJ4s2o4NGS0ulsqVM2A&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=stg.utilities-cloud.oracleindustry.com&idcs_app_name=CCS-DEVC2411Rbcbd119603bb477995c47b5553ef4764_APPID&policyAppName=CCS-DEVC2411Rbcbd119603bb477995c47b5553ef4764_APPID&policyAppTenant=idcs-161de36299974feca164235cfaf83303&idcs_app_resource_url=https%3A%2F%2Fstg.utilities-cloud.oracleindustry.com%2Fc2411r%2Fdev%2Fccs%2Fweb%2Fcis.jsp%3Fdebug%3Dtrue&client_id=CCS-DEVC2411Rbcbd119603bb477995c47b5553ef4764WTSS_APPID&IDCS_CG_ENC=true&enc=ApTFpXNrxPz4AgAAvgIAABAgvgIAAKQCAAAQAOKi1ECfJAbwLkBerIt2xRkcUHmKdNBYERa_eUPtn7LawTNA4_wHtTOY3MWeVsrI9ALoZ44by2xpRbbFBXgJeh0MopIHmUlivpkGcA7_AmN3pgg_8OUQX2KcrueBqFMsRYUso-5x_YMqPNhsQaGofQy2l5Hx0aTv1JXCGY6q6mm0CdGcMtUccQhQz58vSeyjuoYb61UoyXwLy4thEXn6bTKQR-9levwIxCvSODBT4bUcSdUgm1jFwxcPCLZLod2SXdmn1yUoT5OOzyAEXSaFzZvpwwe6ro-PuKRDQY3UJ57fKtSMtc4SAPWWVIADZZTnQRtviYeHeSXqnjVQLS-h3Fs3le1Iu1Za3M0fh4j6x1CgwNpttqtYGbNGBASKdBB6RyJ_afeR_1ssC-4SSel1MgcOemuEEZg2mgjYUd6KwSafPbOY1n9smdRY6MMB8vNNjSrdCtxgopAYads0OrY3M0mft-Rck5D7cegEZBqm4GY52XFE07CAWv1Z8J36dP5Yj3TlpuhroFd27RDyyw_HQdCC8Id9e99JikJWP-jUFzhMRb6JHoCfoya26uW3sXuucOFr4yfLBSwVy7Jg3OmIiP9aih-dLM0XA2PsGNySFNVS9LhaPbZLiCWcWzBsO8D0ZUeXEIvrqoki6CQuIujYdR_PSDcHADTvzhdN8O2llj00gJk-K0-PYKVq80qxEfSP7sRZ5hFzSnWSygBnQbSQzCfGvW9c_DJy1cfXgJi9pSTXhJsv64igpTiaEDiVGcyIb9d3GYX1GYYcb1N4iaBjIKAlP_wjAKYQBxy_imAPSeRivuEqCjBqoIvDeKoYxxmVv-hBzzshxbe-Wjiiknd0u105Eh3Zmf4UMQdvfHd5gcnJa85wTbN-lymXl2YJDpvufwPxT0d_uOfKr_lIxC91gv1s8VftedlC6pdZ9fDCBvJtmMyBn5KKdsHSZ740213JvwXn1skSUZXNX-3xxuQ0V5UWItOt')

WebUI.setText(findTestObject('Object Repository/Page_Identity Cloud Service/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'juan.arreola@lcra.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Identity Cloud Service/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    'J2eY0sVE0K0uWppeolXItg==')

WebUI.takeScreenshotAsCheckpoint('LoginPage')


package com.packtFramework.applicationLib;


import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.packtFramework.genericLibrary.GenericLib;
import com.packtAutomationFramework.logResult.LogResult;
import com.packtFramework.pagefactory.GoogleSearchPage;

/**
 * GoogleSearch - Search text on Google page and verify title.
 * 
 * @author Raghavendra Prasad MG
 *
 */
public class GoogleSearch {

	private GenericLib objGenericLib = null;
	private WebDriver driver = null;
	GoogleSearchPage ObjGoogleSearchPage = null;
	
	/**
	 * Constructor.
	 * 
	 * @param wDriver
	 */
	public GoogleSearch(WebDriver wDriver){
		this.driver =  wDriver;
		objGenericLib = new GenericLib(driver);
		ObjGoogleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
	}	

	/**
	 * Search text on Google page.
	 * 
	 * @param dataParamList
	 * @return
	 * @throws Exception
	 */
	public boolean search(List<String> dataParamList) throws Exception {
		try {
			String sTestData = dataParamList.get(0);
			objGenericLib.setEditField(ObjGoogleSearchPage.getSearchTextfield(), sTestData);
			objGenericLib.objClick(ObjGoogleSearchPage.getSearchButton());
			return true;
		} catch (Exception e) {
			return false;
		}		
	}

	/**
	 * Verify specified title on the page.
	 * 
	 * @param dataParamList
	 * @return
	 * @throws Exception
	 */
	public boolean verifyTitle(List<String> dataParamList) throws Exception {
		StringBuffer verificationErrors = new StringBuffer();
		try {
			String sTestData = dataParamList.get(0);
			Thread.sleep(5000);
			Assert.assertEquals(sTestData, driver.getTitle());
			LogResult.pass(sTestData + " verified");
			return true;
		} catch (Error e) {
			verificationErrors.append(e.toString());
			LogResult.fail(dataParamList.get(0) + " verification failed");
			return false;
		}		
	}
}

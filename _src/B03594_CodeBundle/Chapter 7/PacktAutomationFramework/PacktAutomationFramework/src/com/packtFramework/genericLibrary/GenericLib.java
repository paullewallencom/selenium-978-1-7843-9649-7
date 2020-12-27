package com.packtFramework.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.packtAutomationFramework.logResult.LogResult;

/**
 * GenericLib - Building utilities for Selenium commands.
 * 
 * @author Raghavendra Prasad MG
 *
 */
public class GenericLib {
	private WebDriver driver = null;

	/**
	 * Constructor method to initialize webdriver.
	 * 
	 * @param wDriver
	 */
	public GenericLib(WebDriver wDriver){
		this.driver =  wDriver;
	}

	/**
	 * Click on element object.
	 *
	 * @param element
	 * @return
	 * @throws Exception
	 */
	public boolean objClick(WebElement element) throws Exception {
		try {
			if (element != null) {
				element.click();
				return true;
			}
			LogResult.fail("Element not found to click on element having xpath " + element);
			return false;
		} catch (Exception e) {
			LogResult.fail("Error occurred while clicking on element having xpath " + element);
			return false;
		}
	}

	/**
	 * Clear text from an input field and enter text using webelement.
	 *
	 * @param element
	 * @param sTextToEnter
	 * @return
	 * @throws Exception
	 */
	public boolean setEditField(WebElement element, String sTextToEnter) throws Exception {
		try {
			if (element != null) {
				element.clear();
				element.sendKeys(sTextToEnter);
				LogResult.pass("Text " + sTextToEnter + " has been entered successfully in webelement");
				return true;
			}
			LogResult.fail("Element not found to enter text '" + sTextToEnter + "'in element having xpath " + element);
			return false;
		} catch (Exception e) {
			LogResult.fail("Error occurred while entering text '" + sTextToEnter + "'in element having xpath " + element);
			return false;
		}
	}

	/**
	 * Close webdriver.
	 *
	 * @throws Exception
	 */
	public boolean closeDriver() throws Exception {
		try {
			driver.close();
			LogResult.pass("Closing driver");
			return true;
		} catch (Exception e) {
			LogResult.fail("Unable to close the driver.");
			return false;
		}
	}
}
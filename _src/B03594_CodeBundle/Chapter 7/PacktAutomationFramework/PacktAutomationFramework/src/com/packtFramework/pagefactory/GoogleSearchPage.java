package com.packtFramework.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * GoogleSearchPage - Creating page factory objects.
 * 
 * @author Raghavendra Prasad MG
 *
 */
public class GoogleSearchPage {
	//-------------------------------------
	//find element
	//-------------------------------------
	@FindBy(id="gbqfq")
	private WebElement searchTextfield;
	
	@FindBy(id="gbqfb")
	private WebElement searchButton;
	
	
	//-------------------------------------
	//get webelement
	//-------------------------------------
	/**
	 * Get SearchTextfield webelement.
	 * 
	 * @return searchTextfield
	 */
	public WebElement getSearchTextfield() {
		return searchTextfield;
	}
	
	/**
	 * Get searchButton webelement.
	 * 
	 * @return searchButton
	 */
	public WebElement getSearchButton() {
		return searchButton;
	}	
}

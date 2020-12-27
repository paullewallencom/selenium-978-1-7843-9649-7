package com.packtFramework.driverInitiator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.packtAutomationFramework.driverEngine.DriverEngine;

/**
 * DriverEngineInitiator - Create testNg class and instantiate DriverEngine class and run test cases.
 * 
 * @author Raghavendra Prasad MG
 *
 */
public class DriverEngineInitiator {

	/**
	 * TestNG test method.
	 * 
	 * @param url
	 * @throws Exception
	 */
	@Parameters({"url"})
	@Test
	public void testSetUp(String url) throws Exception {
		try{			
			//WebDriver engine object creation by passing the application URL from testNG
			DriverEngine driverEngine = new DriverEngine(url);
			System.out.println("Application url: " + url);
			
			//Execute testcases
			driverEngine.runTestcase();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

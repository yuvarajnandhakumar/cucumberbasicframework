package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.commonaction.CommonFunction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonFunction{
	
	
	CommonFunction ca = new CommonFunction();
	
	
	@Before //runs for each scenario
	public void launchbrowser() throws FileNotFoundException, IOException
	{
		ca.launch(ca.getpropertyfile("url"));
	}
	
	@After
	public void closebrowser()
	{
		ca.quitbrowser();
	}

}

package org.locators;

import org.commonaction.CommonFunction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocator extends CommonFunction{
	
	//locators are handled in each file for each module
	public LoginLocator()
	{
		PageFactory.initElements(CommonFunction.driver, this);
		
		//super - parent class access
		//this - current class
		//pagefactory- driver initialize
	}

	/*private int x=10; // pojo 

	public int getX() {
		return x;
	}*/
	
	//driver.findelement(by.xpath("//tagname[@attribute='value']"))
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[text()='Please enter valid Email ID/Mobile number']")
	private WebElement errormsg;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getErrormsg() {
		return errormsg;
	}
	
	
			
			
			
			

	
	

	
	
	
}

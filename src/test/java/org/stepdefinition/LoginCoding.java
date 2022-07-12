package org.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.commonaction.CommonFunction;
import org.locators.LoginLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCoding extends CommonFunction{
	
	CommonFunction co = new CommonFunction();
	LoginLocator lo = new LoginLocator();
	
	@Given("launch a browser")
	public void launch_a_browser() 
	{    
		//co.launch("http://flipkart.com");
		co.maximize();
	}

	@Then("user enter username")
	public void user_enter_username() {
		lo.getUsername().sendKeys("yuvaraj");
	    
	}

	@And("user enter password")
	public void user_enter_password() {
		co.insertText(lo.getPassword(), "123213");
   
	}


	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		co.enterbutton(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));

	}
	
	
	@Then("user enter username {string}")
	public void user_enter_username(String uname) {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(uname);

	}

	@And("user enter password {string}")
	public void user_enter_password(String pwd) 
	{
		co.insertText(lo.getPassword(), pwd);
	}
	
	@Given("enter some basic fun for all scenario")
	public void enter_some_basic_fun_for_all_scenario() {
	    System.out.println("user works on login functionality");
	}


	@When("user validates the login screen with userid or username")
	public void user_validates_the_login_screen_with_userid_or_username() {
		
		try
		{ 
			String data= driver.findElement(By.xpath("//span[text()='Please enter valid Email ID/Mobile number']")).getText();
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   
	}
	

	@Then("user enter username for onedimlist")
	public void user_enter_username_for_onedimlist(DataTable dataTable) {
	   
		List<String> asList = dataTable.asList();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(asList.get(1));

	}
	
	

	@Then("user enter password onedimmap")
	public void user_enter_password_onedimmap(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(asMap.get("pwd3"));

	}
	

}

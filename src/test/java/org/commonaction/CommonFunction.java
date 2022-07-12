package org.commonaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction {


	public static WebDriver driver;

	public void launch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public void maximize()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void insertText(WebElement ele, String value)
	{
		ele.sendKeys(value);
	}

	public void framehandlingxpath(WebElement ele)
	{
		driver.switchTo().frame(ele);
	}

	public void framehandlingid(int num)
	{
		driver.switchTo().frame(num);
	}

	public void enterbutton(WebElement ele)
	{
		ele.click();
	}

	public void quitbrowser() {
		driver.quit();		
	}



	public String getpropertyfile(String kk) throws FileNotFoundException, IOException
	{
		Properties o = new Properties();
		o.load(new FileInputStream(new File(".//target//logincredentials.properties")));
		String value = o.getProperty(kk);
		return value;
	}


}

package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commerical {
	WebDriver driver;
	
	 public  commerical(WebDriver driver) {
			this.driver=driver;
		}

	
	
	By Commerical= By.xpath("//div[@class='nb__RETEr']");
	By phone =By.id("signUp-phoneNumber");
	public WebElement Commerical1()
	{
		return driver.findElement(Commerical);
		
	}
	public WebElement phone1()
	{
		return driver.findElement(phone);
		
	}

}

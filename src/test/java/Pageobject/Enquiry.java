package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Enquiry {
WebDriver driver;
	
	
	public Enquiry(WebDriver driver) {
		this.driver=driver; 
	}
	
By enquiry=By.xpath("//a[@class='nb__2Im-D']");
By phone=By.id("userphone");
public WebElement enquiry1()
	{
		return driver.findElement(enquiry);
		
	}
public WebElement phone1()
{
	return driver.findElement(phone);
	
}
}

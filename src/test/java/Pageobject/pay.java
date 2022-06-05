package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pay {
	WebDriver driver;
	
	 public pay(WebDriver driver) {
			this.driver=driver;
		}

	
	
	By Pay= By.xpath("//div[@class='nb__3BKJW']");
	
	public WebElement Pay1()
	{
		return driver.findElement(Pay);
		
	}
	
}

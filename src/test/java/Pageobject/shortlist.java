package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shortlist {
WebDriver driver;
	
	
	public shortlist(WebDriver driver) {
		this.driver=driver;
	}
	
	By shortlists = By.id("//div[@class=\"nb__3S9sH\"]/div[3]/a/img");
	public WebElement shortlists1()
 	{
 		return driver.findElement(shortlists);
 		
 	}

}

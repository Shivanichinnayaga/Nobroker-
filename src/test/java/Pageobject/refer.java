package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class refer {
	
WebDriver driver;
	
	
	public refer(WebDriver driver) {
		this.driver=driver; 
	}
	
   By referbook = By.id("main-menu");
   By book=By.xpath("//div[@class='nb__3lEcy']/a[4]");
   public WebElement refer1()
	{
		return driver.findElement(referbook);
		
	}
   public WebElement book1()
	{
		return driver.findElement(book);
		
	}

}

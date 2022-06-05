package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class menubook {
WebDriver driver;
	
	
	public menubook(WebDriver driver) {
		this.driver=driver; 
	}
	
   By menu = By.id("main-menu");
   By paint=By.xpath("//div[@class='nb__3lEcy']/a[8]");
   By choose=By.xpath("//div[@class='nb__15qGH']/div[1]");
   public WebElement menu1()
	{
		return driver.findElement(menu);
		
	}
   public WebElement paint1()
	{
		return driver.findElement(paint);
		
	}
   public WebElement choose1()
	{
		return driver.findElement(choose);
		
		
		
	}
   
}

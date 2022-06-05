package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class buy {
WebDriver driver;
	
	
	public buy(WebDriver driver) {
		this.driver=driver; 
	}

	By Buy = By.xpath("//div[@class='nb__97yZw']/div[1]");
	By Homeloan=By.xpath("//div[@class='nb__3VrUU']/a[1]" );
     public WebElement buy1()
  	{
  		return driver.findElement(Buy);
  		
  	}
     public WebElement Homeloan1()
   	{
   		return driver.findElement(Homeloan);
   		
   	}

}

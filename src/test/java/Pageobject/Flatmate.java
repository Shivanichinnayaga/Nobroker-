package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flatmate {
	
	WebDriver driver;
	
	
	public Flatmate(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

     By Flat = By.xpath("//div[@class='nb__3um_l']/div[4]");
     
     By Bang=By.xpath("//div[@class='nb__41jqw']/div[1]/div[1]");
     
     public WebElement Flat1()
 	{
 		return driver.findElement(Flat);
 		
 	}
     public WebElement Bang1()
  	{
  		return driver.findElement(Bang);
  		
  	}
     

}

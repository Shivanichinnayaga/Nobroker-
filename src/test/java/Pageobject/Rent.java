package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rent {
WebDriver driver;
	
	
	public Rent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
   
	By renter=By.xpath("//div[@class=\"nb__3hTfc\"]/div[2]/div[1]");
	By emi =By.xpath("//div[@class=\"nb__97yZw\"]/div[2]/a[7]");
    public WebElement rents1()
 	{
 		return driver.findElement(renter);
 		
 	}
    public WebElement emi1()
 	{
 		return driver.findElement(emi);
 		
 	}
}

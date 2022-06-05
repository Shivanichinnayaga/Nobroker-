package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Aboutus {
	WebDriver driver;
	public Aboutus(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	By about= By.id("acRepairHomeTile");
	public WebElement about1()
	{
		return driver.findElement(about);
		
	}


}

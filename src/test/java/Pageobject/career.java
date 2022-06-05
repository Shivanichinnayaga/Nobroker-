package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class career {

	WebDriver driver;
	
	
	public career(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By careers= By.xpath("//div[@class='nb__2NgHI']/div[1]/a[1]");
	By textmsg=By.xpath("//div[@class=\"nb__1R41N\"]/div/h2");
	public WebElement career1()
 	{
 		return driver.findElement(careers);
 		
 	}
	public WebElement text1()
 	{
 		return driver.findElement(textmsg);
 		
 	}

}

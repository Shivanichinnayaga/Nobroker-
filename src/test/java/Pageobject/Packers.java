package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Packers {
WebDriver driver;
	
	
	public Packers(WebDriver driver) {
		this.driver=driver; 
	}

  By packer =By.id("pnmHomeTile");
  By head=By.xpath("//div[@class='nb__26XD-']/h2 ");
 
  public WebElement packer1()
	{
		return driver.findElement(packer);
		
	}
  public WebElement head1()
	{
		return driver.findElement(head);
		
	}
}

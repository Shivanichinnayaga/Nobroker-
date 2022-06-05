package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
	WebDriver driver;
		
		 public Menu(WebDriver driver) {
				this.driver=driver;
			}

		
		
		By menu= By.xpath("//span[@class='tooltip-trigger-text']");
		By click=By.xpath("//div[@class='heading-6 nb__3YrHu nb__3S6MT']");
		By pghostel=By.xpath("//a[@class='nb__1pJSa']");
		public WebElement menu1()
		{
			return driver.findElement(menu);
			
		}
		public WebElement menu2()
		{
			return driver.findElement(click);
			
		}
		public WebElement pghostel1()
		{
			return driver.findElement(pghostel);
			
			
			
		}

	}
	



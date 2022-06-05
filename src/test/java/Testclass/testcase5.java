package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Flatmate;

public class testcase5 {
	@Test
public void testcase5() throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nobroker.in/profile/myprofile");
		Flatmate fm = new Flatmate(driver);
		fm.Flat1().click();
		fm.Bang1().click();
		
		

}

}

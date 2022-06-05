package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Menu;

public class testcase1 {
	@Test
public void testcase1()  {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nobroker.in/profile/myprofile");
		Menu m = new Menu(driver);
		m.menu1().click();
		m.menu2().click();
		m.pghostel1().click();
		

}
	
}

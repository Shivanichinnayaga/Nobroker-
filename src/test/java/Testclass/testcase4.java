package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Aboutus;



public class testcase4 {
	@Test
public void testcase4() throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nobroker.in/profile/myprofile");
		Aboutus au=new Aboutus(driver);
		au.about1().click();
		Thread.sleep(2000);

}
}

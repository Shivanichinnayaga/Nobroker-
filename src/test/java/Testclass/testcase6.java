package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.buy;


public class testcase6 {
	@Test
public void testcase6() throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nobroker.in/profile/myprofile");
		buy b = new buy(driver);
		System.out.println(b.buy1().getText());
		Thread.sleep(2000);
		b.Homeloan1().click();

}
}
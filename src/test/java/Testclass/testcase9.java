package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Enquiry;

public class testcase9 {
	@Test
public void testcase9() throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nobroker.in/profile/myprofile");
        Enquiry e=new Enquiry(driver);
        e.enquiry1().click();
       
}
}

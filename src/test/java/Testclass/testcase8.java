package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.menubook;



public class testcase8 {
	@Test
public void testcase8() throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nobroker.in/profile/myprofile");
		menubook mb=new menubook(driver);
		mb.menu1().click();
		Thread.sleep(2000);
		mb.paint1().click();
		Thread.sleep(2000);
		System.out.println(mb.choose1().getText());
		
		

}
}

package utilities;

	import java.io.File;

import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Reusabilty.Parentclass;
import Reusabilty.helperclass;

public class Baseclass {
		
		public WebDriver driver;
		public Config co;
		public helperclass oc;
		public ExtentReports report;
		public ExtentTest log;
		
		
		
		@BeforeSuite
		public void start() throws Exception
		{
			co=new Config();
			oc=new helperclass();
			
			
			ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/extentreport.html"));
			report=new ExtentReports();
			report.attachReporter(extent);
			
			
		}
		
		@BeforeClass
		public WebDriver setup()
		{
			return driver= Parentclass.Application(driver, co.getBrowser(),co.getURL());
		}
		
		
		

		@AfterClass
		public void close() {
			Parentclass.quitBrowser(driver);
		}
		
		
		
		}


       



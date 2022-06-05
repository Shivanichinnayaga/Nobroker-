package utilities;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {
	@Test
	public void loginTest() throws IOException {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/reports.html");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		ExtentTest logger1 = extent.createTest("logintest");

		logger1.log(Status.INFO,"post your property");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		ExtentTest logger2 = extent.createTest("Flatmate");

		logger2.log(Status.INFO,"Bookshelf");

		logger2.log(Status.PASS, "Title verified");
		
		extent.flush();
		ExtentTest logger3 = extent.createTest("pay");
		logger1.log(Status.INFO,"Sale");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		ExtentTest logger4 = extent.createTest("aboutus");

		logger1.log(Status.INFO,"Contact us");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		ExtentTest logger5= extent.createTest("Enquriy");

		logger1.log(Status.INFO,"help");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		ExtentTest logger6 = extent.createTest("Buy");

		logger1.log(Status.INFO,"Decor");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		ExtentTest logger7 = extent.createTest("menubook");

		logger1.log(Status.INFO,"Storage");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		/*ExtentTest logger8 = extent.createTest("Giftcards test");

		logger1.log(Status.INFO,"Giftcards");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		ExtentTest logger9 = extent.createTest("Tvunits test");

		logger1.log(Status.INFO,"Tvunits");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();
		ExtentTest logger10 = extent.createTest("collection test");

		logger1.log(Status.INFO,"collection");

		logger1.log(Status.PASS, "Title verified");

		extent.flush();*/
		
	}

}

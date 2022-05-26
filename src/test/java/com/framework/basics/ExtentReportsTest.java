package com.framework.basics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsTest {
	
	//this is a demo for using ExtentReports
	
	//there are two types of ExtentReports and ExtentSparkReporter
	ExtentReports extent = new ExtentReports();
	@BeforeTest
	public void setup() {
		//extent spak reporter generates the report, hence we need to define the location to store the report
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		
		//having custom properties in the report using config method
		spark.config().setReportName("Farmework Basics");
		spark.config().setDocumentTitle("TestRunResults");
		
		//extentreports is the one which drives the and gathers the test execution
		

		//pass the reporter config to extent reports
		extent.attachReporter(spark);
		//adding tester name to the report
		extent.setSystemInfo("Tester", "Megharaj");
	}
	
	
	@Test
	public void test() {
		//we have to add the extent create test at the start of the test for the extent report to monitor the test
		extent.createTest("Test ExtentReport Demo");
		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void after() {
		
		//this line is used to notify extent reports that the test is executed and generate the report
		extent.flush();
	}

}

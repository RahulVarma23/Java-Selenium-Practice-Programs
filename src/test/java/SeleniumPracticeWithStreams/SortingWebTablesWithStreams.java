package SeleniumPracticeWithStreams;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SortingWebTablesWithStreams {
	
	WebDriver driver;
	@Test
	public void testSomeMethod() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}
	
	public void takeScreenshot(String methodName) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File SrcFile = tc.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(".//screenshot/"+ methodName+getDateTime()+".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public String getDateTime() {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy_hh-mm");
		String formattedDate = sf.format(date);
		return formattedDate;
	}
	

	@AfterMethod
    public void onTestFailure(ITestResult result) throws IOException {
		String methodName=result.getName().toString().trim();
		if(ITestResult.FAILURE == result.getStatus()) {
			takeScreenshot(methodName);
		}
		else if(TestResult.SUCCESS == result.getStatus()) {
			takeScreenshot(methodName);
		}	
    }
}

package SeleniumPracticeWithStreams;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Testing {

	public static void main(String[] args) throws IOException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.google.com/");

		driver.switchTo().frame("callout");

		driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();

		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[jsname='VlcLAe'] input[class='gNO89b']")));
		// Take screenshot of the element
		File screenshot = element.getScreenshotAs(OutputType.FILE);

		// Save the screenshot to a file
		// For example:
		 FileUtils.copyFile(screenshot, new File("element_screenshot.png"));

		driver.quit();
	}

}

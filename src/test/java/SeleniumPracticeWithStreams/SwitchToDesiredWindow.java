package SeleniumPracticeWithStreams;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SwitchToDesiredWindow {

	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		driver.findElement(By.cssSelector("a[title*=Twitter]")).click();
		String mainWindow = driver.getWindowHandle();
		Set <String> childWindow = driver.getWindowHandles();
		
		for(String window: childWindow) {
			
			String title = driver.switchTo().window(window).getTitle();
			
			if(title.contains("Twitter")) {
				driver.switchTo().window(window);
				break;
			}
			
		}
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	    Assert.assertTrue(driver.findElement(By.cssSelector("[role=banner]")).isDisplayed());
	}
}

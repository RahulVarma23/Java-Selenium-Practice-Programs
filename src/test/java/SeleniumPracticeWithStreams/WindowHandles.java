package SeleniumPracticeWithStreams;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.cssSelector("#tabButton")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		
//		for(String id : windowids) {
//			System.out.println(driver.switchTo().window(id).getCurrentUrl());
//		}
		
		windowids.stream().map(id -> driver.switchTo().window(id).getCurrentUrl()).forEach(System.out::println);
		
		driver.quit();
	}
}

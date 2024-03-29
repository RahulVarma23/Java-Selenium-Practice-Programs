package SeleniumPracticeWithStreams;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxWithStreams {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		//https://datatables.net/extensions/select/examples/initialisation/checkbox.html

		List<WebElement> checkBoxList =driver.findElements(By.cssSelector("td.select-checkbox"));
		
		checkBoxList.stream().forEach(ele->ele.click());
		
		driver.quit();
	}
}

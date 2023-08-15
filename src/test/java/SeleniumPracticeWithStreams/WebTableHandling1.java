package SeleniumPracticeWithStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling1 {

	public static void handleWebTable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	    String formattedLocator = String.format("//table[@id='example']/tbody/tr/td[%d]", EmployeeTableColumnIndex.NAME.getIndex());
	    List<WebElement> webelements =driver.findElements(By.xpath(formattedLocator));
	    List<String> columnValues= new ArrayList<String>();
	   
	   for(WebElement element : webelements) {
		   columnValues.add(element.getText());
	   }
	   
	   List<String> sortedColumnValues = columnValues.stream().sorted().collect(Collectors.toList());
	   Assert.assertEquals(columnValues, sortedColumnValues);
	   
	   driver.quit();
	}

	public static void main(String[] args) {
		handleWebTable();
	}
}

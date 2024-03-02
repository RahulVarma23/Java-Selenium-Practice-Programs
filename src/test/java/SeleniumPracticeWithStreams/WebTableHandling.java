package SeleniumPracticeWithStreams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void findTotalCasesPerContinent() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul_Varma/Desktop/website.html");
		List<WebElement> elements = driver.findElements(By.xpath("//table//tbody/tr/td[5]"));
		List<String> continents = elements.stream().map(ele -> ele.getText()).collect(Collectors.toList());

		for (int i = 0; i < continents.size(); i++) {
			String locator = "//table//tbody//td[text()='" + continents.get(i) + "']//preceding-sibling::td[3]";
			List<WebElement> elements1 = driver.findElements(By.xpath(locator));

			if (!map.containsKey(continents.get(i))) {
				int sum = elements1.stream().map(ele -> ele.getText().replace(",", ""))
						.mapToInt(Integer::parseInt).sum();
				map.put(continents.get(i), sum);
			}
		}
		System.out.println(map);
		driver.quit();
	}
	
	public static void findTotalCountriesPerContinent() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul_Varma/Desktop/website.html");
		List<WebElement> elements = driver.findElements(By.xpath("//table//tbody/tr/td[5]"));
		List<String> continents = elements.stream().map(ele -> ele.getText()).collect(Collectors.toList());

		for (String continent: continents) {
		   if(map.containsKey(continent)) {
			   map.put(continent, map.get(continent)+1);
		   }else {
			   map.put(continent, 1);
		   }
		}
		System.out.println(map);
		driver.quit();
	}

	public static void main(String[] args) {
		findTotalCountriesPerContinent();
	}
}

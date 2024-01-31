package SeleniumPracticeWithStreams;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println("No of links: "+linklist.size());
		
//		List <String > list = new ArrayList<String>();
//		
//		for (WebElement e : linklist) {
//			String url = e.getAttribute("href");
//			list.add(url);
//			//checkBrokenLink(url);
//		}
		
		List <String > list = linklist.stream().map(ele->ele.getAttribute("href")).collect(Collectors.toList());	
		list.parallelStream().forEach(e->checkBrokenLink(e));
	}
	
	public static void checkBrokenLink(String linkUrl){
		try {
			URL url = new URL (linkUrl);
			HttpURLConnection httpUrlConnection=(HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
				if(httpUrlConnection.getResponseCode() >= 400) {
					System.out.println(linkUrl+"-->"+" is a broken link");
				}else {
					System.out.println(linkUrl+"-->"+"Ok");
				}	
		} catch (Exception e) {
		}
	}

}

package SeleniumPracticeWithStreams;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void findBrokenLinks() throws MalformedURLException, InterruptedException {
		//WebDriver driver = getWebDriver();
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(browserOptions);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");

        driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		System.out.println("No of links: "+linklist.size());

//		for (WebElement e : linklist) {
//			String url = e.getAttribute("href");
//			checkBrokenLink(url);
//		}

		List <String > list = linklist.parallelStream().map(ele->ele.getAttribute("href")).collect(Collectors.toList());
		list.parallelStream().forEach(BrokenLinks::checkBrokenLink);
		driver.quit();
	}

	private static WebDriver getWebDriver() throws MalformedURLException {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("122.0");
		HashMap<String, Object> ltOptions = new HashMap<>();
		ltOptions.put("username", "rahulvarma411");
		ltOptions.put("accessKey", "oTVInU44yRi8Rg8GsLy9SkEW7K79TQgO4cMLWPFmfNVBQ1QyxI");
		ltOptions.put("project", "Sample Test");
		ltOptions.put("selenium_version", "4.11.0");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);

        return new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
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
            e.printStackTrace();
		}
	}
}

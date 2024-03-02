package SeleniumPracticeWithStreams;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverWithJava8 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
	//1.
//		List <String> collectList = 
//		linklist.stream().filter(ele->!ele.getText().equals("")).map(ele->ele.getText()).collect(Collectors.toList());
//		collectList.forEach(ele -> System.out.println(ele));
		
		
		//2.
//		String firstText = linklist.stream().filter(ele->!ele.getText().equals("")).findFirst().get().getText();
//		System.out.println(firstText);

	
	    //3.
//		List <String> collect = linklist.stream()
//		.filter(ele-> !ele.getText().equals("") && ele.getText().contains("Amazon"))
//		.map(ele->ele.getText()).collect(Collectors.toList());
//		collect.forEach(ele->System.out.println(ele ));
		
		//4.
//		List<String>allLinkTextList =linklist.stream()
//		.filter(ele-> !ele.getText().isEmpty())
//		.filter(ele -> !ele.getText().startsWith(" "))
//		.map(ele->ele.getText().trim())
//		.collect(Collectors.toList());
//		
//		allLinkTextList.forEach(ele->System.out.println(ele));
		
		//5.
		
		long workingLinks = linklist.stream().filter(e-> e.getAttribute("href") != null).count();
		
		System.out.println(workingLinks);
		driver.quit();
	}
}

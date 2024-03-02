package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandleTootTip {
	
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jitesh_kumaradesara\\workspace\\Assessment1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://demoqa.com/tool-tips"); 
			driver.manage().window().maximize();
			testWidget(driver);
			
			
		} catch (Exception ex) {
			System.out.println("Exception occured: " + ex.getMessage());
		} finally {
			driver.quit();
		}
	}

	private static void testWidget(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement hoverMeButton = driver.findElement(By.id("toolTipButton"));
		WebElement hoverMeTextBox = driver.findElement(By.id("toolTipTextField"));
		
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		action.moveToElement(hoverMeButton).perform();
		String inputText = hoverMeButton.getAttribute("title");
		
		
		//Thread.sleep(2000);
//		WebElement toolTip = driver.findElement(By.className("tooltip-inner"));
//		String inputText=toolTip.getText();
		
		System.out.println(inputText);
		
		Thread.sleep(2000);
		hoverMeTextBox.sendKeys(inputText);
		
	
		
	}
		
		
		
	}
	
	



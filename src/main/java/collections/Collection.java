package collections;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Collection {
	public static void main(String[] args) throws InterruptedException {
		
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");	
    Date date = new Date(); 
    String desiredDate = formatter.format(date).toString().toUpperCase();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.redbus.in/bus-tickets/pune-to-mumbai?fromCityName=Pune&fromCityId=130&toCityName=Mumbai&toCityId=462&onward=18-Sep-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("i[class*=close]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Fare']")).click();
	
	String price = driver.findElement(By.xpath("//*[@id='result-section']//li[@id='15240267']//div[@class='travels lh-24 f-bold d-color']/parent::div/following::span[3]")).getText();	
	System.out.println(price);
	driver.quit();
	}
}

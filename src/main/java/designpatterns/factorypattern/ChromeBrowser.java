package designpatterns.factorypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements Browser {
    @Override
    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}

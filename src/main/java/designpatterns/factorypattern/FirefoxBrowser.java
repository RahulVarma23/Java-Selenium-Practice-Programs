package designpatterns.factorypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements  Browser{
    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}

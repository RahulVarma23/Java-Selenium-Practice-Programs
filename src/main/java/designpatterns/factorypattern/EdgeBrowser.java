package designpatterns.factorypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowser implements Browser {


    @Override
    public WebDriver getDriver() {
        return new EdgeDriver();
    }


}

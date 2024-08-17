package designpatterns.factorypattern;

public class Test {

    public static void main(String[] args) {
        Browser driver = BrowserFactory.getBrowser("firefox");
        driver.getDriver().get("https://www.google.com");
    }
}

package designpatterns.factorypattern;

public class BrowserFactory {

    public static Browser getBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeBrowser();

            case "firefox":
                return new FirefoxBrowser();

            case "edge":
                return new EdgeBrowser();

            default:
                return new ChromeBrowser();
        }
    }
}

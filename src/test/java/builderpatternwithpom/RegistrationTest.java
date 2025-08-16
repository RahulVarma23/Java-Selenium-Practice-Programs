package builderpatternwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    }

    @Test
    public void userRegTest() {
        Registration registration = new Registration.RegistrationBuilder()
                .setFirstName("ramesh")
                .setLastName("pawar")
                .setEmail("fhbf@gmail.com")
                .setPassword("xyz")
                .setTelephone("12345667")
                .setConfirmPassword("xyz")
                .build();
        RegistrationPage reg = new RegistrationPage(driver);
        reg.userRegistration(registration);
        System.out.println("test passed...");
    }

    @AfterTest
    public void tearDown() {
       driver.quit();
    }
}

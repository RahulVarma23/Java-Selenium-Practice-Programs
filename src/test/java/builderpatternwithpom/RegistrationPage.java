package builderpatternwithpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationPage {
    WebDriver driver;

    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirmPassword = By.id("input-confirm");

    public RegistrationPage (WebDriver driver) {
        this.driver = driver;
    }

    public void userRegistration(Registration registration) {
        driver.findElement(firstName).sendKeys(registration.firstName);
        driver.findElement(lastName).sendKeys(registration.lastName);
        driver.findElement(email).sendKeys(registration.email);
        driver.findElement(telephone).sendKeys(registration.telephone);
        driver.findElement(password).sendKeys(registration.password);
        driver.findElement(confirmPassword).sendKeys(registration.confirmPassword);
    }





}

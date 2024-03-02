package demo1;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class FetchOtpTest {

    String apiKey = "bfObx8kV2XRKDAPq1pyqq7odNXdAMU52";
    String serverId = "aw0nl3fi";
    String serverDomain = "aw0nl3fi.mailosaur.net";

    public String getRandomEmail(){
        return "user" + System.currentTimeMillis()+ "@"+serverDomain;
    }

    @Test
    public void fetchOtpFromEmail() throws MailosaurException, IOException {

        String emailId = getRandomEmail();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.groww.in/login");
        driver.findElement(By.id("login_email1")).sendKeys(emailId);
        driver.findElement(By.xpath("//span[text()='Continue']")).click();


        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentTo(emailId);

        Message message = mailosaur.messages().get(params, criteria);

        String subject = message.subject();
        System.out.println(subject);

        String otp = subject.substring(subject.lastIndexOf(" ")+1);
        System.out.println(otp);

        driver.findElement(By.id("signup_otp1")).sendKeys(otp);



    }
}

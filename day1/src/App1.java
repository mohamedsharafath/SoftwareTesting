import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App1 {
    public static void main(String[]args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\day1\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.linkedin.com/signup");
        driver.manage().window().maximize();

        WebElement mail=driver.findElement(By.name("email-or-phone"));
        WebElement pass=driver.findElement(By.name("password"));
        WebElement join=driver.findElement(By.id("join-form-submit"));

        mail.sendKeys("sms@gmail.com");
        pass.sendKeys("1234@Abcd");
        join.click();

        WebElement fname=driver.findElement(By.name("first-name"));
        WebElement lname=driver.findElement(By.name("last-name"));
        WebElement btn=driver.findElement(By.id("join-form-submit"));

        fname.sendKeys("Momo");
        lname.sendKeys("Sara");
        btn.click();

        Thread.sleep(1000);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='challenge-dialog']/div/section/div/div/iframe")));
        WebElement phone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='register-verification-phone-number']")));
        phone.sendKeys("9894057433");
        
    }
}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\gmeet_automation\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://meet.google.com");
        // int timeout=10;
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement signin=driver.findElement(By.partialLinkText("Sign in"));
        signin.click();

        // Thread.sleep(2000);
        WebElement email=driver.findElement(By.xpath("//*[@id='identifierId']"));
        email.sendKeys("727722eucd023@skcet.ac.in");
        WebElement emailnxt=driver.findElement(By.xpath("//*[@id='identifierNext']/div/button"));
        emailnxt.click();
        // Thread.sleep(2000);
        
        WebElement pass=driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
        pass.sendKeys("skcet@2004");
        WebElement passnxt=driver.findElement(By.xpath("//*[@id='passwordNext']/div/button"));
        passnxt.click();
        // Thread.sleep(3000);

        WebElement meetcode=driver.findElement(By.xpath("//*[@id='i8']"));
        // meetcode.sendKeys("bmo-xizi-syq");
        meetcode.sendKeys("zxy-jwtc-nwp");
        // Thread.sleep(1000);
        WebElement meetjoin=driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[5]/div[1]/div/div/div[1]/div[3]/div/div[2]/div[2]/button"));
        meetjoin.click();
        // Thread.sleep(5000);
        WebElement meetpermallow=driver.findElement(By.xpath("//*[@id='yDmH0d']/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/button"));
        WebElement meetpermavoid=driver.findElement(By.xpath("//*[@id='yDmH0d']/div[3]/div[2]/div/div/div/div/div[2]/div/div[2]/button"));
        meetpermallow.click();
        // Thread.sleep(2000);
        WebElement audio=driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div[26]/div[3]/div/div[2]/div[4]/div/div/div[1]/div[1]/div/div[7]/div[1]/div/div/div[1]"));
        audio.click();
        WebElement video=driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div[26]/div[3]/div/div[2]/div[4]/div/div/div[1]/div[1]/div/div[7]/div[2]/div/div[1]"));
        video.click();

        
        WebElement asktojoin=driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/div[26]/div[3]/div/div[2]/div[4]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/button"));
        asktojoin.click();



    }
}

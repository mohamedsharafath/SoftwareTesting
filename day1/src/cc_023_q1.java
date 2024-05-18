import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cc_023_q1 {
    public static void main(String[] args) throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\day1\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/emailsignup/");
        // driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement mobile_mail=driver.findElement(By.name("emailOrPhone"));
        WebElement fname=driver.findElement(By.name("fullName"));
        WebElement uname=driver.findElement(By.name("username"));
        WebElement pass=driver.findElement(By.name("password"));
        
        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        
        
        
        mobile_mail.sendKeys("8072753052");  
        fname.sendKeys("Sharafath");  
        uname.sendKeys("sharafath791");  
        pass.sendKeys("Cc_023_q1");

        Thread.sleep(2000);

        submit.click(); 
        
        Thread.sleep(10000);

        
        driver.quit();
    }
}

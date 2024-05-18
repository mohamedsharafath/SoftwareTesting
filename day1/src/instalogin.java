import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instalogin {
    private static final CharSequence password = "shara_fath.s";
    private static final CharSequence username = "shara_fath10";














    public static void main(String args[]) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\day1\\src\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(1000);
        WebElement uname=driver.findElement(By.name("username"));
        WebElement pass=driver.findElement(By.name("password"));

        uname.sendKeys(username);
        pass.sendKeys(password);
        
        WebElement btn=driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]/button"));
        btn.click();
    }  
}

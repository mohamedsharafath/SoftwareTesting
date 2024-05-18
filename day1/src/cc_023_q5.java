import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cc_023_q5 {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\day1\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();

        WebElement fname = driver.findElement(By.name("firstname"));
        WebElement lname = driver.findElement(By.name("lastname"));
        WebElement email = driver.findElement(By.name("reg_email__"));
        WebElement pass = driver.findElement(By.name("reg_passwd__"));
        WebElement day  = driver.findElement(By.name("birthday_day"));
        WebElement month = driver.findElement(By.name("birthday_month"));
        WebElement year = driver.findElement(By.name("birthday_year"));
        WebElement rbtn = driver.findElement(By.xpath("//input[@value=2]"));
    


        
        WebElement btn = driver.findElement(By.cssSelector("button[type='submit']"));
        fname.sendKeys("Mohamed");
        Thread.sleep(500);
        lname.sendKeys("Sharafath");
        Thread.sleep(500);
        email.sendKeys("8072753052");
        Thread.sleep(500);
        pass.sendKeys("momo1234");
        Thread.sleep(500);
        day.sendKeys("8");
        Thread.sleep(500);
        
        Select option = new Select(month);
        Thread.sleep(500);
        option.selectByVisibleText("Oct");
        Thread.sleep(500);
        year.sendKeys("2004");
        
        Thread.sleep(500);
        rbtn.click();
        
        Thread.sleep(1500);
        btn.click();





        


    }
}



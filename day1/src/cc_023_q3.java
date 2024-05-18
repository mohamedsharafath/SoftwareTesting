import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cc_023_q3 {
    public static void main(String args[]) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\day1\\src\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        // driver.manage().window().maximize();

        WebElement DateInput = driver.findElement(By.id("datepicker"));
        DateInput.click();

        WebElement Month = driver.findElement(By.className("ui-datepicker-month"));
        String MonthData = Month.getText();

        WebElement Year = driver.findElement(By.className("ui-datepicker-year"));
        String YearData = Year.getText();

        String destyear="2012";
        String destmonth="December";

        while(!(MonthData.equals(destmonth) && YearData.equals(destyear)))
        {
            // WebElement next = driver.findElement(By.xpath("//a[@data-handler='next']"));
            WebElement prev=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span"));
            
            // next.click();
            prev.click();
            // Thread.sleep(100);
            Month = driver.findElement(By.className("ui-datepicker-month"));
            MonthData = Month.getText();
            Year = driver.findElement(By.className("ui-datepicker-year"));
            YearData = Year.getText();
        }

        WebElement day = driver.findElement(By.xpath("//td[@data-handler='selectDay']//a[text()='12']")); 
        day.click();
        Thread.sleep(15000);
        driver.quit();
    }
    
}

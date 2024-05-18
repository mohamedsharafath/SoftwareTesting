import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cc_023_q2 {
    public static void main(String args[]) throws InterruptedException
    {
        
        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\day1\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
            driver.manage().window().maximize();
    
            String parent = driver.getWindowHandle();
            Thread.sleep(2000);
            WebElement btn = driver.findElement(By.id("newWindowBtn"));
            btn.click();
    
            Set<String> windows = driver.getWindowHandles();
    
            System.out.println("Parent : " + parent);
            System.out.println(windows.size());
    
            for(String window : windows) {
                if (!window.equals(parent)) {
                    driver.switchTo().window(window);
                    
                    WebElement firstName = driver.findElement(By.id("firstName"));
                    firstName.sendKeys("Sharafath");
                    Thread.sleep(1000);
                    WebElement mail = driver.findElement(By.name("email"));
                    mail.sendKeys("Shara@gmail.com");
                    Thread.sleep(1000);
                    WebElement password = driver.findElement(By.id("password"));
                    password.sendKeys("shaa150705");
                    Thread.sleep(7000);
                    
                    String newWindowTitle = driver.getTitle();
                    System.out.println("New window title: " + newWindowTitle);
                    
                    driver.close();
                }
    
                System.out.println(window);
            }
    
            driver.switchTo().window(parent);
            
            WebElement nameInput = driver.findElement(By.id("name"));
            nameInput.sendKeys("Sharafath");
            Thread.sleep(3000);
    }
}


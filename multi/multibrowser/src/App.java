import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class App {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=null;
        
        
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Browser type:" );
        String b=sc.nextLine();
        switch (b.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\multi\\multibrowser\\src\\chromedriver.exe");
                 driver=new ChromeDriver();
                break;
        
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\multi\\multibrowser\\src\\geckodriver.exe");
                driver=new FirefoxDriver();
                break;
        
            case "edge":
                System.setProperty("webdriver.edge.driver", "D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\multi\\multibrowser\\src\\msedgedriver.exe");
                driver=new EdgeDriver();
                break;
        
            default:
            System.out.println("Enter valid browser");
            System.exit(1);
        }
        driver.get("https://skcet.amypo.com/login");
        Thread.sleep(2000);
        driver.quit();

    }
}
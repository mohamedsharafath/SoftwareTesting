public class validators {
    
}


WebElement firstname=findElement(By.name("firstname"));//findele->inbuild fucn

what is webelemnt
going to find etho element by id or name or something



how to pass data:-
by use repository

firstname.sendKeys("kavi");

using sendkeys u can pass data.
WebElement btn=driver.findElement(By.name("button"));
btn.click();


|
|
|
\/
vs code

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","D:\\selenium1\\day1first\\src\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(10000);
        driver.close();
    }
}
app.java(older)





------------------
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\day1first\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.instagram.com/accounts/emailsignup/");
        driver.manage().window().maximize();

        Thread.sleep(1000); 
        WebElement mobilenumber = driver.findElement(By.name("emailOrPhone"));
        Thread.sleep(2000); 
        WebElement fullName = driver.findElement(By.name("fullName"));
        Thread.sleep(2000); 
        WebElement username = driver.findElement(By.name("username"));
        Thread.sleep(2000); 
        WebElement pass = driver.findElement(By.name("password"));

        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));


        mobilenumber.sendKeys("1234567890");
        
        fullName.sendKeys("Hemnavitha"); 
        
        username.sendKeys("Kavi@123#05"); 
        
        pass.sendKeys("Kavimo@123"); 

        submit.click();
        Thread.sleep(5000);
        driver.quit();

        
    }
}

--------------------
iframe

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.linkedin.com/signup");
        driver.manage().window().maximize();
        WebElement mail = driver.findElement(By.name("email-or-phone"));
        WebElement pass=driver.findElement(By.name("password"));
        WebElement sub = driver.findElement(By.id("join-form-submit"));
        Thread.sleep(2000);
        mail.sendKeys("jera2005@gmail.com");
        Thread.sleep(2000);
        pass.sendKeys("kavikavi12345@");
        sub.click();

        WebElement fname=driver.findElement(By.name("first-name"));
        WebElement lname=driver.findElement(By.name("last-name"));
        WebElement btn =driver.findElement(By.id("join-form-submit"));
        Thread.sleep(2000);
        fname.sendKeys("Jeya");
        Thread.sleep(2000);
        lname.sendKeys("Prema");
        btn.click();
        
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='challenge-dialog']/div/section/div/div/iframe")));
        WebElement phone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='register-verification-phone-number']")));
        phone.sendKeys("8072753052"+Keys.ENTER);


        
    }
}


<input type="text" maxlength="50" id="ap_customer_name" autocomplete="name" placeholder="First and last name" name="customerName" tabindex="1" class="a-input-text a-span12 auth-autofocus auth-required-field">

<input type="email" maxlength="64" id="ap_email" autocomplete="email" name="email" tabindex="3" class="a-input-text a-span12 a-spacing-micro auth-required-field auth-require-claim-validation" data-validation-id="email">

<input type="password" maxlength="1024" id="ap_password" autocomplete="new-password" placeholder="At least 6 characters" name="password" tabindex="5" class="a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation">

<input type="password" maxlength="1024" id="ap_password_check" autocomplete="new-password" name="passwordCheck" tabindex="6" class="a-input-text a-span12 auth-required-field auth-require-fields-match">

<input id="continue" tabindex="8" class="a-button-input" type="submit" aria-labelledby="auth-continue-announce">
<input type="text" maxlength="50" id="ap_customer_name" autocomplete="name" placeholder="First and last name" name="customerName" tabindex="1" class="a-input-text a-span12 auth-autofocus auth-required-field a-form-error">


---------
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
public class App {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Drhf_sign_in&openid.assoc_handle=usflex");

        driver.manage().window().maximize();
        WebElement name=driver.findElement(By.name("customerName"));
        WebElement mail = driver.findElement(By.name("email"));
        WebElement pass=driver.findElement(By.name("password"));
        WebElement passcheck=driver.findElement(By.name("passwordCheck"));
        WebElement sub = driver.findElement(By.id("continue"));
        Thread.sleep(2000);
        name.sendKeys("Kavitha_jera");
        Thread.sleep(2000);
        mail.sendKeys("jera20056@gmail.com");
        Thread.sleep(2000);
        pass.sendKeys("kavikavi123456@");
        passcheck.sendKeys("kavikavi123456@");
        sub.click();        
    }
}

(amazonsignup)

------------------

Instagram login page

--
<input aria-label="Phone number, username or email address" aria-required="true" autocapitalize="off" autocorrect="off" maxlength="75" class="_aa4b _add6 _ac4d _ap35" dir="" type="text" value="" name="username">

<input aria-label="Password" aria-required="true" autocapitalize="off" autocorrect="off" class="_aa4b _add6 _ac4d _ap35" type="password" value="" name="password">
819087


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.instagram.com/");
        
        driver.manage().window().maximize();

        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));

        usernameField.sendKeys("je_thra");
        passwordField.sendKeys("jerakavi_");

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='loginForm']/div/div[3]/button")));

        loginButton.click();

        Thread.sleep(7000);
        driver.quit();
    }
}
----------------




import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class App {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\day1first\\src\\chromedriver.exe");

        WebDriver driver2 = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
       // WebDriver driver2 = driver;
        driver2.get("https://www.instagram.com/accounts/emailsignup/");
        Thread.sleep(3000);
        driver2.navigate().to("https://skcet.amypo.com/login");
        driver2.get("https://skcet.amypo.com/login");
        Thread.sleep(3000);
        WebElement mail = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/input"));
        mail.sendKeys("727722eucd020@skcet.ac.in");
        WebElement pass = driver.findElement(By.id("passwordInput"));
        pass.sendKeys("727722eucd020@skcet.ac.in");
        
        Thread.sleep(2000);
         
      //   driver2.get("https://www.instagram.com/accounts/emailsignup/");
     //    String b=driver.getTitle();
       // Thread.sleep(2000);
       //String a=driver.getTitle();
       // WebElement link=driver.findElement(By.partialLinkText("Forgotten"));
      // WebElement link=driver.findElement(By.partialLinkText("Conditions"));
      // WebElement link=driver.findElement(By.linkText("Privacy Notice"));
       
       //Thread.sleep(2000);
       // link.click();
       // Thread.sleep(2000);
       //System.out.println(a);
      // boolean eq=driver.equals(driver2);
    //   System.out.println(a+" "+b);
      // System.out.println("Are the driver 1 equal to driver 2?"+eq);
       // driver.quit();
        driver2.quit();
    }
}


----------------

navigate from insta to amypo an login

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\day1first\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/accounts/emailsignup/");


        driver.navigate().to("https://skcet.amypo.com/login");

        @SuppressWarnings("unused")
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Thread.sleep(2000);
        WebElement cookieBanner = driver.findElement(By.id("acceptCookiesButton"));
        cookieBanner.click();
        
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/input"));
        email.sendKeys("727722eucd020@skcet.ac.in");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("passwordInput"));
        password.sendKeys("22csd021");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/div[3]/button"));
        loginButton.click(); 

    }
}

------------------
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\day1first\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        WebElement link=driver.findElement(By.partialLinkText("Conditions"));
        Thread.sleep(2000);
        link.click();
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement link1=driver.findElement(By.linkText("Privacy Notice"));
        link1.click();
        Thread.sleep(2000);
        driver.quit();
        
    }
}


-----------------------------
validation of Instagram login page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\day1first\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        String title="Instagram";
        String orginaltitle = driver.getTitle();
        if(orginaltitle.equals(title)){
            System.out.println("Testcases passed. Title is equal");
        }
        else{
            System.out.println("Testcases failed. Title is not equal");
        }
        
        WebElement Emailbox=driver.findElement(By.name("username"));
        if(Emailbox.isDisplayed())
        {
            System.out.println("Testcases passed. Emailbox is displayed");
        }
        else{
            System.out.println("Testcases failed. Emailbox is not displayed");
            
        }
        
        WebElement passwordbox=driver.findElement(By.name("password"));
        if(passwordbox.isDisplayed())
        {
            System.out.println("Testcases passed. passwordbox is displayed");
        }
        else{
            System.out.println("Testcases failed. passwordbox is not displayed");
            
        }
        WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
        if(loginbtn.isDisplayed())
        {
            System.out.println("Testcases passed. Loginbtn is displayed");
        }
        else{
            System.out.println("Testcases failed. Loginbtn is not displayed");
            
        }
        Thread.sleep(2000);
        driver.quit();
        
        
    }
}
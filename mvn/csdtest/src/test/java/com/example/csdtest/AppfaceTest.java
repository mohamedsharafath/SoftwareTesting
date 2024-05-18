package com.example.csdtest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppfaceTest {
    WebDriver driver;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver","D:\\COMPUTER_SCIENCE\\SOFTWARETESTING\\day1\\src\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
    public void gettitle(){
        driver.get("https://www.facebook.com/login");
        Assert.assertEquals("Log in to Facebook", driver.getTitle());


    }
    @Test
    public void test() throws InterruptedException{
        driver.get("https://www.facebook.com/login");
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.name("email")).isDisplayed());
    }

    
    @After
    public void close(){
        driver.quit();
    }
}


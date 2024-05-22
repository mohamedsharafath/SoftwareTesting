package com.example.chatgpt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App 
{
    private static WebDriver driver;
    private static Wait wait;
    public static void main( String[] args ) throws FileNotFoundException, IOException, InterruptedException, SessionNotCreatedException
    {
        final String EXECUTABLE_PATH = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        final String USER_DATA_DIR = "C:\\Users\\Fast\\AppData\\Local\\Google\\Chrome\\User Data";
        final String PROFILE_DIRECTORY = "Default";

        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        ChromeOptions options = new ChromeOptions();
        options.setBinary(EXECUTABLE_PATH);
        options.addArguments("--user-data-dir=" + USER_DATA_DIR);
        options.addArguments("--profile-directory=" + PROFILE_DIRECTORY);
        

        driver = new ChromeDriver(options);
        driver.get("https://github.com/");
        Thread.sleep(5000);
        driver.quit();
        

        
        
        // String path="D:/COMPUTER_SCIENCE/SOFTWARETESTING/SoftwareTesting/chatgpt_automation/sheet/questions.xlsx";
        // App ob=new App();
        // ob.read(path);

    }
    
    public void read(String path) throws EncryptedDocumentException, IOException
    {
        FileInputStream inp=new FileInputStream(path);
        Workbook work=WorkbookFactory.create(inp);
        Sheet sheet=work.getSheetAt(0);
        for(int i=21;i<sheet.getLastRowNum();i++)
        {
            String question="";
            int mark=0;
            for(int j=1;j<sheet.getRow(i).getLastCellNum();j++)
            {
                if(sheet.getRow(i).getCell(j).getCellType()==CellType.STRING)
                {
                    // System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"\t");
                    question=sheet.getRow(i).getCell(j).getStringCellValue();
                }
                else{
                    mark=(int)sheet.getRow(i).getCell(j).getNumericCellValue();
                    // System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+"\t");
                }

            }
            String prompt=question+" Answer for "+mark+" mark question";
            System.out.println(prompt);
            App ob=new App();
            ob.sendPrompt(prompt);
            // System.out.println(Integer.toString(mark));
        }
        
    }
    private void sendPrompt(String prompt) {
        
        By textareaLocator = By.id("prompt-textarea");
        By submitButtonLocator = By.cssSelector("button[data-testid=send-button]");

        driver.findElement(textareaLocator).sendKeys(prompt);
        driver.findElement(submitButtonLocator).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(submitButtonLocator));

        wait.until(ExpectedConditions.presenceOfElementLocated(submitButtonLocator));


    }
}

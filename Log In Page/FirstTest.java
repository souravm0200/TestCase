package co.sqat.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver","C:\\Users\\HP\\Downloads\\Selenium setup\\Exe files\\geckodriver-v0.32.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://127.0.0.1/portal-master/views/login.php");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.name("submit"));
        
        username.sendKeys("sourav");
        password.sendKeys("12345");
        login.click();
        
        String at = "http://127.0.0.1/portal-master/views/Dashboard.php";
        String et = driver.getCurrentUrl();       
        if(at.equalsIgnoreCase(et))
        {
        	System.out.println("Test Successful");
        	
        	
        }
        else
        {
        	System.out.println("Test Failed");
        }
        
        
        
	}

}

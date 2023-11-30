package com.demo.MavenProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;


public class MsDynamicsAutomation {

	public static void main(String[]args) throws InterruptedException  {
		
		System.setProperty("webDriver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\drivers\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		//driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dynamics.microsoft.com/en-us/dynamics-365-free-trial/");
		
   
		 WebElement alertButton = driver.findElement(By.xpath("//div[@class='link-area'][2]"));
	        alertButton.click();
	        
//	        Alert alert = driver.switchTo().alert();
//	        
//	        alert.accept();
//	        
	        
	        WebElement saleButton = driver.findElement(By.id("all_trials_navigation_sales"));
	        saleButton.click();
	        Thread.sleep(2000);
	        
	        WebElement Trail = driver.findElement(By.xpath("//*[contains(@class, 'cta-container')]//child::a[@id='alltrails-card_card-1_dynamics-365-sales_CTA-1_try-for-free'][1]"));
	       
	        Trail.click();
	        
	        Thread.sleep(5000);
	        
	        WebElement username= driver.findElement(By.xpath("//input[@name='Email']"));
	        username.sendKeys("testdata1900@outlook.com");
	        
	        WebElement checkbox= driver.findElement(By.xpath("//input[@name='trial-privacy-consent']"));
	        checkbox.click();
	        
	        driver.manage().window().maximize();
	        
	        Thread.sleep(5000);
	        
	        WebElement signup = driver.findElement(By.xpath("//button[@id='start-trial']"));
	        signup.click();
	        
	        Thread.sleep(20000);
	        
	        //driver.quit();
	        WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
	        password.sendKeys("TestData@2233");
	        
	        WebElement signin = driver.findElement(By.xpath("//input[@id='idSIButton9']"));
	        
	        signin.click();
	        
	        Thread.sleep(4000);
	        
	       WebElement decline = driver.findElement(By.cssSelector("#idBtn_Back"));
	      decline.click();
//	      Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='Continue']")).click();
	       
	       Thread.sleep(5000);
	       
	       WebElement Creation = driver.findElement(By.xpath("//button[@id='searchLauncher-button']"));
	       
	       Creation.click();
	       
	       Thread.sleep(3000);
	       
	       
	      WebElement sendkey =  driver.findElement(By.xpath("//input[@id='id-8']"));
	      
	      sendkey.sendKeys("test");
	      
	      WebElement searchicon = driver.findElement(By.xpath("//button[@id='id-6']"));
	      searchicon.click();
	      
	      WebElement click = driver.findElement(By.xpath(" //div[@id='MscrmControls.Grid.GridControl-account-MscrmControls.Grid.GridControl.account-GridListContainer']"));
	      click.click();
	   
	       
	      String pageTitle = driver.getTitle();
	      
	        String expectedTitle = "Dynamics 365";
	        
	        if (pageTitle.equals(expectedTitle)) {
	            System.out.println("Title validation passed. Actual Title: " + pageTitle);
	        } else {
	            System.out.println("Title validation failed. Expected Title: " + expectedTitle + ", Actual Title: " + pageTitle);
	            
	           
	        }

	       
	       
	       
	        
	      
	     

	}
}

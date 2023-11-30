package com.demo.MavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleCode {

    public static void main(String[] args) throws InterruptedException  {
    	System.setProperty("webDriver", "C:\\Users\\Admin\\Downloads\\chrome-win64\\chrome-win64.exe");
		
		WebDriver driver =  new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.microsoft.com/en-us/microsoft-365/outlook/log-in");
		
		driver.findElement(By.xpath("//*[@id=\"c-shellmenu_0\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"feature-oc387eee\"]/div/div/div[1]/div/div[3]/div[1]/a")).click();
		
		Thread.sleep(8000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		System.out.println("window handles");
		
		Iterator <String> irerator = windowhandles.iterator();
		
		String parentwindow = irerator.next();
	
		String childwindow = irerator.next();
		
		driver.switchTo().window(childwindow);
		
		  
		
		    WebElement usernameFeild =driver.findElement(By.xpath("//input[@name='loginfmt']"));
		
		usernameFeild.sendKeys("testdata1900@outlook.com");
		Thread.sleep(5000);
		
		
		
		WebElement nextbutton = driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		nextbutton.click(); 
		Thread.sleep(5000);
		
		WebElement passwordFeild = driver.findElement(By.xpath("//input[@id='i0118']"));
		passwordFeild.sendKeys("TestData@2233");
		
		WebElement signInButton = driver.findElement(By.xpath("//input[@class='win-button button_primary button ext-button primary ext-primary']"));
		signInButton.click();
		
		WebElement staySignIn = driver.findElement(By.xpath("//input[@id='idBtn_Back']"));
		staySignIn.click();
		//driver.quit();
		
		
    }
}

package com.amazon.bestSeller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ComCostco {

	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		
		String expectedTitle =("Welcome to Costco Wholesale");
		String ActualTitle =driver.getTitle();
		
	if (!(expectedTitle.equals(ActualTitle)))
		System.out.println("page not verified");
	   else 
		System.out.println("page verified");	
	 driver.findElement(By.xpath("//*[@id='header_sign_in']")).click();
	 driver.findElement(By.xpath("//*[@id=\"LogonForm\"]/fieldset/div[9]/a")).click();
	 driver.findElement(By.xpath("//*[@id='register_email1']")).click();
	 driver.findElement(By.xpath("//*[@id='register_email1']")).sendKeys("test");
	 driver.findElement(By.xpath("//*[@id='logonPassword']")).click();
	 driver.findElement(By.xpath("//*[@id='logonPassword']")).sendKeys("password");
	driver.findElement(By.xpath("//*[@id=\'logonPasswordVerify\']")).click();
    driver.findElement(By.xpath("//*[@id=\'logonPasswordVerify\']")).sendKeys("confirm password");
    driver.navigate().refresh();
    
    driver.close();
	 



	 
	 // driver.findElement( By.xpath("//*[@id=\"RegisterForm\"]/fieldset/div[7]/input")).click();

	 // driver.findElement( By.xpath("")).sendKeys();//
        // driver.close();
	}

}

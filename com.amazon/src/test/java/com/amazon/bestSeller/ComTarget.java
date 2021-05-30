package com.amazon.bestSeller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ComTarget {

	public static void main(String[] args) {
		
		WebDriverManager . chromedriver().setup();
		
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get( "https://www.target.com/ ");
	  
	 
	  String expectedTitle ="Target : Expect More. Pay Less.";
	  String ActualTitle =  driver.getTitle();
	  
	  if(expectedTitle.equals(ActualTitle)) 	      
		  System.out.println("page verified");	      
	   else		  
		  System.out.println("Page not verified");
	  
	  if(driver.findElement(By.xpath("//*[@id='home']")).isDisplayed())
	      System.out.println("Logo exist on home page");
	   else
		  System.out.println("Logo does not exist on home page");
	  
	  driver.findElement( By.xpath("//*[@id='search']")).click();
	  driver.findElement( By.xpath("//*[@id='search']")).sendKeys("Clothes");
	  driver.findElement( By.xpath("//*[@id=\"headerMain\"]/div/form/button[2]")).click();
	//  String expectedCPageTitle ="Clothes";//
	 // String ActualpageTitle = driver.findElement( By.xpath("//*[@id=\"mainContainer\"]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div[1]/h2")).getText();//
	  driver.navigate().back();
	  
	  

	
	  	 
	 driver.close();

	}
		
}


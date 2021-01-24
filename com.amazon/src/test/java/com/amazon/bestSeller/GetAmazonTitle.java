package com.amazon.bestSeller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAmazonTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver1=new FirefoxDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver2=new EdgeDriver();
		
		//driver.get("https://www.amazon.com/");
		//string amazonTitle
	//	WebDriverManager.iedriver().setup();
		WebDriver sana=new InternetExplorerDriver();
		sana.get("https://www.amazon.com/");
	}
}

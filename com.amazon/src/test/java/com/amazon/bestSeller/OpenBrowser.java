package com.amazon.bestSeller;
i
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://macy.com//");
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		driver.close();
		
		

	}

}

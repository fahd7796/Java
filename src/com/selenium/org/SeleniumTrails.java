package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTrails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_101\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		//System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println("The titlte of the webpage is:"+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("The url of the webpage is:"+url);
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		driver.navigate().refresh();
		title = driver.getTitle();
		System.out.println("The title of the webpage is:"+title);
		url = driver.getCurrentUrl();
		System.out.println("The url of the webpage is:"+url);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000); 
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();  
		driver.close();
		driver.quit();
		

	}

}
  
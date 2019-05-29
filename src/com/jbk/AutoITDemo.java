package com.jbk;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\JBK mevan\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/JBK%20mevan/Selenium/AutoIt/FileUpload.html");
		
		driver.findElement(By.id("1")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("G:\\JBK mevan\\Selenium\\AutoIt\\AutoItRunScriptWithExe\\FileUpload.exe");
		
	}
	
	
}

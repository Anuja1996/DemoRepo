package com.qa.pms.base;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	public TestBase() throws IOException {
		
		prop=new Properties();
		File file=new File("C:\\workspaceForProject1\\PMSProject\\src\\main\\java\\com\\qa\\pms\\config\\config.properties");
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);	
	}
	 
	public static void initialization() {
	
		System.out.println("drivr launching...");
		System.setProperty("webdriver.chrome.driver","G:\\JBK mevan\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//******************to create log******************************//////
		
		log = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("C:\\workspaceForProject1\\ShopCartProject2\\src\\main\\java\\com\\qa\\config\\log4j.properties");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		System.out.println("website launching...");
		
		driver.get(prop.getProperty("url"));
		
		//driver.get("https://javaclassesinpune.com/projects/shopcart/index.php");
		
	}
	
	
}

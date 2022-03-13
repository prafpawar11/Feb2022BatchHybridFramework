package com.BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.UtilityLayer.WebEventListner;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListner eventListener;
	public static EventFiringWebDriver e_driver;

	public BaseClass() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\l470\\Desktop\\25 Dec 2021 Automation Testing\\test Script2\\OrgangeHRMHybridFramework\\src\\main\\java\\com\\Config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\l470\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}

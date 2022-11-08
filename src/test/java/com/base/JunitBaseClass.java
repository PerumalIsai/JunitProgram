package com.base;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitBaseClass {

	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(JunitBaseClass.propertiesRead("url"));
		driver.manage().window().maximize();
	}

	public static String propertiesRead(String key) {
		String property = key;
		try {
			File f = new File(
					"C:\\Users\\ISAI\\eclipse-workspace\\JunitProgram\\src\\test\\resources\\Test.properties\\junitsendkeys.properties");
			FileReader fr = new FileReader(f);

			Properties pr = new Properties();
			pr.load(fr);
			property = pr.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return property;
	}

	public static void sendkeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public static WebElement xpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static void click(WebElement element) {
		element.click();
	}
	public static String getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
		return attribute;
	}
	

}

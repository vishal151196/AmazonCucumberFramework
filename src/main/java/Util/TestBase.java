package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.TestUtil;

public class TestBase {

	public static WebDriver driver = null;
	public static Properties prop=null;

	public  TestBase() {
		
	}

	public static void initialization() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\QA\\Selenium_workspace\\AmazonCucumberFramework\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));

		driver.get(prop.getProperty("url"));

	}
}

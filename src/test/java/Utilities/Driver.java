package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.configuration;

public class Driver {

	 public static WebDriver driver = null;
	//static WebDriver driver;

	public static WebDriver Initialize() {
		if (driver == null) {
			if (configuration.Browser.browser.equalsIgnoreCase("ff"))
				driver = new FirefoxDriver();

			else if (configuration.Browser.browser.equalsIgnoreCase("ie")) {
				// System.setProperty(ieDriver, xyz)
				driver = new InternetExplorerDriver();
			}

			else if (configuration.Browser.browser.equalsIgnoreCase("chrome")) {
				// System.setProperty(ieDriver, xyz)
				driver = new ChromeDriver();
			}

		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void close() {
		System.out.println("Close the browser");
		driver.close();
		driver = null;
	}

	public static void quit() {
		System.out.println("Quiting the browser");
		driver.quit();
		driver = null;
	}

}

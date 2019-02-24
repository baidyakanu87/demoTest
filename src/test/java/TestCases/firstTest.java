package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Utilities.Driver;
import Utilities.TestBase;
import config.configuration;

public class firstTest extends TestBase{	
	
	@Test
	public void test1(){
		
		Driver.driver.navigate().to(configuration.url.app_url);
		Driver.driver.findElement(By.id("email")).sendKeys("baidyakanu8719@gmail.com");
		Driver.driver.findElement(By.id("pass")).sendKeys("Infraction@1987");
		Driver.driver.findElement(By.id("u_0_q")).click();
		
	}

}

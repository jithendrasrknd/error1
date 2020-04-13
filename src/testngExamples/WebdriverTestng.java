package testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverTestng {
WebDriver driver;
	@BeforeClass
public void startUp() {
	//open browser
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jithendra\\eclipse-workspace\\MyFirstProject\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
}
@AfterClass
public void tearDown() {
	//close browser
driver.quit();
}
@Test
public void Tc001() throws InterruptedException {
	//test case steps
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	System.out.println(driver.getTitle());
	Reporter.log(driver.getTitle());
	driver.findElement(By.name("")).sendKeys("");
	driver.findElement(By.name("")).sendKeys("");
	driver.findElement(By.name("")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("logout")).click();
	Thread.sleep(3000);
System.out.println("Logout successfully");
}
}

	



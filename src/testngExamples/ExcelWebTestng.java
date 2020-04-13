package testngExamples;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExcelWebTestng {
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
public void Tc001() throws InterruptedException, JXLException, IOException {
	//test case steps
FileInputStream file = new FileInputStream("D:\\SELENIUM PROGRAMMING\\Excel user name password.xlsx");
Workbook wb= Workbook.getWorkbook(file);
Sheet sh = wb.getSheet(0);
String un = sh.getCell(0,1).getContents();
String pw = sh.getCell(1,1).getContents();
//TYPE username and password from Excel file
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	System.out.println(driver.getTitle());
	Reporter.log(driver.getTitle());
	driver.findElement(By.name("txtUsername")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("logout")).click();
	Thread.sleep(3000);
System.out.println("Logout successfully");
}
}

	



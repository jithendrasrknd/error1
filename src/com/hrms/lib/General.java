package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.hrms.utility.Log;
public class General extends Global {
		//RE USABLE FUNCTION
		public void openapplication(){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jithendra\\eclipse-workspace\\MyFirstProject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to(url);
			System.out.println("Application opened");
			Reporter.log("Application opened");
			Log.info("Application opened");
}
		public void login() throws Exception {
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click(); 
			System.out.println("Login completed");
			Thread.sleep(3000);
			System.out.println("Login completed");
			Reporter.log("Login completed");
			Log.info("Login completed");
	}
		public void logout() {
			driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.partialLinkText("Logout")).click();
			driver.findElement(By.linkText("")).click();
			System.out.println("clicked logout successfully");
			System.out.println("logout successfully");
			Reporter.log("logout successfully");
			Log.info("logout successfully");
		}
		public void addemp() {
	       WebElement element=driver.findElement(By.linkText("PIM"));
	       Actions action=new Actions(driver);
	       action.moveToElement(element).perform();
	       driver.findElement(By.linkText("Add Employee")).click();
	       System.out.println("clicked on submenu");
	       driver.findElement(By.name("firstName")).sendKeys("jithendra");
	       driver.findElement(By.name("middleName")).sendKeys("HELLO");
	       driver.findElement(By.name("lastName")).sendKeys("SIRIKONDA");
	       driver.findElement(By.id("btnSave")).click();
	       System.out.println("saved successfully");
	       System.out.println("add employee ");
	}
	public void demp() {
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.name("btnDelete")).click();
		System.out.println("clicked on deleted button");
		System.out.println("deleted an employee");
	}
	public void closeapplication() {
	driver.quit();
	driver.close();
	System.out.println("Application closed");
}
}
package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//var //testdata
	public WebDriver driver;
	public String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public String un ="Admin";
	public String pw ="admin123";
		
	//object
	public String txt_loginname="txtUsername";
	public String txt_password="txtPassword";
	public String btn_login ="Submit";
	public String lnk_logout ="Logout";
}


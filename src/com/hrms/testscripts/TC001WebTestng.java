
package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC001WebTestng {
//Test case
	@Test
	public void TC001two() throws Exception {
		DOMConfigurator.configure("log4j.xml");
	General g= new General();
		//test case steps
		g.openapplication();
		System.out.println("open application opened");
		g.login();
		System.out.println("login successfully");
		g.addemp();
		System.out.println("add employee successfully");
		g.demp();
		System.out.println("deleted employee successfully");
		g.logout();
		System.out.println("logout successfully");
		g.closeapplication();
		System.out.println("closed successfully");
		
	}
}


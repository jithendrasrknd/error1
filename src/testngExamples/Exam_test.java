package testngExamples;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exam_test {
@BeforeClass
public void login() {		
	System.out.println("login completed");
		
	}
@Test

public void logout() {
	System.out.println("logout completed");
}
@BeforeMethod
public void Addemp() {
	System.out.println("Added employee compleded");
}
@BeforeMethod
public void Demp() {
	System.out.println("Del employee completed");
}
}


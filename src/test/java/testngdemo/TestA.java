package testngdemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestA {
	
	@BeforeSuite
	void initialSetUp(){
		System.out.println("before suite");
	}
	
	@BeforeMethod
	void setUp() {
		System.out.println("before method set up");
	}
	
	
	@Test(groups = "regression")
	void m1() {
		System.out.println("m1");
	}
	
	@Test(groups = "regression")
	void m2() {
		System.out.println("m2");
	}
	
	@Parameters("browser")
	@Test
	void m3(String browserName) {
		System.out.println("browsersname is: "+browserName);
		System.out.println("m3");
	}

}

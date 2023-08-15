package testngdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider(name="testing")
	public Object [] [] testData() {
		return new Object [] [] {
			{"Rahul" , 29},
			{"Rahul" , 27}
		};
	}
	
	@Test(dataProvider="testing")
	public void testMethod(String name, int age ) {
		System.out.println("name: "+name +" , age: "+age);
	}

}

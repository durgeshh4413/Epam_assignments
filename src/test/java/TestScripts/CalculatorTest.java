package TestScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Pages;

public class CalculatorTest {
	Pages pages;
	
	 CalculatorTest(){
		pages=new Pages();
	}
	
	SoftAssert softAssert=new SoftAssert();
	
	@DataProvider (name = "test_data")
    public Object[][] dpMethod(){
	 return new Object[][] {{5.00, 4.00}};
    }
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Thread Number Is " + Thread.currentThread().getId());
	}
	
	
	@Test(dataProvider = "test_data",groups = { "Calculator" })
	public void addTest(double a,double b) {
		softAssert.assertEquals(pages.calculator().add(a, b),9.0);
		softAssert.assertAll();
		
	}
	
	@Test(groups = { "Calculator" })
	public void substractTest() {
		softAssert.assertEquals(pages.calculator().substract(5, 4),1.0);
		softAssert.assertAll();
		
	}

	
	@Test(groups = { "Calculator" })
	public void multiplyTest() {
		softAssert.assertEquals(pages.calculator().multiply(5, 4),20.0);
		softAssert.assertAll();
		
	}
	
	@Test(groups = { "Calculator" })
	public void divideTest() {
		softAssert.assertEquals(pages.calculator().divide(10, 5),2.0);
		softAssert.assertAll();
		
	}
	
	@Test(groups = { "Calculator" })
	public void verifyIsNumberPositive() {
		softAssert.assertTrue(pages.calculator().isPositive(pages.calculator().add(7, 5)));
		softAssert.assertAll();
	}

	
	
	
}

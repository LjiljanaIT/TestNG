package calculatorPcg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {
	public Calculator calculator = new Calculator();

	SoftAssert sa = new SoftAssert();

	
	//test the setter
	@Test(dataProvider = "DataForSetter")
	public void GetAndSetTest(double setValue1) {

		calculator.setValue(setValue1);
		sa.assertEquals(calculator.getValue(), setValue1);
	}

	//test add method
	@Test(priority = 1, dataProvider = "DataSetCalc")
	public void TestAdding(double no1, double no2){

		calculator.setValue(no1);
		System.out.print(no1 + " ");
		System.out.println(no2);
		double acctualValue = calculator.add(no2).getValue();
		double expectedValue = no1 + no2;
		sa.assertEquals(acctualValue, expectedValue);
		sa.assertAll();

	}

	//test div method
	@Test(priority = 2, dataProvider = "DataSetCalc")
	public void TestDividing(double no1, double no2) {

		calculator.setValue(no1);
		double acctualValue = calculator.div(no2).getValue();
		double expectedValue = no1 / no2;
		sa.assertEquals(acctualValue, expectedValue);
		sa.assertAll();
	}
	
	//dataset for setter
	@DataProvider
	private Object[][] DataForSetter() {
		return new Object[][] { { 5}, { 10 }, { -11} };

	}

	//dataset for calculator
	@DataProvider 
	private Object[][] DataSetCalc() {
		return new Object[][] { { 0, 0 }, { 0, -1 }, { 0, 1 }, { -1, 0 }, { -1, 0 }, { 0, 2.5 }, { 0, -2.5 },

				{ 2.5, 0 }, { -2.5, 0 }, { -4.7, 10 }, { 9, -8.6 }, { 10999, 12999 }, { -11846, -18946 },

				{ -359444, 896999 }, { 1000832, -2999430 }, { 0.00000001, 0.000000000000001 },

				{ 0.00000001, -0.000000000000001 }, { 9.999999999999999999, 9.99999999999999999999 },
				{ 9.999999999999999999, -9.99999999999999999999 }, { 0.00000001, 100000009 } };
	}

	
}

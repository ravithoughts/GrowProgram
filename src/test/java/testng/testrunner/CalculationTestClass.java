package testng.testrunner;

import org.testng.Assert;
import org.testng.annotations.*;
import testng.screens.CalculationScreen;

public class CalculationTestClass {
    public CalculationScreen calc = new CalculationScreen();;

    @BeforeClass
    public void beforeClass() {

        System.out.println("I am in before Test,Object Created for Calculation Screen");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting the test execution");
    }

    @Test(groups = {"operations"}, dataProvider = "getAddition", priority = -1)
    public void doSum(int add1, int add2, int expectedResult) throws InterruptedException {
        long result = calc.sum(add1, add2);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(groups = {"subtract", "operations"}, priority = 0)
    public void doMinus() throws InterruptedException {
        long result = calc.sub(8, 7);
        Assert.assertEquals(result, 1);
    }

    @Test(groups = {"operations"}, priority = 1)
    @Parameters({"number1", "number2", "result"})
    public void doMultiplication(int multiply1, int multiply2, int expectedResult) throws InterruptedException {
        long result = calc.mult(multiply1, multiply2);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(groups = {"operations"}, priority = 2)
    public void doDivision() throws InterruptedException {
        long result = calc.div(0, 5);
        Assert.assertEquals(result, 0);
    }

    @DataProvider
    public Object[][] getAddition() {
        return new Object[][]{{4, 4, 8}, {5, 5, 10}};
    }
}
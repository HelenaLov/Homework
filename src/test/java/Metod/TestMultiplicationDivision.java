package Metod;

import Metod.MultiplicationDivisionMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMultiplicationDivision {
    @Test
    public void TestMultiplicationPositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertTrue(10 == multiplicationDivisionMethod.multiplication(2, 5));
    }

    @Test
    public void TestMultiplicationNegative() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertFalse(10 == multiplicationDivisionMethod.multiplication(4, 5));
    }

    @Test
    public void TestDivisionPositive() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertTrue(10 == multiplicationDivisionMethod.division(20, 2));
    }

    @Test
    public void TestDivisionNegative() {
        MultiplicationDivisionMethod multiplicationDivisionMethod = new MultiplicationDivisionMethod();
        Assert.assertFalse(10 == multiplicationDivisionMethod.division(30, 2));
    }
}

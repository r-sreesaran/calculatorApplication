package org.sree.services.test;

import org.sree.services.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
Calculator calculator;
    @Test
    public void testAddition() {

        Assert.assertEquals(10, new Calculator(5,5).add(),"error in addition operation");
   }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(0, new Calculator(5,5).subtract() , "Error in subtraction operation");
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(25, new Calculator(5,5).multiply(),"Error in multiplication operation");

    }
    @Test
    public void testDivision() {

    }

}

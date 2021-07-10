package org.sree.services.test;

import org.sree.services.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestCalculator {
    @Test
    public void testAddition() {

        Assert.assertEquals(new Calculator(Arrays.asList(1,2,3)).add(),6,"error in addition operation");
   }

    @Test
    public void testSubtraction() {

        Assert.assertEquals(new Calculator(Arrays.asList(1,2,3)).subtract(),-6  , "Error in subtraction operation");
    }

    @Test
    public void testMultiplication() {
        Calculator calculator= new Calculator(Arrays.asList(1,2,3));
        calculator.setDisplayValue(1);
        Assert.assertEquals( calculator.multiply(),6,"Error in multiplication operation");
    }
    @Test
    public void testDivision() {

    }

}

package org.sree.services.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass2 {
    int i =0;
    @Test(priority = 1)
    public void Method1() {
        i++;
        Reporter.log("value of i is "+i);
        Assert.assertTrue(i ==1,"value of i is "+i);
    }

    @Test(priority = 2)
    public void Method2() {
        i++;
        Reporter.log("value of i is "+i);
        Assert.assertTrue(i ==2,"value of i is "+i);

    }
    @Test(priority = 3)
    public void Method3() {
        i++;
        Reporter.log("value of i is "+i);
        Assert.assertTrue(i ==3,"value of i is "+i);

    }
}
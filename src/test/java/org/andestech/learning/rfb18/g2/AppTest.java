package org.andestech.learning.rfb18.g2;


import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class AppTest
{
    @Test(priority = -1)
    public void method1Test()
    {

        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());



    }

    @Test
    public void method3Test()
    {

        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());



    }

    @Test(dependsOnMethods = "method3Test")
    public void method2Test()
    {

        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());



    }
}

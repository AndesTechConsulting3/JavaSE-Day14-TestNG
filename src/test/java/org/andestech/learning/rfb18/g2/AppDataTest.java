package org.andestech.learning.rfb18.g2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppDataTest {

    private static String genLogin(String name, String sname)
    {
     return (name.trim().substring(0,1) +
     sname.trim()).toUpperCase();

    }


    @Test
    public void loginTest(){

        String name = "Vasily";
        String sname = "Petrov";

        Assert.assertEquals(genLogin(name,sname),"VPETROV2");

    }


    @DataProvider(name = "logindata")
    public static Object[][] getLoginData(){
        return new Object[][]
                { {"Vasily", "Petrov", "VPETROV"},
                  {"Anna", "Petrushkina", "APETRUSHKINA"},
                  {"Petr", "Annenkov", "PANNENKOV"}
                };
    }

    @DataProvider(name = "logindata2")
    public static Object[][] getLoginDatafromFile(){
        return Utils.getLoginsfromDisk("src/test/resources/userdata.txt");
    }


    @Test(dataProvider = "logindata2")
    public void massLoginTest(String name, String sname, String expectedLogin  ){

//        String name = "Vasily";
//        String sname = "Petrov";

        Assert.assertEquals(genLogin(name,sname),expectedLogin);

    }



}

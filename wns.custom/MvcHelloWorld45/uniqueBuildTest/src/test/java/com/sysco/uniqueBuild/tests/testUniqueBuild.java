package com.sysco.uniqueBuild.tests;

import com.sysco.uniqueBuild.function.SearchGoogle;
import com.sysco.uniqueBuild.util.TestBase;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testUniqueBuild extends TestBase {

    SearchGoogle searchGoogle = new SearchGoogle();
    @BeforeClass
    public void init(ITestContext iTestContext){
        iTestContext.setAttribute("feature","SUTAF - test_case_title");
    }

    /*@Test(description = "PDIS-1234 - Verify cancel button click")
    public void testGoogleSearch(){

        Assert.assertTrue(true);
    }

    @Test(description = "Verify cancel button click 1234")
    public void testGoogleSearch1(){

        Assert.assertTrue(true);
    }

    @Test(description = "B2BM-877")
    public void testGoogleSearch2(){

        Assert.assertTrue(true);
    }

    @Test
    public void testGoogleSearch3(){

        Assert.assertTrue(true);
    }

    @Test(description = "")
    public void testGoogleSearch4(){

        Assert.assertTrue(true);
    }

    @Test(description = "| PDIS-3057 | Verify pushing data to add new details : Record count")
    public void testGoogleSearch5(){
        Assert.assertTrue(true);
    }

    @Test(description = "MDMRP-3775: Validate that the PQM is able to Copy a Master spec and create a Standard spec")
    public void testGoogleSearch6(){

        Assert.assertTrue(true);
    }

    @Test(description = "DPRU-3226_Access Forecast ExceptionCoreFunction DPRU3226")
    public void testGoogleSearch8(){

        Assert.assertTrue(true);
    }

    @Test(description = "When valid request is provided, should output ids in correct format in the response DOM-1042")
    public void testGoogleSearch9(){

        Assert.assertTrue(true);
    }

    @Test(description = "When valid request is provided, should output ids in correct format in the response QTSL-TC-182")
    public void testGoogleSearch10(){

        Assert.assertTrue(true);
    }




    @Test(description = "S4R-TC-473 - Maintenance - Door Maintenance - Verify the data displayed in the data area")
    public void testSUTAPQMetryTestCase2(){
        //searchGoogle.navigateToGoogle();
        Assert.assertTrue(true);
    }

    @Test(description = "QTSL-TC-181")
    public void testAutomatedStatusCheck1(){
        //searchGoogle.navigateToGoogle();
        Assert.assertTrue(true);
    }

    @Test(description = "QTSL-TC-182")
    public void testAutomatedStatusCheck2(){
        //searchGoogle.navigateToGoogle();
        Assert.assertTrue(false);
    }

    @Test(description = "QTSL-TC-182 - Product Search in Catalog" , alwaysRun = true)
    public void productSearchInCatalog(){
        Assert.assertTrue(true);
    }
    @Test(description = "QTSL-TC-182-Product Search in Catalog 2" , alwaysRun = true)
    public void productSearchInCatalog2(){
        Assert.assertTrue(true);
    }
    @Test(description = "QTSL-145-Product Search with an Invalid Code" , alwaysRun = true)
    public void productSearchWithInvalidCode(){
        Assert.assertTrue(true);
    }*/
    /*@Test
    public void testGoogleSearch3(){
        searchGoogle.navigateToGoogle();
        Assert.assertTrue(true);
    }

    @Test
    public void testGoogleSearch4(){
        searchGoogle.navigateToGoogle();
        Assert.assertTrue(true);
    }*/


    @Test(description = "MTMT-13")
    public void testGoogleSearchAutomateTest27e(){
        searchGoogle.navigateToGoogle();
        System.out.println("kskskks");
        Assert.assertTrue(true);
    }

  /*  @Test(description = "MTMT - TC - 14 - SUTAP Qmetry Test 233")
    public void testGoogleSearchAutomateTest27f(){
        //searchGoogle.navigateToGoogle();
        System.out.println("kskskks");
        Assert.assertTrue(true);
    }

    @Test(description = "MTMT-TC-15 - SUTAP sjssk Qmetry Test 12")
    public void testGoogleSearchAutomateTest27g(){
        //searchGoogle.navigateToGoogle();
        System.out.println("kskskks");
        Assert.assertTrue(false);
    }

    @Test(description = "MTMT-TC-10")
    public void testGoogleSearchAutomateTest27k(){
        //searchGoogle.navigateToGoogle();
        System.out.println("kskskks");
        Assert.assertTrue(false);
    }

    @Test(description = "MTMT-TC-20 - SUTAP sjssk Qmetry Test 12")
    public void testGoogleSearchAutomateTest27i(){
        //searchGoogle.navigateToGoogle();
        System.out.println("kskskks");
        Assert.assertTrue(false);
    }

    @Test(description = "When valid request is provided,  MTMT-9 should output ids in correct format in the response")
    public void testGoogleSearch10(){

        Assert.assertTrue(true);
    }

    @Test(description = "MTMT - TC - 14 - SUTAP Qmetry Test 233dsdsd")
    public void testGoogleSearchAutomateTest27h(){
        //searchGoogle.navigateToGoogle();
        System.out.println("kskskks");
        Assert.assertTrue(false);
    }

    @Test(description = "MTMT-TC-13 MTMT-TC-14 - SUTAP sjssk Qmetry Tedsdsst 12")
    public void testGoogleSearchAutomateTest27j(){
        //searchGoogle.navigateToGoogle();
        System.out.println("kskskks");
        Assert.assertTrue(false);
    }*/


}

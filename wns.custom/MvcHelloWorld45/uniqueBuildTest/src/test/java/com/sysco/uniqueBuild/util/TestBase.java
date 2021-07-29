package com.sysco.uniqueBuild.util;



import com.sysco.uniqueBuild.common.Constants;
import com.sysco.uniqueBuild.function.SearchGoogle;
import com.syscolab.qe.core.reporting.*;
import com.syscolab.qe.core.util.qcenter.QCenterUtil;
import org.json.JSONException;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;

import static com.sysco.uniqueBuild.common.Constants.*;

@Listeners(SyscoLabListener.class)
public class TestBase {

    private SyscoLabListener syscoLabListener;
    private SyscoLabQCenter syscoLabQCenter;
    private String testCaseID;
    SearchGoogle searchGoogle = new SearchGoogle();

    @BeforeSuite
    public void generateBuild() throws JSONException {
        System.setProperty("qmetry.release", String.valueOf(QLYTICS_QMETRY_RELEASE));
        System.setProperty("daily.weekly.build",QLYTICS_DAILY_WEEKLY_BUILD);
        System.setProperty("update.dashboard",String.valueOf(UPDATE_DASHBOARD));
        System.setProperty("qmetry.open.api.key", QMETRY_OPEN_API_KEY);
        System.setProperty("qmetry.project.code", QMETRY_TC_PREFIX);
        QCenterUtil.generateBuild(TEST_PROJECT,TEST_ENV,TEST_RELEASE);
        if(Constants.UPDATE_QMETRY) {
            if((IS_TEST_CYCLE_PROVIDED==false && QLYTICS_QMETRY_RELEASE==false)){
                System.setProperty("qmetry.test.cycle.id", QMetryREST.createNewTestCycle());
                System.out.println("A New Test Run Will Be Generated");
            }else {
                System.setProperty("qmetry.test.cycle.id", QMETRY_TEST_CYCLE_ID);
            }
        }
    }

    @BeforeClass
    public void init(){
        syscoLabQCenter = new SyscoLabQCenter();
        syscoLabListener = new SyscoLabListener();
    }

    @AfterMethod
    public void initMethod(){
        if(Constants.UPDATE_QMETRY){

            testCaseID = SyscoLabListener.getLastExecutedTCID();

        }
    }

    /*@BeforeMethod
    public void initMethod(Method method){
        QmetryHelper.qmetryTest(true, method.getName());
    }*/


    /*@BeforeMethod
    public void initMethod(Method method){
        method.getDeclaredAnnotations().length
        QmetryHelper.qmetryTest(false, method.getAnnotation());
    }*/

    @AfterMethod(alwaysRun = true)
    public void updateMethod(ITestContext iTestContext){
        try{
            if(Constants.UPDATE_QMETRY){
                System.setProperty("qmetry.api.key",Constants.QMETRY_API_KEY);
                System.setProperty("qmetry.test.id", testCaseID);
                System.setProperty("qmetry.tc.version", QMETRY_TC_VERSION);
                QMetryREST.updateQMetry(iTestContext);
            }
            if(Constants.UPDATE_DASHBOARD){
                syscoLabQCenter.setProjectName(TEST_PROJECT);
                syscoLabQCenter.setEnvironment(Constants.TEST_ENV);
                syscoLabQCenter.setRelease(Constants.TEST_RELEASE);
                syscoLabQCenter.setModule(iTestContext.getAttribute("feature").toString());
                syscoLabQCenter.setFeature(iTestContext.getAttribute("feature").toString());
                syscoLabQCenter.setClassName(iTestContext.getClass().getName());

                SyscoLabReporting.generateJsonFile(syscoLabListener.getResults(),syscoLabQCenter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @AfterMethod( alwaysRun = true)
    public void cleanUp() {
        try {
            SearchGoogle.quitDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

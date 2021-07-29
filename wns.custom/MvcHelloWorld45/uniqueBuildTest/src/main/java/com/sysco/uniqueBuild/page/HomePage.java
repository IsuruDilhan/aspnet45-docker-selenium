package com.sysco.uniqueBuild.page;

import com.sysco.uniqueBuild.common.Constants;
import com.sysco.uniqueBuild.util.DriverEnvironmentSetUpUtil;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;

public class HomePage {
    protected static SyscoLabUI syscoLabUI;
    private By txtSearchBox = By.xpath("//input[@title='Search']");

    public void openGoogleHomePage(){
        syscoLabUI = new SyscoLabWUI("chrome");
        syscoLabUI.navigateTo(Constants.APP_URL);
        syscoLabUI.driver.manage().window().maximize();
    }

    public void enterTextInSearchBox(String text){
        syscoLabUI.sendKeys(txtSearchBox,text);
    }

    public void quitDriver(){
        if (syscoLabUI.driver != null)
            syscoLabUI.quit();
    }
}

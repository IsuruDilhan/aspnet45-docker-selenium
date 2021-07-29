package com.sysco.uniqueBuild.util;

import com.syscolab.qe.core.ui.SyscoLabCapabilityUtil;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverEnvironmentSetUpUtil {

    DriverEnvironmentSetUpUtil(){

    }
    public static String chromeDriver = "webdriver.chrome.driver";

    /*public static void setToRunLocally(){
        System.setProperty(chromeDriver,"src/main/resources/chrome_driver/"+System.getProperty("os.arch")+"/chromedriver");
        Logger.getLogger(System.getProperty(chromeDriver));
    }*/
    public static DesiredCapabilities setToRunLocally(){
        System.setProperty(chromeDriver,"src/main/resources/chrome_driver/"+System.getProperty("os.arch")+"/chromedriver");
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        options.addArguments("--headless");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("hub.url", "");
        return capabilities;
//        syscoLabUI.driver = new ChromeDriver(options);
        //Logger.getLogger(System.getProperty(chromeDriver));
    }

    public static Capabilities setToRunRemotely(){
        DesiredCapabilities capabilities;
        System.getProperty("hub.url","http://localhost:4444/wd/hub");
        capabilities = SyscoLabCapabilityUtil.getPCCapabilities("Windows","chrome");
        capabilities.setBrowserName(BrowserType.CHROME);
        return capabilities;
    }

}

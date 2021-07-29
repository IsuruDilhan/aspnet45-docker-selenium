package com.sysco.uniqueBuild.function;

import com.sysco.uniqueBuild.common.Constants;
import com.sysco.uniqueBuild.page.HomePage;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.reporting.SyscoLabListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchGoogle {

    static HomePage homePage = new HomePage();

    public static void navigateToGoogle(){
        homePage.openGoogleHomePage();
        homePage.enterTextInSearchBox("Flowers");
    }

    public static void quitDriver(){
        homePage.quitDriver();
    }

    /*public static String getLastExecutedTCID() {
        String qMetryID = "";
        String descriptionTagWithTC = RestUtil.getValue(SyscoLabListener.getResults().get(SyscoLabListener.getResults().size() - 1).toString(),"name").replaceAll(" ","");
        System.out.println("DescrptionWith "+descriptionTagWithTC);
        Pattern qmetryIdPatternWithTC = Pattern.compile("\\S(([A-Z]|[0-9])*+([-]|[_])+TC+([-]|[_])+\\b([0-9])*)");
        Matcher matcherWithTC = qmetryIdPatternWithTC.matcher(descriptionTagWithTC);
        String descriptionTagWithoutTC = RestUtil.getValue(SyscoLabListener.getResults().get(SyscoLabListener.getResults().size() - 1).toString(),"name").split("-")[1].trim();
        System.out.println("DescrptionWithout "+descriptionTagWithoutTC);
        Pattern qmetryIdPatternWithoutTC = Pattern.compile("^\\d+$");
        Matcher matcherWithoutTC = qmetryIdPatternWithoutTC.matcher(descriptionTagWithoutTC);
        if (matcherWithTC.find())
        {
            System.out.println("WITH"+matcherWithTC.group(0));
            return qMetryID = matcherWithTC.group(0);
        }else if(matcherWithoutTC.find()) {
            System.out.println("WITHOUT"+matcherWithoutTC.group(0));
            qMetryID = matcherWithoutTC.group(0);
            System.out.println("APPENDED"+(Constants.QMETRY_TC_PREFIX)+qMetryID);
            return (System.setProperty("tc.prefix",Constants.QMETRY_TC_PREFIX))+qMetryID;
        }else{
            throw new RuntimeException ("Please Enter Test Description in Correct Format");
        }

    }*/

}

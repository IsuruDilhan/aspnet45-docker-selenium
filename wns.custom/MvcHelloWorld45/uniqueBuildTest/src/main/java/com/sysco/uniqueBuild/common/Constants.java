package com.sysco.uniqueBuild.common;

public class Constants {
    public static final String APP_URL = System.getProperty("app.url","https://google.com");

    //Qcenter related
    public static final String TEST_PROJECT = System.getProperty("test.project","TQE_Demos");
    public static final String TEST_ENV = System.getProperty("test.env","DEV");
    public static final String TEST_RELEASE = System.getProperty("qmetry.release.name","MTMT-TR-64");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard","false"));

    //Qmetry related
    public static final boolean UPDATE_QMETRY = Boolean.parseBoolean(System.getProperty("update.qmetry","false"));
    public static final boolean IS_TEST_CYCLE_PROVIDED = Boolean.parseBoolean(System.getProperty("is.test.cycle.provided","false"));
    public static final String QMETRY_TEST_CYCLE_ID = System.getProperty("test.cycle.id","MTMT-TR-64");
    public static final String QMETRY_API_KEY = System.getProperty("api.key","4e91098142eb0e928056d1bc464f272245e1e9dec58a8d238fb169ea5412477a5ff2692d1356d28f755b124da876c7434ec1c6ac55d73e0e6a7551b9a72351ea5bfc3a2c9dc747df4f7c05c896a0ab37");
    public static final String QMETRY_OPEN_API_KEY = System.getProperty("open.api.key","040c946a03530310f8b209d66c537b2dbb26f2e6aa02391aa350be9fc35b0fe7da05c325c5c33c189fc45be23eab826bfcf7be6fe2878b2514285f4c8e6972326a6384bc40df988463d59f85f7eae4ea");
    public static final String QMETRY_TC_PREFIX = System.getProperty("project.code","MTMT");
    public static final String QMETRY_TC_VERSION = System.getProperty("tc.version","1");

    //uniqueBuildRelated
    public static final boolean QLYTICS_QMETRY_RELEASE = Boolean.parseBoolean(System.getProperty("qmetry.release.name","true"));
    public static String QLYTICS_DAILY_WEEKLY_BUILD = System.getProperty("daily.weekly.build","Daily");

    //Jira related
    //public static final String JIRA_USERNAME = System.getProperty("jira.personal.username", "deepika.gnanathilake@syscolabs.com");
    //public static final String JIRA_TOKEN = System.getProperty("jira.access.token", "UreY59v9L4hBRrAAuE8E245B");

    /*public static final String JIRA_USERNAME = System.getProperty("jira.personal.username", "qmetrytester@gmail.com");
    public static final String JIRA_TOKEN = System.getProperty("jira.access.token", "09NjS9c7SHlupvLmD1eT732F");*/


}

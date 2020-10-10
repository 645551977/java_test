package shdsd.selenium;


import org.testng.TestNG;
import shdsd.selenium.Tools.PropertyUtil;
import shdsd.selenium.Tools.Properties;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
        if (null != PropertyUtil.getProperty("model") && "".equals(PropertyUtil.getProperty("model"))) {
            System.out.println("model为空!");
            return;
        }
        if (null != PropertyUtil.getProperty("url") && "".equals(PropertyUtil.getProperty("url"))) {
            System.out.println("url为空!");
            return;
        }
        if (null != PropertyUtil.getProperty("user") && "".equals(PropertyUtil.getProperty("user"))) {
            System.out.println("user为空!");
            return;
        }
        if (null != PropertyUtil.getProperty("pwd") && PropertyUtil.getProperty("pwd").equals("")) {
            System.out.println("pwd为空!");
            return;
        }
        //创建文件夹
        File file = new File(Properties.reportPath);
        //文件夹不存在则创建
        if (!file.exists()) {
            file.mkdirs();
            System.out.println("创建文件夹");
        }
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add(Properties.getProperty() + "/testng.xml");
        testNG.setTestSuites(suites);
        testNG.run();
    }
}

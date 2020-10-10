package TestCase.CheckOut;

import TestCase.Source.AllDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class WorkdayScheme extends BaseTest {

    @Test(dataProvider = "Workday",dataProviderClass = AllDataProvider.class)
    public  void  WorkdayScheme(String name,String desc,String expected) throws Exception
    {
        try {
        Entrance.SettingPage();
        //添加按钮
        click(By.cssSelector("button[type=\"button\"][class=\"css-18u3ks8\"]"));
        //不勾选设置工作日日历
        click(By.cssSelector("input[type=\"checkbox\"][value=\"设置工作日日历\"]")); //不勾选设置工作日日历
        // 输入名称
        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys(name);
        //输入描述
        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys(desc);
        //点击确认
        click(By.cssSelector("button[type=\"button\"][class=\"css-1l4j2co\"]"));

        String actual=getTipElement(By.cssSelector("#jira > div.atlaskit-portal-container > div > div > div:nth-child(3) > div.css-krjp51 > div > div > div > div > div:nth-child(1) > div:nth-child(3) > span"));

        Assert.assertEquals(expected,actual);
        }catch (Exception e)
        {
            System.err.println("添加工作日方案失败！！");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }



    }
}

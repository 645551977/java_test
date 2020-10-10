package TestCase.CheckOut;

import TestCase.Source.AllDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class CalendarScheme extends BaseTest {
    @Test(dataProvider = "CalendarScheme",dataProviderClass = AllDataProvider.class)
    public  void  WorkdayScheme(String name,String desc,String expected) throws Exception
    {
        try {

            Entrance.SettingPage();
            //点击日历方案配置
            click(By.cssSelector("div._2dKWAOzE5XzV9td3aZDuWt > div > div > ul > li:nth-child(3) > div"));

            //点击添加按钮
            click(By.cssSelector("button[type=\"button\"][class=\"css-18u3ks8\"]"));

            //取消设置日历
            click(By.cssSelector(".Checkbox__LabelText-sc-1asqokg-2"));

            //输入名称
            Enter(By.cssSelector(".css-1rmy9fa")).sendKeys(name);
            //描述
            Enter(By.cssSelector("textarea")).sendKeys(desc);
            //点击确认按钮
            click(By.cssSelector("button[type=\"button\"][class=\"css-1l4j2co\"]"));

            String actual = getTipElement(By.cssSelector("#jira > div.atlaskit-portal-container > div > div > div:nth-child(3) > div.css-krjp51 > div > div > div > div > div:nth-child(1) > div:nth-child(3) > span"));

            Assert.assertEquals(expected, actual);
        }
        catch (Exception e)
        {
            System.err.println("添加工作日方案失败！！");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }

    }
}

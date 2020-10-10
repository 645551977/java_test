package TestCase.V1_2.Configure.Calendar_configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;

public class RPCMSD1881 extends BaseTest {
     //https://www.calendarlabs.com/ical-calendarScheme/ics/55/Jewish_Holidays.ics
    @Test
    public void RPCMSD1881() throws Exception {
        //初始化登录操作
        try {
            //此处有bug，待修复
            Entrance.SettingPage();

            //获取元素集合
            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();

            //点击添加按钮
           click(By.cssSelector(".css-j8fq0c"));

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("日历" +System.currentTimeMillis());  //输入名称

            Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("" + Math.random());  //输入描述

            click(By.cssSelector(".css-1yx6h60 > span:nth-child(1) > span:nth-child(1)"));  //点击确认

            click(By.cssSelector("button.css-1yx6h60:nth-child(2) > span:nth-child(1) > span:nth-child(1)"));   //点击导入按钮

            List<WebElement> Chooseway = driver.findElements(By.className("sc-htoDjs"));

            Chooseway.get(2).click();   //点击选择ics  url上传
            //输入文件对应的url
            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入url\"]")).sendKeys("https://www.calendarlabs.com/ical-calendarScheme/ics/55/Jewish_Holidays.ics");
            //点击下一步
            click(By.cssSelector(".css-1nrhui0 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));

        } catch (Exception e) {
            System.err.println("关联ICS文件的url导入失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.io.IOException;
import java.util.List;


public class RPCMSD1728 extends BaseTest {

    @Test
    public void RPCMSD1728() throws Exception {
        //数据初始化操作
        try {
            Entrance.SettingPage();

            List<WebElement> elements = driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();
            //点击添加按钮
            click(By.cssSelector(".css-j8fq0c"));


            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("日历" + System.currentTimeMillis());  //输入名称

            Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("" + Math.random());  //输入描述

            click(By.cssSelector(".css-1yx6h60 > span:nth-child(1) > span:nth-child(1)"));  //点击确认

            click(By.cssSelector("button.css-1yx6h60:nth-child(2) > span:nth-child(1) > span:nth-child(1)"));   //点击导入按钮

            List<WebElement> Chooseway = driver.findElements(By.className("sc-htoDjs"));

            Chooseway.get(1).click();   //点击选择ics文件上传

            //文件上传
            click(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请选择文件\"]"));//文件上传

            try {
                Entrance.exeRunning("Upload", "ICS");
            } catch (IOException e) {
                System.err.println("文件上传失败");
            }
            Thread.sleep(6000);
            //下一步
            click(By.cssSelector(".css-1nrhui0 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));

            //导入
            click(By.cssSelector(".css-1nrhui0 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(2) > span:nth-child(1) > span:nth-child(1)"));

            //关闭，返回到日历设置页面
            click( By.cssSelector("button[class=\"css-1tr7zb4\"][type=\"button\"]"));
            //关闭方案设置，返回到主页面
            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));

        } catch (Exception e) {
            System.err.println("文件上传失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.CheckOut;

import TestCase.Source.AllDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class workTypeScheme extends BaseTest {

    @Test(dataProvider = "workTypeScheme",dataProviderClass = AllDataProvider.class)
    public  void  workTypeScheme(String name,String desc,String expected) throws Exception {
        try {
            Entrance.SettingPage();
            //点击工作类型配置
            click(By.cssSelector("div._2dKWAOzE5XzV9td3aZDuWt > div > div > ul > li:nth-child(5) > div"));
            //点击添加按钮
            click(By.cssSelector("button[type=\"button\"][class=\"css-18u3ks8\"]"));
            // 输入名称
            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys(name);
            //输入描述
            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入描述\"]")).sendKeys(desc);
            //点击保存
            click(By.id("LogTypeSchemeAdd_Btn_save"));

            String actual = getTipElement(By.className("sc-eHgmQL"));  //未获取到此处的值

            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            System.err.println("添加工作类型方案配置失败！！");
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

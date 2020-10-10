package TestCase.CheckOut;

import TestCase.Source.AllDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class LimitLog extends BaseTest {

    @BeforeClass
    public void BeforeClass() throws Exception
    {
        Entrance.GlobalSetting();

        //开启限制工时
        click(By.cssSelector("#shdsd-FineTimesheet-SystemSetting-root-div > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div.styled__Cell-sc-56yt3z-6.bmDavZ > span > label > div > div"));

    }
    @AfterClass
    public void AfterClass() throws Exception
    {
        //点击设置
        click(By.id("admin_menu"));
        //进入到管理应用
        click(By.id("admin_plugins_menu"));
        //点击全局配置
        click(By.id("shdsd-timesheet-workday-link"));
        //关闭限制工时
        click(By.cssSelector("#shdsd-FineTimesheet-SystemSetting-root-div > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div.styled__Cell-sc-56yt3z-6.bmDavZ > span > label > div > div"));
    }

    @Test(dataProvider = "limitLog", dataProviderClass = AllDataProvider.class)
    public void limitLog(String spent, String desc, String expected) throws Exception {
        try {
            //点击菜单栏的项目
            click(By.id("browse_link"));
            //点击所有问题
            click(By.id("admin_main_proj_link_lnk"));
            //点击+日志
            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志
            //输入耗费时间
            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys(spent);  //输入耗费时间
            //输入备注
            Enter(By.name("example-text")).sendKeys(desc);
            //点击保存
            click(By.id("workLogAndPlan-unsubmitted-button"));
            //获取实际值
            String actual = getTipElement(By.xpath("//*[@id=\"jira\"]/div[8]/div/div/div[3]/div[2]/div/div/div[1]/div/div[5]/div/div[2]/div[2]/span"));

            Assert.assertEquals(expected, actual);

            //点击取消
            click(By.id("workLogAndPlan-cancel-button"));


        } catch (Exception e) {
            System.err.println("限制工时有问题");
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

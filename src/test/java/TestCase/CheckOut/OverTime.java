package TestCase.CheckOut;

import TestCase.Source.AllDataProvider;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import org.openqa.selenium.By;
import org.testng.Assert;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class OverTime extends BaseTest {

    @BeforeClass
    public void BeforeClass() throws Exception
    {
        Entrance.GlobalSetting();

        //开启加班模式
        click(By.className("sc-gzVnrw"));

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
        //关闭加班模式
        click(By.className("sc-gzVnrw"));
    }

    @Test(dataProvider = "overtime",dataProviderClass = AllDataProvider.class)
    public void overTime(String spent,String desc,String newSpent,String expected) throws  Exception
    {
        //初始化登录操作
        try {
            //点击菜单栏的项目
            click(By.id("browse_link"));
            //点击所有问题
            click(By.id("admin_main_proj_link_lnk"));
            //点击+日志
            click(By.id("issueDetailsWebpanel_Log"));
            //输入耗费时间
            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys(spent);
            //输入备注
            Enter(By.name("example-text")).sendKeys(desc);
            //键盘模拟--全选加班框
            Enter(By.cssSelector("div.css-1cl2sn2>input:nth-of-type(1)")).sendKeys(Keys.CONTROL,"a");
            //重新输入新的值
            Enter(By.xpath("//*[@id=\"jira\"]/div[8]/div/div/div[3]/div[2]/div/div/div[1]/div/div[9]/div[2]/input")).sendKeys(newSpent);
            //点击保存
            click(By.id("workLogAndPlan-unsubmitted-button"));

            String actual=getTipElement(By.xpath("//*[@id=\"jira\"]/div[8]/div/div/div[3]/div[2]/div/div/div[1]/div/div[9]/div[3]/span"));

            Assert.assertEquals(expected,actual);

            //点击取消
            click(By.id("workLogAndPlan-cancel-button"));


        } catch (Exception e) {
            System.err.println("加班校验失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }


}

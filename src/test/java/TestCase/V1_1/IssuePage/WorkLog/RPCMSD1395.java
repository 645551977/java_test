package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1395 extends BaseTest {

    @Test
    public  void RPCMSD1395() throws  Exception
    {
        try {

            Entrance.IssuePage();

            click(By.id("admin_menu"));  //点击齿轮图标

            click(By.id("admin_plugins_menu"));   //选择插件

            Enter(By.id("admin_menu")).sendKeys("123456");  //进入登录模式，输入密码

            click(By.id("login-form-submit"));   //点击确认

            click(By.id("shdsd-timesheet-workday-link"));  //点击全局配置

            click(By.className("sc-gzVnrw"));  //关闭加班模式

            click(By.id("header-details-user-fullname"));   //点击右上角的切换图像

            click(By.id("log_out"));  //点击注销

            click(By.partialLinkText("登录"));  //注销页面，点击登录

            Enter(By.id("login-form-username")).sendKeys("admin"); //输入用户名

            Enter(By.id("login-form-password")).sendKeys("123456");  //输入密码

            click(By.id("login-form-submit"));  //点击登录

            click(By.id("browse_link")); //点击项目

            click(By.id("admin_main_proj_link_lnk"));  //选择当前项目

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));  //点击issue

            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("7h");  //输入耗费时间

            Enter(By.name("example-text")).sendKeys("开启加班工作日志");   //输入描述

            click(By.id("workLogAndPlan-pendingAudit-button"));  //提交工作日志

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

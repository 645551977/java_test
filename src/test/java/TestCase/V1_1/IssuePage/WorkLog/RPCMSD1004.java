package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1004 extends BaseTest {

    @Test
    public void RPCMSD1004() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.IssuePage();

            click(By.id("admin_menu"));   //点击齿轮图标

            click(By.id("admin_plugins_menu"));  //选择插件

            Enter(By.id("login-form-authenticatePassword")).sendKeys("123456");

            click(By.id("login-form-submit"));

            click(By.id("shdsd-timesheet-workday-link"));

            click(By.className("sc-gzVnrw"));

            driver.navigate().refresh();

            click(By.id("header-details-user-fullname"));
            click(By.id("log_out"));
            click(By.partialLinkText("登录"));

            Enter(By.id("login-form-username")).sendKeys("admin");
            Enter(By.id("login-form-password")).sendKeys("123456");

            click(By.id("login-form-submit"));

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Log"));

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("1h");

            Enter(By.name("example-text")).sendKeys("111");

            click(By.id("workLogAndPlan-unsubmitted-button"));

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}
package TestCase.V1_3.systemSetting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

/**
 * 工作日志加班
 */
public class RPCMSD1901 extends BaseTest {
    @Test
    public void RPCMSD1901() throws Exception {
        //初始化登录并到工作日日页面
        try {
            Entrance.SettingPage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("#issueDetailsWebpanel_Log .css-mu6jxl"));

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("12h");

            click(By.name("example-text"));

            click(By.cssSelector("#workLogAndPlan-submit-button .css-t5emrf"));

            Enter(By.name("example-text")).sendKeys("eeeee");

            click(By.cssSelector("#workLogAndPlan-submit-button .css-t5emrf"));
        } catch (Exception e) {
            System.err.println("工作日志加班失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

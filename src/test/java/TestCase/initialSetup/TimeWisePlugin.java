package TestCase.initialSetup;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

/**
 * 工时插件安装
 */
public class TimeWisePlugin extends BaseTest {
    @Test
    public void TimeWisePlugin() throws Exception {

        try {
            Entrance.InitializeLogin();

            click(By.id("upm-admin-link"));

            click(By.id("upm-upload"));

            click(By.id("upm-upload-url"));

            Enter(By.id("upm-upload-url")).sendKeys(Properties.pluginPath);

            click(By.cssSelector(".confirm"));

            click(By.cssSelector(".cancel"));

            click(By.cssSelector(".aui-avatar-inner > img"));

            click(By.id("log_out"));


        } catch (Exception e) {
            System.err.println("插件安装失败！！！");
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

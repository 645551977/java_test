package TestCase.initialSetup;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;


public class LicenseOnLine extends BaseTest {
    @Test
    public void LicenseOffLine() throws Exception {
        try {
            Entrance.InitializeLogin();
            
            click(By.id("upm-admin-link"));

            Enter(By.id("upm-manage-filter-box")).sendKeys("timewise");

            click(By.cssSelector("div.upm-plugin:nth-child(17) > div:nth-child(1) > h4:nth-child(3)"));

            click(By.cssSelector(".edit-license-key"));

            Enter(By.cssSelector(".edit-license-key")).sendKeys(Properties.licenseOnLine);

            click(By.name("submit"));

            click(By.cssSelector(".aui-navgroup-primary li:nth-child(3) span"));

            click(By.cssSelector(".aui-navgroup-primary li:nth-child(4) span"));

            click(By.id("shdsd-timesheet-license-link"));

            click(By.id("shdsd-fineTimesheet-main-menu-link"));
        } catch (Exception e) {
            System.err.println("许可填写失败！");
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

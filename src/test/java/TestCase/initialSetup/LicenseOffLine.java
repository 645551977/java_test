package TestCase.initialSetup;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class LicenseOffLine extends BaseTest{
    @Test
    public void LicenseOffLine() throws Exception {
        try {
            Entrance.InitializeLogin();

            click(By.id("upm-admin-link"));

            click(By.id("shdsd-timesheet-license-link"));

            click(By.id("shdsd-FineTimesheet-LicenseInfo-root-div"));

            click(By.cssSelector(".css-t5emrf"));

            click(By.name("example-text"));

            Enter(By.name("example-text")).sendKeys(Properties.licenseOffLine);

            click(By.cssSelector(".css-vxcmzt .css-1yx6h60 .css-t5emrf"));

        } catch (Exception e) {
            System.err.println("许可填写失败！");
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

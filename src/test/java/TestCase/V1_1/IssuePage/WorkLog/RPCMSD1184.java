package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1184 extends BaseTest {


    @Test
    public void RPCMSD1184() throws Exception {
        try {

            Entrance.IssuePage();


            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Log"));   //点击+日志

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("2h");  //输入耗费时间

            Enter(By.name("example-text")).sendKeys("工作日志");  //输入耗费时间

            click(By.id("workLogAndPlan-cancel-button"));   //点击取消

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}

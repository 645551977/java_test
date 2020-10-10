package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1396 extends BaseTest {
    @Test
    public void RPCMSD1396() throws Exception {
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("1.5h");  //输入耗费时间

            click(By.xpath("/html/body/div[11]/div/div/div[3]/div[2]/div/div/div/div/div[5]/div/div/div[1]"));   //点击审核人框

            click(By.cssSelector("#react-select-3-option-1 > div"));  //下拉选择审核人

            Enter(By.name("example-text")).sendKeys("工作日志");  //输入备注

            click(By.id("workLogAndPlan-pendingAudit-button"));   //提交工作日志

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }


}

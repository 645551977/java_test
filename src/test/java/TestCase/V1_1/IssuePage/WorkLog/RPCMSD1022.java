package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1022 extends BaseTest {

    @Test
    public void RPCMSD1022() throws  Exception {
        try {

            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志

            click(By.cssSelector("#workLogContext_issueSelectTool > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"));   ////点击任务框

            click(By.cssSelector("#react-select-2-option-5 .\\\\_3tOl5nvkoM9qAgVwhHhK4Y"));   //下拉选择issue

            click(By.xpath("//div[@id=\\'workLogContext_datePicker\\']/div/div"));    //点击开始时间框

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(2) > .Date__DateDiv-sc-1h7o82l-0"));  //点击选择开始时间

            click(By.cssSelector("#workLogContext_issueSelectTool > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"));  //点击任务框

            click(By.cssSelector("#react-select-2-option-5 .\\_3tOl5nvkoM9qAgVwhHhK4Y"));   //是需要审核的issue

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("3h");  //输入耗费时间

            Enter(By.name("example-text")).sendKeys("我的日志");  //输入备注

            click(By.cssSelector("workLogAndPlan-pendingAudit-button"));  //提交日志
    } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}

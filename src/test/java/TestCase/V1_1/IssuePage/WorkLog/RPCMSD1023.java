package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1023 extends BaseTest {            //此处有bug待修复，切换加班时间，点击保存或者提交，加班时间不应该出现不能为空的提示

    @Test
    public void RPCMSD1023() throws Exception {
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志

            click(By.xpath("//div[@id=\\'workLogContext_datePicker\\']/div/div"));    //点击开始时间框

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(4) > .Date__DateDiv-sc-1h7o82l-0"));   //选择开始时间框

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("4.5h");  //输入耗费时间

            click(By.xpath("//div[@id=\\'workLogContext_datePicker\\']/div/div"));   //再次点击开始时间框

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(7) > .Date__DateDiv-sc-1h7o82l-0")); //再次选择开始时间框

            Enter(By.name("example-text")).sendKeys("1111");  //输入备注

            click(By.id("workLogAndPlan-pendingAudit-button"));  //提交工作日志

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }

    }
}

package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1399 extends BaseTest {    //此处有bug，待修复，修改加班时间，应该正常保存，不应该报不能为空


    @Test
    public void RPCMSD1399() throws Exception {
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("1.5h"); //输入耗费时间

            Enter(By.name("example-text")).sendKeys("工作日志"); //输入备注

            click(By.name("checkbox-overtime"));  //去掉加班框的勾选

            click(By.id("workLogAndPlan-pendingAudit-button"));  //提交工作日志


            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("3.5h"); //输入耗费时间

            Enter(By.name("example-text")).sendKeys("工作日志"); //输入备注

            clear(By.cssSelector("div.css-1cl2sn2>input"));  //加班框清空

            Enter(By.cssSelector("div.css-1cl2sn2>input")).sendKeys("30m");  //重新输入加班工时

            click(By.id("workLogAndPlan-pendingAudit-button"));  //提交工作日志

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}
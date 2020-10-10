package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1017 extends BaseTest {


    @Test
    public void RPCMSD1017() throws Exception {
        try {

            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Plan"));  //点击仅计划按钮

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("3h");   //填写当日计划时间


            Enter(By.id("workPlanContext_textfield_memo")).sendKeys("添加计划");   //填写备注

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存

            driver.navigate().refresh();  //页面刷新
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1401 extends BaseTest {
    @Test
    public void RPCMSD1401() throws Exception {
        try {

            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Plan"));  //点击仅计划按钮

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("2h");  //输入计划时间

            click(By.xpath("/html/body/div[10]/div/div/div[3]/div[2]/div/div/div/div/div[5]/div/div/div[2]/div/span"));  //点击审核人框

            click(By.cssSelector("#react-select-3-option-1 > div"));  //下拉选择审核人

            Enter(By.id("workPlanContext_textfield_memo")).sendKeys("添加需要审核的计划");  //输入备注

            click(By.id("workLogAndPlan-unsubmitted-button"));  //点击保存按钮
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}

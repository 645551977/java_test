package TestCase.V1_1.IssuePage.WorkLog;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1018 extends BaseTest {

    @Test
    public void RPCMSD1018() throws Exception {
        try {

            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Plan"));  //点击仅计划按钮

            click(By.id("workPlanContext_checkbox_checkbox"));   //点击周期按钮

            //开始时间和结束时间有问题
            Enter(By.id("react-select-workPlanContext_datePicker_startTime-input")).sendKeys("2020-07-11");


            Enter(By.id("react-select-workPlanContext_datePicker_endTime-input")).sendKeys("2020-07-14");


            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("1h");  //填写当日计划时间


            Enter(By.id("workPlanContext_textfield_memo")).sendKeys("添加计划");   //填写备注

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");

            throw new Exception(e);
        }
    }
}

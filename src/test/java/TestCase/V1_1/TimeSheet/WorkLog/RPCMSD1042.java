package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1042 extends BaseTest {
    @Test
    public void RPCMSD1042() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.TimewisePage();

            click(By.id("timSheetCalendar_toggleDialog"));  //点击时间选择框，周期三周

            click(By.id("timeCalendar_onApply"));  //点击应用按钮

            click(By.id("timSheetCalendar_onLastCycle"));  //往前切换

            click(By.id("timSheetCalendar_onNextCycle"));  //往后切换

            click(By.id("timSheetCalendar_toggleDialog"));  //再次点击时间选择框

            click(By.cssSelector("div[class='styled__NavItem-sc-716rt7-5 goIJer'][aria-posinset='1']"));  //选择周

            click(By.id("timeCalendar_onApply"));  //点击应用

            click(By.id("timSheetCalendar_onLastCycle"));  //往前切换

            click(By.id("timSheetCalendar_onNextCycle"));  //往后切换

            click(By.id("timSheetCalendar_toggleDialog")); //再次点击时间选择框

            
            click(By.cssSelector("div[class='styled__NavItem-sc-716rt7-5 goIJer'][aria-posinset='3']"));  //选择月

            click(By.id("monthCalendar_onApply"));  //点击应用

            click(By.id("timSheetCalendar_onLastCycle"));  //往前切换

            click(By.id("timSheetCalendar_onNextCycle"));  //往后切换
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

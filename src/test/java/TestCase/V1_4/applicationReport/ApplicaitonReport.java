package TestCase.V1_4.applicationReport;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class ApplicaitonReport extends BaseTest {

    @Test
   public  void ApplicaitonReport()
   {
       try {
           Entrance.ApplicationReportPage();
           //点击项目下拉框
           click(By.className("css-nk3xme-placeholder"));
       } catch (Exception e) {
           System.err.println("应用报表查看失败");
           String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
           ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
       }
   }
}

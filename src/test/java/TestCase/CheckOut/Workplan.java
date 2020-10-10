package TestCase.CheckOut;

import TestCase.Source.AllDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class Workplan extends BaseTest {

    @Test(dataProvider="planSource",dataProviderClass= AllDataProvider.class)
    public void Workplan(String spent,String desc,String expected) throws Exception {
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Plan"));  //点击+计划

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys(spent);

            Enter(By.id("workPlanContext_textfield_memo")).sendKeys(desc);

            click(By.id("workLogAndPlan-unsubmitted-button"));  //保存

            String actual=getText(By.cssSelector("#workPlanContext_textfield_div > div:nth-child(3) > span"));

            Assert.assertEquals(expected,actual);

        } catch (Exception e) {
            System.err.println("校验失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}

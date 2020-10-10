package TestCase.CheckOut;

import TestCase.Source.AllDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class WorkLog extends BaseTest {

    @Test(dataProvider="logSource",dataProviderClass= AllDataProvider.class)
    public void WorkLog(String spent,String desc,String expected) throws Exception {
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Log"));  //点击+日志

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys(spent);

            Enter(By.name("example-text")).sendKeys(desc);

            click(By.id("workLogAndPlan-unsubmitted-button"));  //保存

            String actual=getText(By.cssSelector("#jira > div.atlaskit-portal-container > div > div > div:nth-child(3) > div.css-krjp51 > div > div > div.css-1ge7qzd > div > div:nth-child(5) > div > div._29S4HN1OjeX3woUL6mgqmF > div:nth-child(2) > span"));

            Assert.assertEquals(expected,actual);
        } catch (Exception e) {
            System.err.println("校验失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

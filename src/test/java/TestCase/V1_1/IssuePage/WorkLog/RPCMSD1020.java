package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1020 extends BaseTest {


    @Test
    public void RPCMSD1020() throws Exception {

        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_dropdownMenu_type"));

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyplans"));

            click(By.id("rowDivComponent_wrapperDiv_0"));

            //将编辑按钮设置为可见
            String editplan="document.getElementById('rowDivComponent_onRowEditClick_0').style.display='block';";
            ((JavascriptExecutor) driver).executeScript(editplan);
            click(By.cssSelector("#rowDivComponent_onRowEditClick_0 > span:nth-child(1)"));

            click(By.id("workPlanContext_checkbox_checkbox"));

            WebElement workhours=driver.findElement(By.id("workPlanContext_textfield_workHour"));


            workhours.sendKeys(Keys.CONTROL,"a");    //模拟键盘的全选

            workhours.sendKeys(Keys.BACK_SPACE);  //模拟删除操作

            Thread.sleep(5000);

            workhours.sendKeys("1.5h");  //输入新的计划时间

            click(By.id("workPlanContext_textfield_memo"));

            click(By.id("workLogAndPlan-unsubmitted-button"));

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_1.IssuePage.WorkPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1006 extends BaseTest {
    @Test
    public void RPCMSD1006() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_dropdownMenu_type"));  //点击全部

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyplans"));  //点击仅计划

            click(By.id("rowDivComponent_wrapperDiv_0"));  //选中第一行

            //将删除按钮设置为可见
            String deleteplan = "document.getElementById('rowDivComponent_onRowDeleteClick_0').style.display='block';";
            ((JavascriptExecutor) driver).executeScript(deleteplan);

            click(By.id("rowDivComponent_onRowDeleteClick_0"));  //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //点击确定按钮
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_1.IssuePage.WorkPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1002 extends BaseTest {

    @Test
    public void RPCMSD1002() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_dropdownMenu_type"));  //点击全部按钮

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyplans"));  //点击仅计划

            click(By.id("rowDivComponent_wrapperDiv_0"));  //点击计划列表中的第一行数据


            //将编辑按钮设置为可见
            String editplan="document.getElementById('rowDivComponent_onRowEditClick_0').style.display='block';";
            ((JavascriptExecutor) driver).executeScript(editplan);
            //点击编辑按钮
            click(By.cssSelector("#rowDivComponent_onRowEditClick_0 > span:nth-child(1)"));  //点击编辑按钮

            click(By.id("workPlanContext_checkbox_checkbox"));  //点击周期按钮

            //模拟键盘的全选，选中当日计划
            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys(Keys.CONTROL,"a");

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys(Keys.BACK_SPACE);   //模拟删除操作，删除当日计划时间

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("1.5h");  //输入新的计划时间

            Enter(By.id("workPlanContext_textfield_memo")).sendKeys("修改周期计划");  //修改描述

            click(By.id("workLogAndPlan-unsubmitted-button"));  //点击提交
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

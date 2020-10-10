package TestCase.V1_1.IssuePage.WorkPlan;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1169 extends BaseTest {

    @Test
    public void RPCMSD1169() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_Plan"));  //点击+计划

            click(By.id("workPlanContext_checkbox_checkbox"));  //点击周期按钮

            click(By.xpath("(//div[@id=\'workPlanContext_datePicker_div\']/div/div)[1]"));  //点击选择开始时间

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(2) > .Date__DateDiv-sc-1h7o82l-0"));  //选择开始时间

            click(By.xpath("//div[@id=\'workPlanContext_datePicker_div\']/div/div)[2]"));  //点击结束开始时间框


            click(By.cssSelector("tr:nth-child(2) > .Date__DateTd-sc-1h7o82l-1:nth-child(7) > .Date__DateDiv-sc-1h7o82l-0"));  //选择结束时间

            click(By.xpath("(//div[@id=\'workPlanContext_datePicker_div\']/div/div)[2]"));  //再次点击结束时间框

            click(By.cssSelector("tr:nth-child(2) > .Date__DateTd-sc-1h7o82l-1:nth-child(7) > .Date__DateDiv-sc-1h7o82l-0"));  //重新选择结束时间


            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("");  //不输入计划时间

            Enter(By.id("workPlanContext_textfield_memo")).sendKeys("我的计划");  //输入备注

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("1+1");  //输入错误的计划时间

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存

            clear(By.id("workPlanContext_textfield_workHour"));  //清空文本

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("-1h");  //输入错误的计划时间

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存

            clear(By.id("workPlanContext_textfield_workHour"));  //清空文本

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("2dd");  //输入错误的计划时间

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存


            clear(By.id("workPlanContext_textfield_workHour"));  //清空文本

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("2w      3d");  //输入错误的计划时间

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存


            clear(By.id("workPlanContext_textfield_workHour"));  //清空文本

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("30,");  //输入计划时间

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

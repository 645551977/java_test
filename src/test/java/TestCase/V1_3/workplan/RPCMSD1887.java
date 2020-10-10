package TestCase.V1_3.workplan;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1887 extends BaseTest {
    @Test
    public void RPCMSD1887() throws Exception {

        try {
            Entrance.TimewisePage();  //初始化，打开timewise工时表


            //工作日勾选包含非工作日，添加计划
            click(By.id("timSheetCalendar_toggleDialog"));   //点击时间选择框

            click(By.cssSelector("div[class='styled__NavItem-sc-716rt7-5 goIJer'][aria-posinset='3']"));  //选择月

            click(By.id("monthCalendar_onApply"));  //点击应用

            click(By.id("DateColumn02_0_planbtn"));  //点击计划单元格

            click(By.cssSelector("input[name=\"checkbox-basic\"][value=\"周期\"]"));  //点击勾选周期按钮

            click( By.xpath("(//div[@id=\'workPlanContext_datePicker_div\']/div/div)[2]"));  //点击结束时间框

            click(By.cssSelector("tr:nth-child(2) > .Date__DateTd-sc-1h7o82l-1:nth-child(5) > .Date__DateDiv-sc-1h7o82l-0")); //选择结束时间

            click(By.id("workPlanContext_checkbox_checkbox1"));  //默认不勾选包含非工作日，点击选中

            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("3h");  //点击当日计划框，输入计划值

            Enter(By.id("workPlanContext_textfield_memo")).sendKeys("添加计划");  //点击备注框，并输入备注

            //选择任务
            click(By.cssSelector("#workPlanContext_issueSelectTool > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));

            click(By.cssSelector("#react-select-5-option-4"));  //下拉选择issue

            //勾选包含非工作日
            click(By.cssSelector("input[id=\"workPlanContext_checkbox_checkbox1\"][value=\"包含非工作日\"]"));

            click(By.id("workLogAndPlan-unsubmitted-button"));   //点击保存

            click(By.cssSelector("div[id='DateColumn02_2_planbtn'][title='Plan: 3h']"));  //点击已添加工作计划的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='查看']"));   //点击查看按钮

            click(By.id("workLogAndPlan-cancel-button"));  //点击关闭

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //点击删除按钮

            //选择休息日，添加计划
            click(By.id("DateColumn04_0_planbtn"));  //点击计划单元格

            click(By.cssSelector("input[name=\"checkbox-basic\"][value=\"周期\"]"));  //点击勾选周期按钮

            click(By.xpath("(//div[@id=\'workPlanContext_datePicker_div\']/div/div)[2]"));  //点击结束时间框

            click(By.cssSelector("tr:nth-child(2) > .Date__DateTd-sc-1h7o82l-1:nth-child(5) > .Date__DateDiv-sc-1h7o82l-0")); //选择结束时间


            Enter(By.id("workPlanContext_textfield_workHour")).sendKeys("1.5h");  //点击当日计划框，输入计划值

            Enter(By.id("workPlanContext_textfield_memo")).sendKeys("添加计划");  //点击备注框，并输入备注

            //选择任务
            click(By.cssSelector("#workPlanContext_issueSelectTool > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));

            click(By.cssSelector("#react-select-11-option-4"));  //下拉选择issue

            //取消勾选包含非工作日
            click(By.cssSelector("input[id=\"workPlanContext_checkbox_checkbox1\"][value=\"包含非工作日\"]"));

            click(By.id("workLogAndPlan-unsubmitted-button"));   //保存计划


            //新建单元格的时候，选择的是休息日，没有勾选包含非工作日，要从当前单元格后的第一个工作日单元格计算
            click(By.cssSelector("div[id='DateColumn06_2_planbtn'][title='Plan: 1.5h']"));

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='查看']"));   //点击查看按钮

            click(By.id("workLogAndPlan-cancel-button"));  //点击关闭

            click( By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //点击删除按钮

        } catch (Exception e) {
            System.err.println("计划添加失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}

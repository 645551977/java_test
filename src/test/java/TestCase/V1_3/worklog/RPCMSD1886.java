package TestCase.V1_3.worklog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;

public class RPCMSD1886 extends BaseTest {
    /***
     * 案例描述：选中工作日复制，全部删除，选择休息日复制，全部删除，保证数据干净
     * @throws Exception
     */
    @Test
    public void RPCMSD1886() throws Exception {

        try {
            Entrance.TimewisePage();  //初始化，打开timewise工时表


            //工作日勾选包含非工作日，复制日志
            click(By.id("timSheetCalendar_toggleDialog"));   //点击时间选择框

            click(By.cssSelector("div[class='styled__NavItem-sc-716rt7-5 goIJer'][aria-posinset='3']"));  //选择月

            click(By.id("monthCalendar_onApply"));  //点击应用

            //没有创建过Issue,点击最上方的单元格
            click(By.id("DateColumn02_0_logbtn"));

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("30m");    //输入耗费时间

            Enter(By.name("example-text")).sendKeys("添加工作日志");

            //选择任务
            click(By.cssSelector("#workLogContext_issueSelectTool > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"));  //点击任务框

            click(By.cssSelector("#react-select-5-option-4"));  //下拉选择issue

            click(By.id("workLogContext_textfield_remainingEstimate"));

            //全选
            Enter(By.id("workLogContext_textfield_remainingEstimate")).sendKeys(Keys.CONTROL,"a");
            //删除
            Enter(By.id("workLogContext_textfield_remainingEstimate")).sendKeys(Keys.BACK_SPACE);

            Enter(By.id("workLogContext_textfield_remainingEstimate")).sendKeys("10h");

            click(By.id("workLogAndPlan-unsubmitted-button"));  //保存

            click(By.cssSelector("div[id='DateColumn02_2_logbtn'][title='Log: 0.5h']"));  //点击已添加工作日志的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='复制']"));   //点击复制按钮

            click(By.cssSelector("div:nth-child(1) > .sc-esjQYD .Checkbox__HiddenCheckbox-sc-1asqokg-0"));  //选中选择一个连续的日期范围

            click(By.cssSelector("div.sc-eXEjpC:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")); //点击结束日

            click(By.cssSelector("tr:nth-child(5) > .Date__DateTd-sc-1h7o82l-1:nth-child(1) > .Date__DateDiv-sc-1h7o82l-0"));  //选择结束日期

            //获取元素集合
            List<WebElement> elements=driver.findElements(By.cssSelector("input[class=\"Checkbox__HiddenCheckbox-sc-1asqokg-0 hFknvi\"][type=\"checkbox\"]"));
            System.out.println(elements.size());
            elements.get(3).click();  //点击勾选包含非工作日

            //点击确定
            click(By.cssSelector("div.sc-bwCtUz >button:nth-of-type(1)"));

            click(By.id("workPlanEditTable-cancel-button"));  //点击关闭

            click(By.cssSelector("div[id='DateColumn02_2_logbtn'][title='Log: 1h']"));

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //删除日志

            click(By.id("workPlanEditTable-cancel-button"));  //点击关闭

            click(By.cssSelector("div[id='DateColumn02_2_logbtn'][title='Log: 0.5h']"));

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //删除日志


            //选择休息日，添加工作日志，复制日志
            click(By.id("DateColumn04_1_logbtn"));

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("30m");    //输入耗费时间

            Enter(By.name("example-text")).sendKeys("添加工作日志");

            //选择任务
            click(By.cssSelector("#workLogContext_issueSelectTool > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"));  //点击任务框

            click(By.cssSelector("#react-select-10-option-2"));  //下拉选择issue

            click(By.id("workLogContext_textfield_remainingEstimate"));

            //全选
            Enter(By.id("workLogContext_textfield_remainingEstimate")).sendKeys(Keys.CONTROL,"a");
            //删除
            Enter(By.id("workLogContext_textfield_remainingEstimate")).sendKeys(Keys.BACK_SPACE);

            Enter(By.id("workLogContext_textfield_remainingEstimate")).sendKeys("10h");


            click(By.id("workLogAndPlan-unsubmitted-button"));  //保存

            click(By.cssSelector("div[id='DateColumn04_3_logbtn'][title='Log: 0.5h']"));  //点击已添加工作日志的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='复制']"));   //点击复制按钮

            click(By.cssSelector("div:nth-child(1) > .sc-esjQYD .Checkbox__HiddenCheckbox-sc-1asqokg-0"));  //选中选择一个连续的日期范围

            click(By.cssSelector("div.sc-eXEjpC:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")); //点击结束日

            click(By.cssSelector("tr:nth-child(5) > .Date__DateTd-sc-1h7o82l-1:nth-child(1) > .Date__DateDiv-sc-1h7o82l-0"));  //选择结束日期

            //获取元素集合
            List<WebElement> element2=driver.findElements(By.cssSelector("input[class=\"Checkbox__HiddenCheckbox-sc-1asqokg-0 hFknvi\"][type=\"checkbox\"]"));
            System.out.println(element2.size());
            element2.get(3).click();  //点击勾选包含非工作日

            //点击确定
            click(By.cssSelector(".sc-bwCtUz > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));

            click(By.id("workPlanEditTable-cancel-button"));  //点击关闭

            click(By.cssSelector("div[id='DateColumn04_3_logbtn'][title='Log: 0.5h']"));

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //删除日志


        } catch (Exception e) {
            System.err.println("复制日志失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

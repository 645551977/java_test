package TestCase.V1_5.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class LogDrag extends BaseTest {

    @BeforeClass
    public void BeforeClass() throws Exception
    {
        Entrance.TimewisePage();

        click(By.xpath("//*[@id=\"shdsd-FineTimesheet-timeSheet-root-div\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[3]/div/div/div[2]/div/button[2]/span/span/span"));

        click(By.cssSelector("#LogWorkButton_Button_ExportExcel > span > span > span.-QAmH0HwwxRvTNotkgHAu > label > span.Checkbox__CheckboxWrapper-sc-1asqokg-3.bzvfYd > input"));

        click(By.cssSelector("div[title=\"用户 >> 项目 >> 问题\"]"));

    }
    @AfterClass
    public void AfterClass() throws Exception
    {
        click(By.cssSelector("#shdsd-FineTimesheet-timeSheet-root-div > div > div.Page__Wrapper-oj2x06-0.fwyqgM > div > div.Page__PageContent-oj2x06-5.ffPXwm > div._3Kh3whLcWSvGbzvYyc_IKG > div:nth-child(1) > div:nth-child(3) > div > div > div:nth-child(2) > div > button:nth-child(4)"));

        click(By.cssSelector("#LogWorkButton_Button_ExportExcel > span > span > span.-QAmH0HwwxRvTNotkgHAu > label > span.Checkbox__CheckboxWrapper-sc-1asqokg-3.bzvfYd > input"));

        click(By.cssSelector("div[title=\"用户 >> 项目 >> 问题\"]"));
    }

    @Test
    public void LogDrag() throws Exception {
        //初始化登录并点击问题链接
        try {
            click(By.id("timSheetCalendar_toggleDialog")); //再次点击时间选择框

            click(By.cssSelector("div[class='styled__NavItem-sc-716rt7-5 goIJer'][aria-posinset='3']"));  //选择月

            click(By.id("monthCalendar_onApply"));  //点击应用

            Actions action = new Actions(driver);

            WebElement source=getElement(By.id("DateColumn01_2_logbtn"));

            WebElement target=getElement(By.id("DateColumn11_2_logbtn"));

            action.clickAndHold(source).moveToElement(target).perform();

            action.release().perform();
            //输入当日计划时间
            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("7h");
            //点击issue框
            click(By.xpath("//*[@id=\"workLogContext_textfield_isWorked\"]"));
           /* //选择issue
            click(By.cssSelector("#react-select-4-option-1-3 > .css-1o5vhst > div"));  //报错*/

            //勾选包含非工作日
            click(By.id("workPlanContext_checkbox_checkbox1"));
            //勾选记住
            click(By.id("workPlanContext_checkbox_checkbox1"));
            //输入备注
            Enter(By.name("example-text")).sendKeys("日志拖拽");
            //点击保存
            click(By.id("workLogAndPlan-unsubmitted-button"));
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }


}

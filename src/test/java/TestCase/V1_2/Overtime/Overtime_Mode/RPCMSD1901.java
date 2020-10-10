package TestCase.V1_2.Overtime.Overtime_Mode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1901 extends BaseTest {
    @Test
    public void RPCMSD1901() throws Exception {

        try {
            //初始化登录操作
            Entrance.SettingPage();

            click(By.id("admin_menu"));   //点击齿轮图标
            click(By.id("admin_plugins_menu"));  //选择插件
            Enter(By.id("login-form-authenticatePassword")).sendKeys("123456");  //进入登录模式，输入密码
            click(By.id("login-form-submit"));  //点击确认

            click(By.id("shdsd-timesheet-workday-link")); //点击全局配置

            click(By.className("sc-gzVnrw"));  //开启关闭加班模式

            driver.navigate().refresh();  //页面刷新

            click(By.id("find_link")); //点击问题
              //10003
            click(By.id("issue_lnk_10003_lnk"));  //点击issue的id

            click(By.cssSelector("button[class=\"css-shc4i4\"][id=\"issueDetailsWebpanel_Log\"]"));  //点击+日志

            click(By.cssSelector("#workLogContext_datePicker > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击开始时间框

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(4) > .Date__DateDiv-sc-1h7o82l-0"));  //选择开始时间框


            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("30h");  //输入耗费时间

            click(By.cssSelector("#workLogContext_datePicker > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //再次点击开始时间框

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(5) > .Date__DateDiv-sc-1h7o82l-0"));  //再次选择开始时间框

            Enter(By.name("example-text")).sendKeys("工作日志");  //输入备注

            click(By.id("workLogAndPlan-unsubmitted-button"));  //保存日志

            //driver.navigate().refresh();

            click(By.cssSelector("#issueDetailsWebpanel_dropdownMenu_type > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击全部

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyLogs"));   //点击仅日志

            click(By.id("rowDivComponent_wrapperDiv_0"));  //选中第一行数据

            String view="document.getElementById('rowDivComponent_onRowViewClick_0').style.display='block';";   //将查看按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(view);

            click(By.cssSelector("#rowDivComponent_onRowViewClick_0> span:nth-child(1)"));  //点击查看按钮

            click(By.id("workLogAndPlan-cancel-button"));  //关闭


            click(By.id("admin_menu"));   //点击齿轮图标
            click(By.id("admin_plugins_menu"));  //选择插件

            click(By.id("shdsd-timesheet-workday-link")); //点击全局配置

            click(By.className("sc-gzVnrw"));  //开启关闭加班模式

            driver.navigate().refresh();  //页面刷新

            click(By.id("find_link")); //点击问题

            click(By.id("issue_lnk_10003_lnk"));  //点击issue的id

            click(By.cssSelector("button[class=\"css-shc4i4\"][id=\"issueDetailsWebpanel_Log\"]"));  //点击+日志//点击+日志

            click(By.cssSelector("#workLogContext_datePicker > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击时间框

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(3) > .Date__DateDiv-sc-1h7o82l-0"));  //选择时间框


            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("30h");  //输入耗费时间

            click(By.cssSelector("#workLogContext_datePicker > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //再次时间框

            click(By.cssSelector("tr:nth-child(1) > .Date__DateTd-sc-1h7o82l-1:nth-child(2) > .Date__DateDiv-sc-1h7o82l-0"));  //再次选择时间框

            Enter(By.name("example-text")).sendKeys("工作日志");  //输入备注

            click(By.id("workLogAndPlan-unsubmitted-button"));  //记录工作日志

            //driver.navigate().refresh();

            click(By.cssSelector("#issueDetailsWebpanel_dropdownMenu_type > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击全部

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyLogs"));   //点击仅日志

            click(By.id("rowDivComponent_wrapperDiv_0"));  //选中第一行数据

            String view2="document.getElementById('rowDivComponent_onRowViewClick_0').style.display='block';";   //将查看按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(view2);

            Thread.sleep(5000);

            click(By.cssSelector("#rowDivComponent_onRowViewClick_0> span:nth-child(1)"));  //点击查看按钮

            click(By.id("workLogAndPlan-cancel-button"));  //关闭

            click(By.id("rowDivComponent_wrapperDiv_0"));  //选中第一行数据

            String delete1="document.getElementById('rowDivComponent_onRowDeleteClick_0').style.display='block';";   //将删除按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(delete1);

            click(By.cssSelector("#rowDivComponent_onRowDeleteClick_0> span:nth-child(1)"));  //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //删除

            click(By.id("rowDivComponent_wrapperDiv_0"));  //选中第一行数据

            String delete2="document.getElementById('rowDivComponent_onRowDeleteClick_0').style.display='block';";   //将删除按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(delete2);

            click(By.cssSelector("#rowDivComponent_onRowDeleteClick_0> span:nth-child(1)"));  //点击删除按钮

            click(By.id("deleteDialog-ok-button"));  //删除

        } catch (Exception e) {
            System.err.println("日历查看失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

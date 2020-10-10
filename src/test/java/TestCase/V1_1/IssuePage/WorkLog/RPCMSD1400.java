package TestCase.V1_1.IssuePage.WorkLog;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1400 extends BaseTest {


    @Test
    public void RPCMSD1400() throws Exception {
        try {
            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("rowDivComponent_wrapperDiv_0"));  //点击第一行

            //将编辑按钮设置为可见
            String editplan = "document.getElementById('rowDivComponent_onRowEditClick_0').style.display='block';";
            ((JavascriptExecutor) driver).executeScript(editplan);

            click(By.cssSelector("#rowDivComponent_onRowEditClick_0 > span:nth-child(1)"));  //点击编辑按钮

            clear(By.id("workLogContext_textfield_isWorked"));  //清空耗费时间

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("9h");  //输入新的耗费时间

            clear(By.name("example-text"));  //清空备注框

            Enter(By.name("example-text")).sendKeys("日志修改");  //输入新的备注

            click(By.id("workLogAndPlan-pendingAudit-button"));  //点击保存

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

    }

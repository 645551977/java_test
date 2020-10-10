package TestCase.V1_1.IssuePage.WorkLog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1029 extends BaseTest {


    @Test
    public void RPCMSD1029() throws Exception {
        try {

            Entrance.IssuePage();

            click(By.id("browse_link"));

            click(By.id("admin_main_proj_link_lnk"));

            click(By.cssSelector("span[class='aui-nav-item-label'][title='问题']"));

            click(By.id("issueDetailsWebpanel_dropdownMenu_type"));  //点击全部

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyLogs"));  //点击仅日志

            click(By.id("rowDivComponent_wrapperDiv_0"));   //选中第一行数据

            String deletelog="document.getElementById('rowDivComponent_onRowDeleteClick_0').style.display='block';";   //将删除按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(deletelog);

            click(By.cssSelector("#rowDivComponent_onRowDeleteClick_0> span:nth-child(1)"));  //点击删除按钮

            click(By.id("deleteDialog-ok-button"));    //点击确定

            //现有预估删除
            click(By.id("issueDetailsWebpanel_dropdownMenu_type"));  //点击全部

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyLogs"));  //点击仅日志

            click(By.id("rowDivComponent_wrapperDiv_0"));   //选中第一行数据

            String delete="document.getElementById('rowDivComponent_onRowDeleteClick_0').style.display='block';";   //将删除按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(delete);

            click(By.cssSelector("#rowDivComponent_onRowDeleteClick_0> span:nth-child(1)"));  //点击删除按钮

            click(By.xpath("/html/body/div[11]/div/div/div[3]/div[2]/div/div/div/div[4]/div[2]/label[2]/div[1]/input"));

            click(By.id("deleteDialog-ok-button"));    //点击确定



            //设置为
            click(By.id("issueDetailsWebpanel_dropdownMenu_type"));  //点击全部

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyLogs"));  //点击仅日志

            click(By.id("rowDivComponent_wrapperDiv_0"));   //选中第一行数据

            String deleteset="document.getElementById('rowDivComponent_onRowDeleteClick_0').style.display='block';";   //将删除按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(deleteset);

            click(By.cssSelector("#rowDivComponent_onRowDeleteClick_0> span:nth-child(1)"));  //点击删除按钮

            Enter(By.xpath("/html/body/div[11]/div/div/div[3]/div[2]/div/div/div/div[4]/div[2]/label[3]/div[2]/div/div[2]/div/input")).sendKeys("2h");  //设置新的值

            click(By.id("deleteDialog-ok-button"));    //点击确定

            //增加预估时间
            click(By.id("issueDetailsWebpanel_dropdownMenu_type"));  //点击全部

            click(By.id("issueDetailsWebpanel_dropdownItem_onlyLogs"));  //点击仅日志

            click(By.id("rowDivComponent_wrapperDiv_0"));   //选中第一行数据

            String deleteadd="document.getElementById('rowDivComponent_onRowDeleteClick_0').style.display='block';";   //将删除按钮的属性设置为可见
            ((JavascriptExecutor) driver).executeScript(deleteadd);

            click(By.cssSelector("#rowDivComponent_onRowDeleteClick_0> span:nth-child(1)"));  //点击删除按钮

            Enter(By.xpath("/html/body/div[11]/div/div/div[3]/div[2]/div/div/div/div[4]/div[2]/label[4]/div[2]/div/div[2]/div/input")).sendKeys("4h");  //设置新的值

            click(By.id("deleteDialog-ok-button"));    //点击确定


        driver.navigate().refresh();
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}

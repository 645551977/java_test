package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1038 extends BaseTest {

    @Test
    public void RPCMSD1038() throws Exception {
        //初始化登录并点击问题链接
        try {

            Entrance.TimewisePage();

            click(By.id("shdsd-fineTimesheet-main-menu-link"));  //点击timewise菜单

            click(By.id("shdsd-FineTimesheet-TimeSheet-link_lnk"));  //点击打开工时表

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/span"));  //点击用户，出现下拉框

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[3]/ul/li[3]"));  //选择任务

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/div/div/div[1]"));  //点击issue框

            click(By.cssSelector("#react-select-4-option-1-3 > .css-1o5vhst > div"));   //选择第一个issue

            click(By.cssSelector("#react-select-4-option-1-3 > .css-1o5vhst > div"));  //选择第二个issue

            click(By.cssSelector(".vNlkk"));  //选择第三个issue

            click(By.cssSelector(".styledCache__StyledSpan-zohhd2-3 > span"));

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/div/div/div[2]/div[1]"));  //点击清除按钮

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/div/div/div[1]"));  //点击issue框

            click(By.cssSelector("#react-select-4-option-1-3 > .css-1o5vhst > div"));   //选择第一个issue

            click(By.cssSelector("#react-select-4-option-1-3 > .css-1o5vhst > div"));  //选择第二个issue

            click(By.className("styledCache__StyledSpan-zohhd2-3"));  //鼠标点击用户头像，焦点移出下拉框中
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

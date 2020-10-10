package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1068 extends BaseTest {

    @Test
    public void RPCMSD1042() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.TimewisePage();

            click(By.id("DateColumn02_6_logbtn"));  //点击日志单元格

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("2.5h");  //输入耗费时间



            Enter(By.name("example-text")).sendKeys("timesheet添加工作日志");  //输入描述

            click(By.id("workLogAndPlan-unsubmitted-button"));  //点击提交

            click(By.cssSelector("div[id='DateColumn02_6_logbtn'][title='Log: 2.5h']"));  //点击已添加工作日志的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='查看']"));  //点击查看按钮

            click(By.xpath("//*[@id='workLogAndPlan-cancel-button']"));  //点击关闭按钮

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/footer/div/div[1]/button/span"));  //删除日志

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

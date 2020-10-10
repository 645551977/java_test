package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1069 extends BaseTest {
    @Test
    public void RPCMSD1069() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.TimewisePage();

            click(By.id("DateColumn02_6_logbtn"));  //点击日志单元格

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("3.5h");  //输入耗费时间

            Enter(By.name("example-text")).sendKeys("timesheet添加工作日志");  //输入备注

            click(By.id("workLogAndPlan-unsubmitted-button"));  //点击保存按钮

            click(By.cssSelector("div[id='DateColumn02_6_logbtn'][title='Log: 3.5h']"));  //点击已添加工作日志的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='编辑']"));  //点击编辑按钮

            clear(By.id("workLogContext_textfield_isWorked"));  //清空原有的耗费时间

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("4h");  //输入耗费时间

            clear(By.name("example-text"));  //清空原有的备注

            Enter(By.name("example-text")).sendKeys("更新，工作已完成");  //输入备注

            click(By.id("workLogAndPlan-unsubmitted-button"));  //点击保存按钮

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

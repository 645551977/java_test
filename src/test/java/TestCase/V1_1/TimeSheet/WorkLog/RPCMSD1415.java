package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1415 extends BaseTest {

    @Test
    public void RPCMSD1415() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.TimewisePage();

            click(By.id("DateColumn02_14_logbtn"));  //点击日志单元格

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("30m");    //输入耗费时间

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/div/div[2]/div[5]/div/div/div[1]"));  //点击审核人框

            click(By.cssSelector("#react-select-6-option-0 .\\\\_3tOl5nvkoM9qAgVwhHhK4Y"));  //下拉选择审核人

            Enter(By.name("example-text")).sendKeys("添加工作日志");

            click(By.id("workLogAndPlan-unsubmitted-button")); //保存日志

            click(By.cssSelector("div[id='DateColumn02_14_logbtn'][title='Log: 0.5h']"));  //点击已添加工作日志的单元格

            click( By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='编辑']"));   //点击编辑按钮

            clear(By.id("workLogContext_textfield_isWorked"));   //清空原有的耗费时间

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("3.5h");

            clear(By.name("example-text"));   //清空原有的备注

            Enter(By.name("example-text")).sendKeys("更新日志");

            click(By.id("workLogAndPlan-unsubmitted-button")); //记录工作日志

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/footer/div/div[1]/button/span"));  //删除日志driver.findElement(By.id("DateColumn02_14_logbtn")).click();  //点击日志单元格

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("30m");    //输入耗费时间

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/div/div[2]/div[5]/div/div/div[1]"));  //点击审核人框

            click(By.cssSelector("#react-select-6-option-0 .\\_3tOl5nvkoM9qAgVwhHhK4Y"));   //下拉选择审核人

            Enter(By.name("example-text")).sendKeys("添加工作日志");

            click(By.id("workLogAndPlan-unsubmitted-button"));  //保存日志

            click(By.cssSelector("div[id='DateColumn02_14_logbtn'][title='Log: 0.5h']"));  //点击已添加工作日志的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='编辑']"));   //点击编辑按钮

            clear(By.id("workLogContext_textfield_isWorked"));   //清空原有的耗费时间

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("3.5h");

            clear(By.name("example-text"));   //清空原有的备注

            Enter(By.name("example-text")).sendKeys("更新日志");

            click(By.id("workLogAndPlan-unsubmitted-button")); //记录工作日志

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/footer/div/div[1]/button/span")); //删除日志
        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

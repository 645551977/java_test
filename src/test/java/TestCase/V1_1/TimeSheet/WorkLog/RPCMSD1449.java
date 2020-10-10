package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1449 extends BaseTest {
    /*
    无需审核，关闭加班模式，添加工作日志
     */
    @Test
    public void RPCMSD1449() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.TimewisePage();

            click(By.id("DateColumn16_4_logbtn"));  //点击日志单元格

            Enter(By.id("workLogContext_textfield_isWorked")).sendKeys("1h");    //输入耗费时间

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/div/div[2]/div[5]/div/div/div[1]"));  //点击审核人框

            click(By.cssSelector("#react-select-6-option-0 .\\_3tOl5nvkoM9qAgVwhHhK4Y"));   //下拉选择审核人

            Enter(By.name("example-text")).sendKeys("添加工作日志");

            click(By.id("workLogAndPlan-submit-button"));  //保存日志

            click(By.cssSelector("div[id='DateColumn16_4_logbtn'][title='Log: 1h']"));  //点击已添加工作日志的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='复制']"));   //点击复制按钮

            click(By.cssSelector("div:nth-child(1) > .sc-esjQYD .Checkbox__HiddenCheckbox-sc-1asqokg-0"));  //选中选择一个连续的日期范围

            click(By.cssSelector(".sc-hwwEjo:nth-child(2) .css-1pcexqc-container")); //点击结束日期框

            click(By.cssSelector("tr:nth-child(5) > .Date__DateTd-sc-1h7o82l-1:nth-child(3) > .Date__DateDiv-sc-1h7o82l-0"));  //选择结束日期

            click(By.cssSelector(".sc-kIPQKe > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定

            click(By.id("workPlanEditTable-cancel-button"));   //关闭列表页


            click(By.cssSelector("div[id='DateColumn16_4_logbtn'][title='Log: 2h']"));  //点击已添加工作日志的单元格

            click(By.cssSelector("div[class='QjjEkaJOfZJKuLEsEJaTL'][title='删除']"));   //点击删除按钮

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/footer/div/div[1]/button/span"));  //删除日志

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

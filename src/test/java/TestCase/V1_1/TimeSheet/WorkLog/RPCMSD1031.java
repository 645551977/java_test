package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1031 extends BaseTest {
    @Test
    public void RPCMSD1031() throws Exception {
        //初始化登录并点击问题链接
        try {
            Entrance.TimewisePage();

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/div/div/div[1]")); //点击用户框

            click(By.id("react-select-3-option-1-6"));  //选择第一个用户

            click(By.id("react-select-3-option-1-0"));  //选择第二个用户

            click(By.className("styledCache__StyledSpan-zohhd2-3"));  //鼠标点击用户头像，焦点移出下拉框中

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/div/div/div[2]/div[1]/span"));  //点击下拉框

            click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/div/div/div[2]/div[1]/span"));  //再次点击下拉框

            click(By.id("react-select-3-option-1-0"));  //下拉选择第一个用户

            click(By.className("styledCache__StyledSpan-zohhd2-3")); //鼠标点击用户头像，焦点移出下拉框中

        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

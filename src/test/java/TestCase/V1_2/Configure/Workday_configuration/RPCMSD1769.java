package TestCase.V1_2.Configure.Workday_configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1769 extends BaseTest {


    @Test
    public void RPCMSD1769() throws Exception {
        //初始化到配置页面
        try {
            Entrance.SettingPage();
            //点击查看
            click(By.cssSelector("div[class=\"_3hJhlYslAIO6ZcKEEbsGxU\"][title=\"查看\"]"));
            //点击关闭
            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));  //关闭工作日查看框

        } catch (Exception e) {
            System.err.println("页面查看失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_2.Configure.Calendar_configuration;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1761 extends BaseTest {

    @Test
    public void RPCMSD1761() throws Exception {
        //初始化登录操作
        try {
            Entrance.SettingPage();



        }
        catch (Exception e) {
            System.err.println("日历方案主页面查看失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

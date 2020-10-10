package TestCase.V1_2.Configure.Workday_configuration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1772 extends BaseTest {
    @Test
    public void RPCMSD1772() throws Exception {
        //初始化登录操作
        try {
            Entrance.SettingPage();

            click(By.cssSelector("div[class=\"_2Dkb1HmVY9OltOw5tQhLYd\"][title=\"删除\"]"));  //点击删除

            click(By.cssSelector("button[class=\"css-ww79x\"][type=\"button\"]"));  //点击确定

        } catch (Exception e) {
            System.err.println("删除失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

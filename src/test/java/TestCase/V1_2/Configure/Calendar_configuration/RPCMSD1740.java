package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;

public class RPCMSD1740 extends BaseTest {

    @Test
    public void RPCMSD1740() throws Exception {
        //初始化登录并到工作日日页面
        try {
            Entrance.SettingPage();
            //点击到日历页面
            Thread.sleep(4000);

            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();

           click(By.cssSelector("div[class=\"_3hJhlYslAIO6ZcKEEbsGxU\"][title=\"查看\"]")); //查看

            //关闭方案设置，返回到主页面
            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));


        } catch (Exception e) {
            System.err.println("日历查看失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

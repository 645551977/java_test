package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;


public class RPCMSD1764 extends BaseTest {

    @Test
    public void RPCMSD1764() throws Exception {
        //初始化登录操作
        try {
            Entrance.SettingPage();


            //获取元素集合
            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();

           click(By.cssSelector("div[class=\"_2Dkb1HmVY9OltOw5tQhLYd\"][title=\"删除\"]")); //删除

           click(By.cssSelector(".css-ww79x > span:nth-child(1) > span:nth-child(1)"));


        } catch (Exception e) {
            System.err.println("日历方案删除失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

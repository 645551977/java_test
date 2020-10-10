package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;


public class RPCMSD1882 extends BaseTest {
    @Test
    public void RPCMSD1882() throws Exception {
        //初始化登录操作
        try {
            Entrance.SettingPage();

            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();
            //点击复制
           click(By.cssSelector("div[class=\"_3hJhlYslAIO6ZcKEEbsGxU\"][title=\"复制\"]"));
            //点击确认
           click(By.cssSelector(".css-1yx6h60 > span:nth-child(1) > span:nth-child(1)"));
            //点击查看
            click(By.cssSelector("div[class=\"_3hJhlYslAIO6ZcKEEbsGxU\"][title=\"查看\"]"));
            //点击日历方案设置框，返回到主页面
           click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));


        } catch (Exception e) {
            System.err.println("复制失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.Random;


public class RPCMSD1741 extends BaseTest {

    @Test
    public void RPCMSD1741() throws Exception {
        //初始化登录并到工作日日页面
        try {
            Entrance.SettingPage();
            //点击到日历页面
            click(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[1]/div/div/ul/li[2]"));
            //编辑名称
            Enter(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div")).click();
            Enter(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div/input")).sendKeys(Keys.CONTROL, "a");
            Random random = new Random();
            int i = random.nextInt(100000);
            Enter(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div/input")).sendKeys("日历方案" + i);
            click(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[1]/div"));
            //编辑详情
            click(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div"));
            Enter(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div/input")).sendKeys(Keys.CONTROL, "a");
            Enter(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div/input")).sendKeys("日历方案详情" + i);
            click(By.xpath("//*[@id=\"shdsd-FineTimesheet-settingPage-root-div\"]/div/div/div[2]/div/div/div[1]/div"));
        } catch (Exception e) {
            System.err.println("编辑日历方案名称或描述失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

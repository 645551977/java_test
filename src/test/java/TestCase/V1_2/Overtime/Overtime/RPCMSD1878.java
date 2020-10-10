package TestCase.V1_2.Overtime.Overtime;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1878 extends BaseTest {
    @Test
    public void RPCMSD1878() throws Exception {
        //初始化登录操作
        try {
            Entrance.SettingPage();

            Thread.sleep(5000);

            click(By.id("admin_menu"));   //点击齿轮图标
            click(By.id("admin_plugins_menu"));  //选择插件
            Enter(By.id("login-form-authenticatePassword")).sendKeys("123456");  //进入登录模式，输入密码

            click(By.id("login-form-submit"));  //点击确认

            click(By.id("shdsd-timesheet-workday-link")); //点击全局配置

            click(By.className("sc-gzVnrw"));  //关闭加班模式

            click(By.className("sc-gzVnrw"));  //开启加班模式

        } catch (Exception e) {
            System.err.println("加班模式开关失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

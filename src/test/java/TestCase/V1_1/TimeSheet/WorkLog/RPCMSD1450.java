package TestCase.V1_1.TimeSheet.WorkLog;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1450 extends BaseTest {
    /*
    无需审核，关闭加班模式，添加工作日志
     */
    @Test
    public void RPCMSD1450() throws Exception {
        try {
        //初始化登录并点击问题链接
        //开启加班模式
         click(By.id("admin_menu"));  //点击齿轮图标

         click(By.id("admin_plugins_menu"));   //点击插件按钮

         Enter(By.id("login-form-authenticatePassword")).sendKeys("123456");   //输入密码

         click(By.id("login-form-submit"));  //点击确认按钮

         click(By.id("shdsd-timesheet-workday-link"));  //点击全部配置

         click(By.cssSelector("input[id='uid2'][type='checkbox']"));   //开启加班模式


        } catch (Exception e) {
            System.err.println("");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

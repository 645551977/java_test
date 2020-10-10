package TestCase.V1_3.systemSetting;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

/**
 * 全局加班：加班模式,开启或关闭
 */
public class RPCMSD1878 extends BaseTest {
    static BaseTest bs=new BaseTest();

    @Test
    public void RPCMSD1878() throws Exception {
        //初始化登录并到工作日日页面
        try {
            bs.getUrl(Properties.url+"/login.jsp");

            driver.manage().window().setSize(new Dimension(1445, 832));

            click(By.id("login-form-username"));

            Enter(By.id("login-form-username")).sendKeys(Properties.user);

            click(By.id("login-form-password"));

            Enter(By.id("login-form-password")).sendKeys(Properties.pwd);

            click(By.id("login-form-submit"));

            driver.get(Properties.url+"/secure/admin/shdsd-TimeWise-WorkdayScheme.jspa");

            click(By.xpath("//*[@id=\"shdsd-FineTimesheet-SystemSetting-root-div\"]/div/div/div/div/div[2]/div/div/div/div[2]/label/div"));
            
        } catch (Exception e) {
            System.err.println("添加日历方案失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

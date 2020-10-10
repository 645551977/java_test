package TestCase.V1_2.Configure.Workday_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1771 extends BaseTest {

    @Test
    public void RPCMSD1771() throws Exception {
        //初始化登录操作
        try {
        Entrance.SettingPage();

        click(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div"));


        click(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div/input"));

        //全选
        Enter(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div/input")).sendKeys(Keys.CONTROL,"a");
        //删除
        Enter(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);

        //全选
        Enter(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div/div/div/input")).sendKeys(""+System.currentTimeMillis());

        click(By.className("_10ijzxBeqxAtoiOKvgCxhX"));


        //点击文本框
        click(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div"));

     //点击文本框
    click(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div/input"));


     //全选
     Enter(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div/input")).sendKeys(Keys.CONTROL,"a");
     //删除
     Enter(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div/input")).sendKeys(Keys.BACK_SPACE);

     //全选
     Enter(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[4]/div[1]/div/div/div[2]/div/div[3]/div/div/div/div/form/div/div/div/div/input")).sendKeys(""+System.currentTimeMillis());

     click(By.className("_10ijzxBeqxAtoiOKvgCxhX"));

    } catch (Exception e) {
            System.err.println("名称和描述修改失败！");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }

}

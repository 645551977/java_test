package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.io.IOException;
import java.util.List;


public class RPCMSD1763 extends BaseTest {

    @Test
    public void RPCMSD1763() throws Exception {
        //初始化登录工作
        try {
            Entrance.SettingPage();

            //点击到日历页面

            //获取元素集合
            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();

            //点击第一行的设置按钮,弹出日历配置框
           click(By.cssSelector("div[class=\"_3hJhlYslAIO6ZcKEEbsGxU\"][title=\"设置\"]"));


            click(By.cssSelector("button.css-1yx6h60:nth-child(2) > span:nth-child(1) > span:nth-child(1)"));   //点击导入按钮


            click(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请选择文件\"]"));//文件上传

            try {
                Entrance.exeRunning("Upload", "CSV");
            } catch (IOException e) {
                System.err.println("文件上传失败");
            }
            //下一步
           click(By.cssSelector(".css-1nrhui0 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));

            //导入
            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-1t9wx4k div.css-1nrhui0 div.css-e6hn7k div.css-1ge7qzd div div div button.css-1yx6h60 span.css-j8fq0c span.css-t5emrf"));

            //关闭，返回到日历设置页面
           click(By.cssSelector("button[class=\"css-1tr7zb4\"][type=\"button\"]"));


            //点击编辑按钮
           click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"编辑\"]"));

            //编辑名称和类型
            click(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]"));

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys(Keys.CONTROL,"a");  //全选

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys(Keys.BACK_SPACE);  //清空

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("名称修改0000");  //全选


            //下拉切换类型
            click(By.className("css-1tqx6ej-indicatorContainer"));  //点击类型下拉框

            click(By.id("react-select-3-option-0"));  //选择类型

            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"保存\"]"));  //保存

            //修改名称后，点击取消操作

            //点击编辑按钮
            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"编辑\"]"));

            //编辑名称和类型
            click(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]"));

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys(Keys.CONTROL,"a");  //全选

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys(Keys.BACK_SPACE);  //清空

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("新的名称");  //全选


           click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"取消\"]"));  //取消

            //点击删除按钮
           click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"删除\"]"));


            List<WebElement> sureBtn= driver.findElements(By.cssSelector("button[class=\"css-ww79x\"][type=\"button\"]"));

            sureBtn.get(1).click();  //点击确定按钮

           click(By.cssSelector("button[class=\"css-ww79x\"][type=\"button\"]"));  //点击清除

            List<WebElement> clearBtn= driver.findElements(By.cssSelector("button[class=\"css-ww79x\"][type=\"button\"]"));

            clearBtn.get(1).click();  //点击确定按钮

            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));  //关闭日历设置

        }catch (Exception e){
            System.err.println("日历方案设置失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.io.IOException;
import java.util.List;

public class RPCMSD1721 extends BaseTest {
    @Test
    public void RPCMSD1721() throws Exception {
        //初始化操作
        try {
            Entrance.SettingPage();

            //获取元素集合
            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();
            //点击添加按钮
            click(By.cssSelector(".css-j8fq0c"));

            //新增日历方案，输入名称和描述
            Enter(By.cssSelector(".css-1rmy9fa")).sendKeys("日历方案" + System.currentTimeMillis());
            Enter(By.cssSelector("textarea")).sendKeys("日历方案描述" + System.currentTimeMillis());
            //取消设置日历
            click(By.cssSelector(".Checkbox__LabelText-sc-1asqokg-2"));
            //点击确认按钮
           click(By.className("css-1yx6h60"));

            //点击添加按钮
           click(By.cssSelector(".css-j8fq0c"));
            //driver.findElement(By.cssSelector(".css-1rmy9fa")).click();//新增日历方案，不输入名称和描述
            //点击确认按钮，提示不能为空
           click(By.className("css-1yx6h60"));
            //点击取消按钮，关闭页面，返回到列表页
           click(By.className("css-1akzpg4"));


            //点击添加按钮
            click(By.cssSelector(".css-j8fq0c"));
            //driver.findElement(By.cssSelector(".css-1rmy9fa")).click();
            //新增日历方案，输入名称，不输入描述
            Enter(By.cssSelector(".css-1rmy9fa")).sendKeys("日历方案"+System.currentTimeMillis() );

            //去掉勾选设置日历
            click(By.cssSelector(".Checkbox__LabelText-sc-1asqokg-2"));
            //点击确认按钮，添加成功
            click(By.className("css-1yx6h60"));


            //点击添加按钮
            click(By.cssSelector(".css-j8fq0c"));
            //driver.findElement(By.cssSelector(".css-1rmy9fa")).click();
            //新增日历方案，输入名称，不输入描述
            Enter(By.cssSelector(".css-1rmy9fa")).sendKeys("日历方案"+System.currentTimeMillis() );

            //点击确认按钮
           click(By.className("css-1yx6h60"));

            click(By.cssSelector("button.css-1yx6h60:nth-child(2) > span:nth-child(1) > span:nth-child(1)"));   //点击导入按钮


           click(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请选择文件\"]"));//文件上传

            try {
                Entrance.exeRunning("Upload", "CSV");
            } catch (IOException e) {
                System.err.println("文件上传失败");
            }

            Thread.sleep(6000);
            //下一步
            click(By.cssSelector(".css-1nrhui0 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));

            //导入
           click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-1t9wx4k div.css-1nrhui0 div.css-e6hn7k div.css-1ge7qzd div div div button.css-1yx6h60 span.css-j8fq0c span.css-t5emrf"));

            //关闭，返回到日历设置页面
           click(By.cssSelector("button[class=\"css-1tr7zb4\"][type=\"button\"]"));
            //关闭方案设置，返回到主页面
           click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));
        } catch (Exception e) {
            System.err.println("日历方案添加失败！");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

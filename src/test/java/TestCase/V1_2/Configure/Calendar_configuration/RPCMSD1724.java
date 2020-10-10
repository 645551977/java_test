package TestCase.V1_2.Configure.Calendar_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;

public class RPCMSD1724 extends BaseTest {
    @Test
    public void RPCMSD1724()  throws Exception{
        //初始化登录操作
        try {
            Entrance.SettingPage();

            Thread.sleep(5000);
            //获取元素集合
            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();

            Thread.sleep(8000);

            //点击添加按钮
            click(By.cssSelector(".css-j8fq0c"));
            //driver.findElement(By.cssSelector(".css-1rmy9fa")).click();
            //新增日历方案，输入名称和描述
            Enter(By.cssSelector(".css-1rmy9fa")).sendKeys("日历方案" + System.currentTimeMillis());
            Enter(By.cssSelector("textarea")).sendKeys("日历方案描述" + System.currentTimeMillis());
            //点击确认按钮
            click(By.className("css-1yx6h60"));

            //工作日（周一）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(2) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-3-option-1"));  //选择类型

            //点击确定
            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1)"));

            //工作日（周二）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(3) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-5-option-1"));  //选择类型

           click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周三）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(4) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-7-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周四）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(5) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-9-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周五）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(6) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-11-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周六）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("放假啦");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(7) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1)")); //点击确定

            //添加假日（周日）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("放假啦");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(1) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1)")); //点击确定

            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));  //关闭日历配置

        } catch (Exception e) {
            System.err.println("单条日历添加失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

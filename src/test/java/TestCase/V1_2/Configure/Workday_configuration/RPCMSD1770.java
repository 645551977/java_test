package TestCase.V1_2.Configure.Workday_configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;

public class RPCMSD1770 extends BaseTest {

    @Test
    public void RPCMSD1770() throws Exception {
        //初始化登录操作
        try {
            Entrance.SettingPage();

            click(By.cssSelector(".css-t5emrf")); //添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("工作日发方案" + System.currentTimeMillis());  //输入名称

            Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("方案" + System.currentTimeMillis());

            click(By.className("css-1yx6h60"));   //点击确认

            //关联第一个日历方案

            click(By.className("css-kb4noc-placeholder"));  //点击下拉框

            click(By.id("react-select-2-option-1"));//下拉选择日历方案

            click(By.cssSelector(".css-1ge7qzd > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加

            //关联第二个日历方案

            click(By.cssSelector(".css-dnjv80"));  //点击下拉框

            click(By.id("react-select-2-option-2"));//下拉选择日历方案

            click(By.cssSelector(".css-1ge7qzd > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加

            //关联第三个日历方案

            click(By.cssSelector(".css-dnjv80"));  //点击下拉框

            click(By.id("react-select-2-option-3"));//下拉选择日历方案

            click(By.cssSelector(".css-1ge7qzd > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加

            //关联第四个日历方案

            click(By.cssSelector(".css-dnjv80"));  //点击下拉框

            click(By.id("react-select-2-option-4"));//下拉选择日历方案

            click(By.cssSelector(".css-1ge7qzd > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加


            List<WebElement> elementsMove=driver.findElements(By.cssSelector("div[class=\"_3hJhlYslAIO6ZcKEEbsGxU\"][title=\"移动\"]"));  //移动调整顺序
            System.out.println(elementsMove.size());

            elementsMove.get(0).click();   //调整顺序

            elementsMove.get(1).click();   //调整顺序


            click(By.cssSelector(".css-1ge7qzd > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)"));  //删除

            click(By.cssSelector(".css-ww79x > span:nth-child(1) > span:nth-child(1)"));   //确定

            click(By.cssSelector(".css-1ge7qzd > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)"));  //删除

            click(By.cssSelector(".css-ww79x > span:nth-child(1) > span:nth-child(1)"));   //确定


            click(By.cssSelector(".css-1ge7qzd > div:nth-child(2) > div:nth-child(2) > p:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击编辑

            click(By.cssSelector(".css-opr9i5 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));   //切换工作模式  自定义

            List<WebElement> weekday =driver.findElements(By.className("Checkbox__HiddenCheckbox-sc-1asqokg-0"));  //获取周一到周日所有checkbox的集合

            weekday.get(1).click();   //周二休息

            weekday.get(4).click();  //周五休息

            List<WebElement> workHour =driver.findElements(By.cssSelector("div.css-1dy303k>input"));   //获取所有工作日框的集合


            workHour.get(0).sendKeys(Keys.CONTROL, "a");

            workHour.get(0).sendKeys(Keys.BACK_SPACE);

            workHour.get(0).sendKeys("7.5");  //输入新的工作日小时数

            workHour.get(1).sendKeys(Keys.CONTROL, "a");

            workHour.get(1).sendKeys(Keys.BACK_SPACE);

            workHour.get(1).sendKeys("7.5");  //输入新的工作日小时数

            workHour.get(2).sendKeys(Keys.CONTROL, "a");

            workHour.get(2).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            workHour.get(2).sendKeys("7.5");  //输入新的工作日小时数

            workHour.get(3).sendKeys(Keys.CONTROL, "a");

            workHour.get(3).sendKeys(Keys.BACK_SPACE);  //清除原本的值

            workHour.get(3).sendKeys("7.5");  //输入新的工作日小时数

            workHour.get(4).sendKeys(Keys.CONTROL, "a");

            workHour.get(4).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            workHour.get(4).sendKeys("7.5");  //输入新的工作日小时数


            click(By.className("css-1yx6h60"));  //点击保存按钮



            click(By.cssSelector(".css-1ge7qzd > div:nth-child(2) > div:nth-child(2) > p:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击编辑

            click(By.cssSelector(".css-opr9i5 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));  //切换到5+2工作模式

            List<WebElement> dayHour =driver.findElements(By.cssSelector("div.css-1dy303k>input"));   //获取所有工作日框的集合


            dayHour.get(0).sendKeys(Keys.CONTROL, "a");

            dayHour.get(0).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            dayHour.get(0).sendKeys("9");  //输入新的工作日小时数

            dayHour.get(1).sendKeys(Keys.CONTROL, "a");

            dayHour.get(1).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            dayHour.get(1).sendKeys("9");  //输入新的工作日小时数

            dayHour.get(2).sendKeys(Keys.CONTROL, "a");

            dayHour.get(2).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            dayHour.get(2).sendKeys("9");  //输入新的工作日小时数

            dayHour.get(3).sendKeys(Keys.CONTROL, "a");

            dayHour.get(3).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            dayHour.get(3).sendKeys("9");  //输入新的工作日小时数

            dayHour.get(4).sendKeys(Keys.CONTROL, "a");

            dayHour.get(4).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            dayHour.get(4).sendKeys("9");  //输入新的工作日小时数

            click(By.className("css-1akzpg4"));  //点击取消按钮


            click(By.cssSelector(".css-1ge7qzd > div:nth-child(2) > div:nth-child(2) > p:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击编辑

            click(By.cssSelector(".css-opr9i5 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));  //切换到6+1工作模式

            List<WebElement> hour =driver.findElements(By.cssSelector("div.css-1dy303k>input"));   //获取所有工作日框的集合


            hour.get(0).sendKeys(Keys.CONTROL, "a");

            hour.get(0).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            hour.get(0).sendKeys("7");  //输入新的工作日小时数

            hour.get(1).sendKeys(Keys.CONTROL, "a");

            hour.get(1).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            hour.get(1).sendKeys("7");  //输入新的工作日小时数

            hour.get(2).sendKeys(Keys.BACK_SPACE, "a");

            hour.get(2).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            hour.get(2).sendKeys("7");  //输入新的工作日小时数

            hour.get(3).sendKeys(Keys.CONTROL, "a");

            hour.get(3).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            hour.get(3).sendKeys("7");  //输入新的工作日小时数

            hour.get(4).sendKeys(Keys.CONTROL, "a");

            hour.get(4).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            hour.get(4).sendKeys("7");  //输入新的工作日小时数

            hour.get(5).sendKeys(Keys.CONTROL, "a");

            hour.get(5).sendKeys(Keys.BACK_SPACE);   //清除原本的值

            hour.get(5).sendKeys("7");  //输入新的工作日小时数

            click(By.className("css-1yx6h60"));  //点击保存按钮

            click(By.cssSelector("div[class='_1pNHlDd22QhtFyNjpzMA7C'][title='关闭']"));   //关闭方案设置

        } catch (Exception e) {
            System.err.println("方案设置失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

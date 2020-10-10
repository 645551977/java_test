package TestCase.V1_2.ConfigureTimeSheets.timesheet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.WebElement;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1892 extends BaseTest {

    @Test
    public void RPCMSD1892() throws Exception {
        //测试项目名称工时测试项目
        //1.添加日历方案  2.关联到工作日方案  3.应用到项目中  4.查看timesheet
        try {
            Entrance.SettingPage();

            Thread.sleep(5000);
            //获取元素集合
            List<WebElement> elements=driver.findElements(By.className("_9gTZan3VJ0D5p7NY_OMBs"));
            //根据索引，点击日历方案配置
            elements.get(1).click();
            //点击添加按钮
            click(By.cssSelector(".css-j8fq0c"));

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("日历" + System.currentTimeMillis());  //输入名称

            Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("" + Math.random());  //输入描述

            click(By.cssSelector(".css-1yx6h60 > span:nth-child(1) > span:nth-child(1)"));  //点击确认


            //工作日（周一）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(2) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-3-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周二）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(3) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-5-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周三）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(4) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-7-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周四）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(5) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-9-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周五）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(6) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-11-option-1"));  //选择类型

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定


            //工作日（周六）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("放假啦");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(7) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定

            //添加假日（周日）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("放假啦");

            click(By.className("css-kb4noc-placeholder"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(1) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector(".sc-fMiknA > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")); //点击确定

            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));  //关闭日历配置


             Thread.sleep(5000);
            //设置工作日方案配置
            //根据元素集合的索引，点击工作日方案配置
            elements.get(0).click();
            //添加按钮
            click(By.cssSelector("button[class=\"css-shc4i4\"][type=\"button\"]"));


            //driver.findElement(4, By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[1]/div/div/button/span/span")).click(); //添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("工作日方案" + System.currentTimeMillis());  //输入名称

            Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("方案" + System.currentTimeMillis());

            click(By.className("css-1yx6h60"));   //点击确认
            //点击日历方案下拉框
            click(By.className("css-kb4noc-placeholder"));  //点击下拉框

            click(By.id("react-select-16-option-0"));//下拉选择日历方案（刚刚新建的日历方案）

            click(By.cssSelector(".css-1ge7qzd > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加


            click(By.cssSelector(".css-1ge7qzd > div:nth-child(2) > div:nth-child(2) > p:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击编辑

            click(By.cssSelector(".css-opr9i5 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > label:nth-child(1) > div:nth-child(1) > input:nth-child(1)"));   //切换工作模式  自定义

            List<WebElement> weekday = driver.findElements(By.className("Checkbox__HiddenCheckbox-sc-1asqokg-0"));  //获取周一到周日所有checkbox的集合

            weekday.get(1).click();   //周二休息

            weekday.get(4).click();  //周五休息

            List<WebElement> workHour = driver.findElements(By.cssSelector("div.css-1dy303k>input"));   //获取所有工作日框的集合


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

            workHour.get(4).sendKeys(Keys.BACK_SPACE);   //清除原本的值*/

           workHour.get(4).sendKeys("7.5");  //输入新的工作日小时数

            click(By.className("css-1yx6h60"));  //点击保存按钮

            click(By.cssSelector("div[class='_1pNHlDd22QhtFyNjpzMA7C'][title='关闭']"));   //关闭方案设置


            click(By.id("admin_menu")); //点击窗口右上角的齿轮图标

            click(By.id("admin_project_menu"));  //选择项目

            Enter(By.id("project-filter-text")).sendKeys("工时项目"); //搜索项目

            click(By.cssSelector("a[title=\"工时项目\"][href=\"/plugins/servlet/project-config/GSXM/summary\"]"));  //点击项目

            click(By.id("shdsd-timesheet-projectSetting-link"));  //点击timewise配置

            click(By.cssSelector("div[class=\"QjjEkaJOfZJKuLEsEJaTL\"][title=\"编辑\"]"));  //点击编辑按钮

            click(By.cssSelector(".css-17qmjyt-singleValue"));  //点击下拉框

            click(By.id("react-select-5-option-0"));   //切换第一个选项

            click(By.className("css-1yx6h60"));  //点击确定按钮


            //跳转到timesheet页面
            Entrance.TimewisePage();


            click(By.id("timSheetCalendar_toggleDialog"));   //点击时间选择框

            click(By.cssSelector("div[class='styled__NavItem-sc-716rt7-5 goIJer'][aria-posinset='3']"));  //选择月

            click(By.id("monthCalendar_onApply"));  //点击应用

            click(By.cssSelector(".lfrSjQ > div:nth-child(1) > div:nth-child(1) > span:nth-child(2)"));  //点击用户，出现下拉框

            click(By.cssSelector("li._3dqrXDa6WC39CV-ML4d7Wr:nth-child(1)"));  //点击项目


            click(By.cssSelector(".lfrSjQ > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击项目：全部框

            click(By.cssSelector("#react-select-4-option-1-0 > .css-1o5vhst > div"));  //选择工时项目

            click(By.className("styledCache__StyledSpan-zohhd2-3"));  //鼠标点击用户头像，焦点移出下拉框中


        } catch (Exception e) {
            System.err.println("鼠标悬浮效果失败！");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

package TestCase.V1_2.ConfigureTimeSheets.calendarTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;

public class RPCMSD1892 extends BaseTest {

    @Test
    public void RPCMSD1889() throws Exception {
        //测试项目名称工时测试项目
        //1.添加日历方案  2.关联到工作日方案  3.应用到项目中  4.查看timesheet
        try {
        Entrance.SettingPage();

        click(By.xpath("/html/body/div[1]/section/div/div/div/div[1]/div/div/ul/li[2]/div"));  //点击日历方案配置

        click(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[1]/div/div/button/span/span"));  //点击添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("日历" + System.currentTimeMillis());  //输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("" + Math.random());  //输入描述

        click(By.cssSelector(".css-1yx6h60 > span:nth-child(1) > span:nth-child(1)"));  //点击确认


        //工作日（周一）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(2) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-3-option-1"));  //选择类型

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/button[1]/span/span")); //点击确定


        //工作日（周二）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

       Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(3) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-5-option-1"));  //选择类型

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/button[1]/span/span")); //点击确定


        //工作日（周三）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

       Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(4) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-7-option-1"));  //选择类型

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/button[1]/span/span")); //点击确定


        //工作日（周四）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(5) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-9-option-1"));  //选择类型

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/button[1]/span/span")); //点击确定


        //工作日（周五）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("上班中");

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(6) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.cssSelector("div.css-1pcexqc-container:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));  //点击类型 下拉框

            click(By.id("react-select-11-option-1"));  //选择类型

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/button[1]/span/span")); //点击确定


        //工作日（周六）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("放假啦");

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(7) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/button[1]/span/span")); //点击确定

        //添加假日（周日）
            click(By.cssSelector("button.css-1yx6h60:nth-child(1) > span:nth-child(1) > span:nth-child(1)"));  //点击添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"请输入名称\"]")).sendKeys("放假啦");

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]"));  //点击日期选择框

            click(By.cssSelector("tr:nth-child(3) > .Date__DateTd-sc-1h7o82l-1:nth-child(1) > .Date__DateDiv-sc-1h7o82l-0"));  //选择日期

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/button[1]/span/span")); //点击确定

            click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]"));  //关闭日历配置*/

            click(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div/div/div[1]/div/div/button/span/span")); //添加按钮

       Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("工作日发方案" + System.currentTimeMillis());  //输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("方案" + System.currentTimeMillis());

            click(By.className("css-1yx6h60"));   //点击确认

        //关联第一个日历方案

            click(By.className("css-kb4noc-placeholder"));  //点击下拉框

            click(By.id("react-select-2-option-0"));//下拉选择日历方案（刚刚新建的日历方案）

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/div/div[1]/div[3]/div/div[2]/button/span/span"));  //点击添加

            click(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/div/div/div[2]/div[2]/p/span/span"));  //点击编辑

            click(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[2]/div/div/div/div/div[1]/div[3]/label/div[2]/div"));   //切换工作模式  自定义

        List<WebElement> weekday =driver.findElements(By.className("Checkbox__HiddenCheckbox-sc-1asqokg-0"));  //获取周一到周日所有checkbox的集合

        weekday.get(1).click();   //周二休息

        weekday.get(4).click();  //周五休息

        List<WebElement> workHour =driver.findElements(By.cssSelector("div.css-1dy303k>input"));   //获取所有工作日框的集合


        workHour.get(0).clear();   //清除原本的值

        workHour.get(0).sendKeys("7.5");  //输入新的工作日小时数

        workHour.get(1).clear();   //清除原本的值

        workHour.get(1).sendKeys("7.5");  //输入新的工作日小时数

        workHour.get(2).clear();   //清除原本的值

        workHour.get(2).sendKeys("7.5");  //输入新的工作日小时数

        workHour.get(3).clear();   //清除原本的值

        workHour.get(3).sendKeys("7.5");  //输入新的工作日小时数

        workHour.get(4).clear();   //清除原本的值

        workHour.get(4).sendKeys("7.5");  //输入新的工作日小时数

            click(By.className("css-1yx6h60"));  //点击保存按钮

            click(By.cssSelector("div[class='_1pNHlDd22QhtFyNjpzMA7C'][title='关闭']"));   //关闭方案设置



            click(By.id("admin_menu")); //点击窗口右上角的齿轮图标

            click(By.id("admin_project_menu"));  //选择项目

        Enter(By.id("project-filter-text")).sendKeys("工时测试项目"); //搜索项目

            click(By.cssSelector("a[title=\"工时测试项目\"][href=\"/plugins/servlet/project-config/GSCSXM/summary\"]"));  //点击项目

            click(By.id("shdsd-timesheet-projectSetting-link"));  //点击timewise配置

            click(By.cssSelector("div[class=\"QjjEkaJOfZJKuLEsEJaTL\"][title=\"编辑\"]"));  //点击编辑按钮

            click(By.cssSelector(".css-17qmjyt-singleValue"));  //点击下拉框

            click(By.id("react-select-5-option-0"));   //切换第一个选项

            click(By.xpath("/html/body/div[4]/div/div/div[3]/div[2]/div/div/div/div/div[2]/button[1]/span/span"));  //点击确定按钮


        //添加计划
        Entrance.TimewisePage();

        click(By.id("timSheetCalendar_toggleDialog"));   //点击时间选择框

        click(By.cssSelector("div[class='styled__NavItem-sc-716rt7-5 goIJer'][aria-posinset='3']"));  //选择月

        click(By.id("monthCalendar_onApply"));  //点击应用

        click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/span"));  //点击用户，出现下拉框

        click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[3]/ul/li[1]"));  //点击项目

        click(By.xpath("/html/body/div[1]/section/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/div/div[4]/div[2]/div/div/div[1]"));  //点击项目：全部框

        click(By.cssSelector("#react-select-4-option-1-85 > .css-1o5vhst > div"));  //选择工时测试项目

        click(By.className("styledCache__StyledSpan-zohhd2-3"));  //鼠标点击用户头像，焦点移出下拉框中


        Actions action=new Actions(driver);

        action.moveToElement(driver.findElement(By.id("timecolumn_14"))).perform();

        Thread.sleep(5000);
        } catch (Exception e) {
            System.err.println("名称和描述修改失败！");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }


}

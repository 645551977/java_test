package TestCase.V1_3.Project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;


public class RPCMSD1889 extends BaseTest {

    @Test
    public void RPCMSD1889() throws Exception {
        try {
            Entrance.TimewisePage();

            click(By.id("admin_menu")); //点击窗口右上角的齿轮图标

            click(By.id("admin_project_menu"));  //选择项目

            Enter(By.id("project-filter-text")).sendKeys("TEST Project"); //搜索项目

            click(By.cssSelector("a[title=\"TEST Project\"][href=\"/plugins/servlet/project-config/AAAAA/summary\"]"));  //点击项目

            click(By.id("shdsd-timesheet-projectSetting-link"));  //点击timewise配置

            click(By.cssSelector("div[class=\"QjjEkaJOfZJKuLEsEJaTL\"][title=\"编辑\"]"));  //点击编辑按钮

            click(By.cssSelector(".css-17qmjyt-singleValue"));  //点击下拉框

            click(By.id("react-select-5-option-1"));   //切换第一个选项

            click(By.cssSelector(".css-17qmjyt-singleValue"));  //点击下拉框

            click(By.id("react-select-5-option-2")); //再次切换选项

            click(By.className("css-1yx6h60"));  //点击确定

        }catch (Exception e){
            System.err.println("timewise工作日方案切换失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
    }

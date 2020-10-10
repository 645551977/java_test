package TestCase.V1_2.Configure.Workday_configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

import java.util.List;

public class RPCMSD1766 extends BaseTest {
    @Test
    public void RPCMSD1766() throws Exception {
        //初始化登录操作
        try {
            Entrance.SettingPage();

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div#page section#content div#shdsd-FineTimesheet-settingPage-root-div div div._1Z_6PEjLYDtbWnJ_FdPGKU div div div._1vzlyQ_bYi91nfVUMirbCp div._31PMkMkS_fveJJNcFs284K div div button.css-shc4i4 span.css-j8fq0c span.css-t5emrf")); //添加按钮

            Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("工作日发方案" + System.currentTimeMillis());  //输入名称

            Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("方案" + System.currentTimeMillis());

            click(By.className("css-1yx6h60"));   //点击确认

            //关联第一个日历方案

            click(By.className("css-kb4noc-placeholder"));  //点击下拉框

            click(By.id("react-select-2-option-1"));//下拉选择日历方案

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k div.css-1ge7qzd div div div div button.css-shc4i4 span.css-j8fq0c span.css-t5emrf"));  //点击添加

            //关联第二个日历方案

            click(By.className("css-17qmjyt-singleValue"));  //点击下拉框

            click(By.id("react-select-2-option-2"));//下拉选择日历方案

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k div.css-1ge7qzd div div div div button.css-shc4i4 span.css-j8fq0c span.css-t5emrf"));  //点击添加

            //关联第三个日历方案

            click(By.className("css-17qmjyt-singleValue"));  //点击下拉框

            click(By.id("react-select-2-option-3"));//下拉选择日历方案

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k div.css-1ge7qzd div div div div button.css-shc4i4 span.css-j8fq0c span.css-t5emrf"));  //点击添加

            //关联第四个日历方案

            click(By.className("css-17qmjyt-singleValue"));  //点击下拉框

            click(By.id("react-select-2-option-4"));//下拉选择日历方案

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k div.css-1ge7qzd div div div div button.css-shc4i4 span.css-j8fq0c span.css-t5emrf"));  //点击添加


            List<WebElement> elementsMove = driver.findElements(By.cssSelector("div[class=\"_3hJhlYslAIO6ZcKEEbsGxU\"][title=\"移动\"]"));  //移动调整顺序
            System.out.println(elementsMove.size());

            elementsMove.get(0).click();   //调整顺序

            elementsMove.get(1).click();   //调整顺序


            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k div.css-1ge7qzd div div div.fixedDataTableLayout_main.public_fixedDataTable_main div.fixedDataTableLayout_rowsContainer div div.fixedDataTableRowLayout_rowWrapper div.fixedDataTableRowLayout_main.public_fixedDataTableRow_main.public_fixedDataTableRow_even.public_fixedDataTable_bodyRow div.fixedDataTableRowLayout_body div.fixedDataTableCellGroupLayout_cellGroupWrapper div.fixedDataTableCellGroupLayout_cellGroup div.fixedDataTableCellLayout_main.fixedDataTableCellLayout_alignCenter.public_fixedDataTableCell_main div.fixedDataTableCellLayout_wrap1.public_fixedDataTableCell_wrap1 div.fixedDataTableCellLayout_wrap2.public_fixedDataTableCell_wrap2 div.fixedDataTableCellLayout_wrap3.public_fixedDataTableCell_wrap3 div.public_fixedDataTableCell_cellContent div._2Dkb1HmVY9OltOw5tQhLYd"));  //删除

            click(By.cssSelector("button[class=\"css-ww79x\"][type=\"button\"]"));   //确定

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k div.css-1ge7qzd div div div.fixedDataTableLayout_main.public_fixedDataTable_main div.fixedDataTableLayout_rowsContainer div div.fixedDataTableRowLayout_rowWrapper div.fixedDataTableRowLayout_main.public_fixedDataTableRow_main.public_fixedDataTableRow_even.public_fixedDataTable_bodyRow div.fixedDataTableRowLayout_body div.fixedDataTableCellGroupLayout_cellGroupWrapper div.fixedDataTableCellGroupLayout_cellGroup div.fixedDataTableCellLayout_main.fixedDataTableCellLayout_alignCenter.public_fixedDataTableCell_main div.fixedDataTableCellLayout_wrap1.public_fixedDataTableCell_wrap1 div.fixedDataTableCellLayout_wrap2.public_fixedDataTableCell_wrap2 div.fixedDataTableCellLayout_wrap3.public_fixedDataTableCell_wrap3 div.public_fixedDataTableCell_cellContent div._2Dkb1HmVY9OltOw5tQhLYd"));  //删除

            click(By.cssSelector("button[class=\"css-ww79x\"][type=\"button\"]"));   //确定


            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k div.css-1ge7qzd div div div.fixedDataTableLayout_main.public_fixedDataTable_main div.fixedDataTableLayout_rowsContainer div div.fixedDataTableRowLayout_rowWrapper div.fixedDataTableRowLayout_main.public_fixedDataTableRow_main.public_fixedDataTableRow_even.public_fixedDataTable_bodyRow div.fixedDataTableRowLayout_body div.fixedDataTableCellGroupLayout_cellGroupWrapper div.fixedDataTableCellGroupLayout_cellGroup div.fixedDataTableCellLayout_main.fixedDataTableCellLayout_alignCenter.public_fixedDataTableCell_main div.fixedDataTableCellLayout_wrap1.public_fixedDataTableCell_wrap1 div.fixedDataTableCellLayout_wrap2.public_fixedDataTableCell_wrap2 div.fixedDataTableCellLayout_wrap3.public_fixedDataTableCell_wrap3 div.public_fixedDataTableCell_cellContent div._3hJhlYslAIO6ZcKEEbsGxU span.Icon__IconWrapper-dyhwwi-0.eGMEBE"));//查看

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-u9ep4f div.css-aore34 div.css-e6hn7k header.css-h2i4hf h4.css-1aseh1t span.css-vjdnif div div div._1pNHlDd22QhtFyNjpzMA7C span.Icon__IconWrapper-dyhwwi-0.dqqHMN"));  //关闭

            click(By.cssSelector("html.mozilla body#jira.aui-layout.aui-theme-default div.atlaskit-portal-container div.atlaskit-portal div.css-1ua1xqz div div.css-256bg4 div.css-1yfnrso div.css-e6hn7k header.css-h2i4hf h4.css-1aseh1t span.css-vjdnif div div div._1pNHlDd22QhtFyNjpzMA7C span.Icon__IconWrapper-dyhwwi-0.dqqHMN")); //关闭方案设置


        } catch (Exception e) {
            System.err.println("方案设置失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

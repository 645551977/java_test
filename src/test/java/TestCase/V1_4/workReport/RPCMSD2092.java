package TestCase.V1_4.workReport;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD2092 extends BaseTest {
    @Test
    public void rPCMSD2092() throws Exception{
        try{
            Entrance.ReportPage();
            
            click(By.cssSelector(".sc-bAeIUo:nth-child(4) .GridColumnElement__GridColumn-sc-57x38k-0"));

            click(By.linkText("全部添加"));

            click(By.cssSelector("#DsdPopPanelTool_Btn_apply .css-t5emrf"));

            click(By.cssSelector(".css-1tqx6ej-indicatorContainer > .Icon__IconWrapper-dyhwwi-0"));

            click(By.id("react-select-4-option-0-1"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));//时间框

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(2)"));

            click(By.cssSelector("#monthCalendar_onApply .css-t5emrf"));

            click(By.cssSelector(".css-1tqx6ej-indicatorContainer > .Icon__IconWrapper-dyhwwi-0"));

            click(By.id("react-select-4-option-2-0"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));//时间框

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(3)"));

            click(By.xpath("//*[@id='WorkReport_Btn_calendar']/div/div/div[2]/div/div/div[2]/div/div/div[4]/div/div[2]/div/div/button/span/span/span"));

            click(By.cssSelector(".sc-ckVGcZ:nth-child(1) > .fWIbOm"));

            click(By.cssSelector("tr:nth-child(3) > .sc-ckVGcZ:nth-child(6) > .sc-dxgOiQ"));

            click(By.cssSelector("#customTimePeriod_onApply .css-t5emrf"));

            click(By.cssSelector(".css-dnjv80"));

            click(By.id("react-select-4-option-1-11"));

            click(By.cssSelector("div:nth-child(1) > div > .Droplist-sc-1z05y4v-0 .Icon__IconWrapper-dyhwwi-0"));

            click(By.cssSelector(".Item-z6qfkt-2:nth-child(3) .ItemParts__Content-sc-14xek3m-5"));

            click(By.cssSelector(".css-1tqx6ej-indicatorContainer > .Icon__IconWrapper-dyhwwi-0"));

            click(By.id("react-select-4-option-1-8"));
          
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("查询失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

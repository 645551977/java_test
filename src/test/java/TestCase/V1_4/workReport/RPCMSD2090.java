package TestCase.V1_4.workReport;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD2090 extends BaseTest {
    @Test
    public void rPCMSD2090() throws Exception{

        try{
            Entrance.ReportPage();

           click(By.cssSelector(".sc-bAeIUo:nth-child(4) .GridColumnElement__GridColumn-sc-57x38k-0"));

            click(By.linkText("全部添加"));

            click(By.cssSelector("#DsdPopPanelTool_Btn_apply .css-t5emrf"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));//时间框

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(2)"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(3)"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(1)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-ckVGcZ:nth-child(3) > .sc-dxgOiQ"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(2)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-cMljjf:nth-child(1) > .sc-brqgnP"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(3)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-ckVGcZ:nth-child(1) > .sc-dxgOiQ"));

            click(By.cssSelector("tr:nth-child(4) > .sc-ckVGcZ:nth-child(4) > .sc-dxgOiQ"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(1)"));

            click(By.cssSelector("tr:nth-child(2) > .sc-ckVGcZ:nth-child(3) > .sc-dxgOiQ"));

            click(By.cssSelector("#timeCalendar_onApply .css-t5emrf"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(2)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-cMljjf:nth-child(1) > .sc-brqgnP"));

            click(By.cssSelector("#monthCalendar_onClose .css-t5emrf"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(2)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-cMljjf:nth-child(1) > .sc-brqgnP"));

            click(By.cssSelector("#monthCalendar_onApply .css-t5emrf"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(3)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-ckVGcZ:nth-child(1) > .sc-dxgOiQ"));

            click(By.cssSelector(".eHQtUV"));

            click(By.cssSelector("#customTimePeriod_onClose .css-t5emrf"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(3)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-ckVGcZ:nth-child(2) > .sc-dxgOiQ"));

            click(By.cssSelector(".eHQtUV"));

            click(By.cssSelector("#customTimePeriod_onApply .css-t5emrf"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(1)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-ckVGcZ:nth-child(2) > .sc-dxgOiQ"));

            click(By.cssSelector("#timeCalendar_onClose .css-t5emrf"));

            click(By.id("WorkReport_div_main"));

            click(By.cssSelector(".css-vxcmzt .css-t5emrf"));

            click(By.cssSelector(".styled__NavItem-sc-716rt7-5:nth-child(1)"));

            click(By.cssSelector("tr:nth-child(1) > .sc-ckVGcZ:nth-child(2) > .sc-dxgOiQ"));

            click(By.cssSelector("#timeCalendar_onApply .css-t5emrf"));

            click(By.cssSelector("a[class=\"sc-gZMcBi hfzezb\"][title=\"更多\"]"));

            click(By.cssSelector("a[class=\"sc-gZMcBi hfzezb\"][title=\"更多\"]"));

            click(By.cssSelector("div:nth-child(1) > div > .Droplist-sc-1z05y4v-0 .Icon__IconWrapper-dyhwwi-0"));

            click(By.cssSelector(".Item-z6qfkt-2:nth-child(1) .ItemParts__Content-sc-14xek3m-5"));

            click(By.cssSelector("div:nth-child(1) > div > .Droplist-sc-1z05y4v-0 .Icon__IconWrapper-dyhwwi-0"));

            click(By.cssSelector(".Item-z6qfkt-2:nth-child(2) .ItemParts__Content-sc-14xek3m-5"));

            click(By.cssSelector("div:nth-child(1) > div > .Droplist-sc-1z05y4v-0 .Icon__IconWrapper-dyhwwi-0"));

            click(By.cssSelector(".Item-z6qfkt-2:nth-child(3) .ItemParts__Content-sc-14xek3m-5"));

        }catch(Exception e){
            e.printStackTrace();
            System.err.println("时间选择失败!");
         String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
         ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);

        }
    }
}

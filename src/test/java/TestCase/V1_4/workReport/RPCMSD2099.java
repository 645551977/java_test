package TestCase.V1_4.workReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;


public class RPCMSD2099 extends BaseTest {
    @Test
    public void rPCMSD2099() throws Exception{
        try{
            Entrance.SettingPage();

            Entrance.ReportPage();

            click(By.cssSelector(".sc-bAeIUo:nth-child(4) .GridColumnElement__GridColumn-sc-57x38k-0"));

            click(By.linkText("全部添加"));

            click(By.cssSelector("#DsdPopPanelTool_Btn_apply .css-t5emrf"));


            click(By.id("WorkReport_Select_groupBy"));

            {
               WebElement element = driver.findElement(By.cssSelector("#ListSelectItem_T .sc-dqBHgY"));
               Actions builder = new Actions(driver);
               builder.moveToElement(element).clickAndHold().perform();
            }
            {
               WebElement element = driver.findElement(By.id("ListSelectItem_T"));
               Actions builder = new Actions(driver);
               builder.moveToElement(element).perform();
            }
            {
                WebElement element = driver.findElement(By.id("ListSelectItem_T"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).release().perform();
            }

            click(By.cssSelector(".aui-avatar-inner > img"));
            click(By.id("log_out"));
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("查询失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

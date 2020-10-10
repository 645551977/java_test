package TestCase.V1_4.workReport;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD2102 extends BaseTest {
  @Test
  public void RPCMSD2102() throws Exception{
    try{
      Entrance.SettingPage();
      
      Entrance.ReportPage();
      
      click(By.cssSelector(".sc-bMVAic:nth-child(4) .GridColumnElement__GridColumn-sc-57x38k-0"));
      click(By.linkText("全部添加"));
      click(By.cssSelector("#DsdPopPanelTool_Btn_apply .css-t5emrf"));
      click(By.cssSelector(".sc-ibxdXY"));
      click(By.cssSelector(".css-1yx6h60 .css-t5emrf"));

      click(By.cssSelector(".aui-avatar-inner > img"));
      click(By.id("log_out"));

    }catch (Exception e){
      e.printStackTrace();
      System.err.println("新建报表失败!");
      String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
      ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
      throw new Exception(e);
    }

  }
}

package TestCase.V1_4.workReport;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD2089 extends BaseTest {
    @Test
    public void rPCMSD2089() throws Exception{
        try{
            Entrance.ReportPage();

           click(By.id("MyReport_DropdownMenu_type"));

            click(By.cssSelector(".Item-z6qfkt-2:nth-child(4) .ItemParts__Content-sc-14xek3m-5"));

            click(By.cssSelector(".sc-gqjmRU:nth-child(1) .Droplist-sc-1z05y4v-0 .Icon__IconWrapper-dyhwwi-0"));

            click(By.cssSelector(".Item-z6qfkt-2:nth-child(2) .ItemParts__Content-sc-14xek3m-5"));

            click(By.cssSelector(".css-1yfnrso  .css-t5emrf"));

            click(By.cssSelector(".sc-gqjmRU:nth-child(1) .sc-gZMcBi"));

            click(By.cssSelector(".Item-z6qfkt-2:nth-child(2) .ItemParts__Content-sc-14xek3m-5"));

            click(By.cssSelector(".css-1yfnrso .css-1akzpg4 .css-t5emrf"));

        }catch (Exception e){
            e.printStackTrace();
            System.err.println("删除报表失败!");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

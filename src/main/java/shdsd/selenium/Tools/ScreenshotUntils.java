package shdsd.selenium.Tools;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreenshotUntils {

    public static File getScreenshot(String filePath) {
        //将driver转换成TakesScreenshot
        TakesScreenshot tScreenshot=(TakesScreenshot) BaseTest.getDriver();
        File srcFile=tScreenshot.getScreenshotAs(OutputType.FILE);
        //生成的图片名，测试用例名+时间戳
        //File destFile=Util.filepath;
        File destFile=new File(filePath);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destFile;
    }
}

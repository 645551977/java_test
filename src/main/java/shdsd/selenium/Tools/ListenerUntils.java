package shdsd.selenium.Tools;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class ListenerUntils extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        //测试方法名
        String methodName = tr.getMethod().getMethodName();
        try {
            //调用一个保存截屏，并且为allure报告添加截图信息的方法
            takeScreenShot(methodName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Attachment(value = "Failure in method {0}", type = "image/png")
    private byte[] takeScreenShot(String methodName) throws Exception {
        TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTest.getDriver();
        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
    }
}

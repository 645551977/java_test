package shdsd.selenium.Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class BaseTest {
    public  static  WebDriver driver=null;

    public static WebDriver getDriver() {
        return driver;
    }
/*
   @BeforeSuite
    @Parameters({"browName","seleniumVersion"})
    public void BeforeSuite(String browName, String seleniumVersion) throws Exception
    {
        //driver=AutoUtils.getDriver(browName, seleniumVersion);
        driver=AutoUtils.getDriver(browName, seleniumVersion);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }*/

    @BeforeSuite
    public void BeforeSuite() throws Exception
    {
        driver=AutoUtils.getDriver("chrome", "2");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
   @AfterSuite
    public  void AfterSuite() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
    //获取url
    public void getUrl(String url) {
        driver.get(Properties.url);
    }
    //获取用户名
    public void getUsername(String name) {
        driver.get(Properties.user);
    }
    //获取用密码
    public void getPwd(String pwd) {
        driver.get(Properties.pwd);
    }


    public String getCurrentUrl()
    {
        return driver.getCurrentUrl();
    }
    public Boolean CurrentUrlPage(String partlailUrl)
    {
        WebDriverWait wait=new WebDriverWait(driver,10);

        return wait.until(ExpectedConditions.urlContains(partlailUrl));
    }
    //智能等待  所有的元素都需等待10秒
    public WebElement getElement(By by)
    {
        return getElement(by, 10L);
    }

    public WebElement getElement(By by, Long timeoutInSeconds)
    {
        WebDriverWait wait=new WebDriverWait(driver, timeoutInSeconds);
        //匿名内部类
        WebElement element=wait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver inputDriver) {
                return driver.findElement(by);
            }
        });
        return element;
    }
    //智能等待  元素是否可以操作
    public WebElement getEnableElement(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, 10);
        //匿名内部类
        boolean flag=wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver inputDriver) {
                return driver.findElement(by).isEnabled();
            }
        });
        return driver.findElement(by);
    }
    //智能等待  元素是否可以操作
    public WebElement Enter(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, 10);
        //匿名内部类
        return wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    //智能等待  元素是否显示
    public WebElement getDisElement(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, 10);
        //匿名内部类
        boolean flag=wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver inputDriver) {
                return driver.findElement(by).isDisplayed();
            }
        });
        return driver.findElement(by);
    }

    //智能等待  元素是否选中
    public WebElement getSElement(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, 10);
        //匿名内部类
        boolean flag=wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver inputDriver) {
                return driver.findElement(by).isSelected();
            }
        });
        return driver.findElement(by);
    }

    //元素不为空
    public String getTipElement(By by)
    {
        WebDriverWait wait=new WebDriverWait(driver, 10L);
        String elementText=wait.until(new ExpectedCondition<String>() {
            @Override
            public String apply(WebDriver input) {
                WebElement element=driver.findElement(by);
                if (element!=null && element.getText()!=null  && element.getText().length()>0 ) {
                    return element.getText();
                }
                return null;
            }
        });
        return elementText;
    }
    //输入内容
    public void type(By by,String content)
    {
        getElement(by).sendKeys(content);
    }
    //清空内容
    public void clear(By by)
    {
        getElement(by).clear();
    }

    //点击事件
    public void click(By by)
    {
        getElement(by).click();

    }
    //获取页面内容
    public String getText(By by) {
        return getElement(by).getText();
    }

    public void AssertPartUrlContains(String partlailUrl)
    {
        Assert.assertTrue(CurrentUrlPage(partlailUrl));
    }
}

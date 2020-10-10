package shdsd.selenium.Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoUtils {

    /**
     * 获得driver
     *
     * @param browserName
     *            浏览器名称
     * @param seleniumVersion
     *            selenium版本号
     * @return
     */
    public static WebDriver getDriver(String browserName, String seleniumVersion) {
        if ("Chrome".equalsIgnoreCase(browserName)) {
            return getChromeDriver();
        } else if ("Firefox".equalsIgnoreCase(browserName)) {
            return getFirefoxDriver(seleniumVersion);
        } else {
            throw new RuntimeException("没有对应的浏览器");
        }
    }
    private static WebDriver getFirefoxDriver(String seleniumVersion) {
        if (!"2.x".equalsIgnoreCase(seleniumVersion)) {
            System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,
                    "lib\\geckodriver.exe");
        }
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
                "lib\\chromedriver.exe");
        return new ChromeDriver();
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY,
                "lib\\msedgedriver.exe");
        return new ChromeDriver();
    }

}

package shdsd.selenium.Tools;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Properties extends BaseTest {

    //读取配置文件
    static {
        PropertyUtil.loadProps();
    }

    /**
     * 网站
     */
    public static String url = PropertyUtil.getProperty("url");

    /**
     * 报错文件路径
     */
    public static String filepath = "E:\\TimeWise\\test-output\\error\\";

    /**
     * 账号
     */
    public static String user = PropertyUtil.getProperty("user");

    /**
     * 密码
     */
    public static String pwd = PropertyUtil.getProperty("pwd");

    /**
     * 获取管理员信息
     */
    public static String adminJson =String.format( "{\"password\":\"%s\",\"username\":\"%s\"}",pwd,user);


    /**
     * 插件的安装目录位置
     */
    public static String pluginPath = PropertyUtil.getProperty("pluginPath");

    /**
     *线下Lic
     */
    public static String licenseOffLine = PropertyUtil.getProperty("licenseOffLine");

    /**
     *线上Lic
     */
    public static String licenseOnLine = PropertyUtil.getProperty("licenseOnLine");

    /**
     * 锟斤拷取锟斤拷目路锟斤拷
     *
     * @return 路锟斤拷
     */
    public static String getProperty() {
        return System.getProperty("user.dir");
    }

    /**
     * 驱动位置
     */
    public static String path = "1".equals(PropertyUtil.getProperty("model")) ? getProperty() + "\\lib\\chromedriver.exe" : getProperty() + "\\lib\\geckodriver.exe";

    /**
     * 驱动
     */
    public static String driverType = "1".equals(PropertyUtil.getProperty("model")) ? "webdriver.chrome.driver" : "webdriver.gecko.driver";

    /**
     * 报告路径
     */
    //public static String reportPath = !"".equals(PropertyUtil.getProperty("reportPath")) ? PropertyUtil.getProperty("reportPath") +"/TimeWise/"+ getDate()+"/" : getProperty() + "\\TimeWise\\" + getDate();
      public static String reportPath = "E:\\TimeWise\\allure-results\\";


    /**
     * 获取时间
     *
     * @return
     */
    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateString = sdf.format(date);
        return dateString;
    }
}

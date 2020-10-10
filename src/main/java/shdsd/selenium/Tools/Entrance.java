package shdsd.selenium.Tools;

import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

import static shdsd.selenium.Tools.Properties.getProperty;

public class Entrance  extends  BaseTest{

    static  BaseTest bs=new BaseTest();

    public static void  Login() throws  Exception{
        bs.getUrl(Properties.url);
        bs.Enter(By.id("login-form-username")).sendKeys(Properties.user);
        bs.Enter(By.id("login-form-password")).sendKeys(Properties.pwd);
        bs.click(By.id("login-form-submit"));
    }

    /**
     * 登录操作
     *  配置页面
     * @param
     * @throws Exception
     */
    public static void SettingPage() throws Exception {
        Login();
        //timesheet主页面
        bs.click(By.id("shdsd-fineTimesheet-main-menu-link"));
        //进入到配置页面
        bs.click(By.id("shdsd-FineTimesheet-SettingPage-link"));
    }

    /**
     * @param  //报表页面
     * @throws Exception
     */
    public static void ReportPage() throws Exception {
        Login();
        //点击timewise
        bs.click(By.id("shdsd-fineTimesheet-main-menu-link"));
        //点击报表
        bs.click(By.id("shdsd-FineTimesheet-TimeReport-link_lnk"));
    }

    /**
     * @param  //预测与管理
     * @throws Exception
     */
    public static void ApplicationReportPage() throws Exception {
        Login();
        //点击timewise
        bs.click(By.id("shdsd-fineTimesheet-main-menu-link"));
        //点击报表
        bs.click(By.id("shdsd-FineTimesheet-TimeReport-link_lnk"));
        //点击应用报表
        bs.click(By.cssSelector("button[class='css-15j5m2p'][type='button']"));
    }




    /**
     * 初始化登录插件安装
     *
     * @param
     * @throws Exception
     */
    public static void InitializeLogin() throws Exception {
        Login();
        bs.click(By.id("admin_menu"));
        bs.click(By.id("admin_plugins_menu"));
        bs.click(By.id("login-form-authenticatePassword"));
        bs.click(By.id("login-form-authenticatePassword"));
        bs.click(By.id("login-form-submit"));
    }


    /**
     *  issue详情页
     *
     * @param
     * @throws Exception
     */
    public static void IssuePage() throws Exception {
       Login();

       bs.click(By.id("browse_link"));

        bs.click(By.id("admin_main_proj_link_lnk"));

    }
    /**
     *
     *  Timewise主页面
     * @param
     * @throws Exception
     */
    public static void TimewisePage() throws Exception {
        Login();
        bs.click(By.id("shdsd-fineTimesheet-main-menu-link"));
        bs.click(By.id("shdsd-FineTimesheet-TimeSheet-link_lnk"));

        Thread.sleep(5000);
    }
    /**
     *
     *  变更历史
     * @param
     * @throws Exception
     */
    public static void History() throws Exception {
        Login();
        bs.click(By.id("shdsd-fineTimesheet-main-menu-link"));
        bs.click(By.id("shdsd-FineTimesheet-ChangeHistory-link_lnk"));
    }

    /**
     * 全局配置页面
     * @throws Exception
     */
    public static void GlobalSetting() throws Exception {
        Login();
        //点击设置
        bs.click(By.id("admin_menu"));
        //进入到管理应用
        bs.click(By.id("admin_plugins_menu"));
        //进入登录模式，输入密码
        bs.Enter(By.id("login-form-authenticatePassword")).sendKeys("123456");
        //点击确认
        bs.click(By.id("login-form-submit"));
        //点击全局配置
        bs.click(By.id("shdsd-timesheet-workday-link"));
    }

    /**
     *
     *
     * @param type
     * @throws IOException
     * @throws InterruptedException
     */
    public static void exeRunning(String exeName,String type) throws IOException, InterruptedException {

        Thread.sleep(3000);
        Runtime exe = Runtime.getRuntime();
        String runPath = getProperty() + File.separator +"lib" +File.separator +type+exeName +"Firefox"  +".exe" ;
        if("1".equals(PropertyUtil.getProperty("model"))){
            runPath =getProperty() + File.separator +"lib" +File.separator +type+ exeName +"Chrome"+".exe" ;
        }
        System.out.println(runPath);
        exe.exec(runPath);
    }
}

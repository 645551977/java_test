package TestCase.V1_2.Configure.Workday_configuration;
import org.openqa.selenium.By;;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.BaseTest;
import shdsd.selenium.Tools.Entrance;
import shdsd.selenium.Tools.Properties;
import shdsd.selenium.Tools.ScreenshotUntils;

public class RPCMSD1767  extends BaseTest {

    @Test
    public void RPCMSD1767() throws Exception {
        //初始化登录操作
        try {
        Entrance.SettingPage();

        click(By.cssSelector(".css-t5emrf")); //添加按钮

        //名称校验
        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("工作日发方案" + System.currentTimeMillis());  //输入名称

        driver.findElement(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).clear();   //清空名称

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("的撒发士大夫士大夫删掉了" +
                "福克斯的激发了卡机是打开了房间老师市解放路卡设计费克鲁赛德电视剧法拉开始就分开了三大防守反击拉萨的咖啡就离开撒地方司法局拉萨解放路卡士大夫" +
                "士大夫还是开发商的十大减肥啦世纪东方萨芬聚少离多激发了三分吉林省的减肥了康师傅撒地方了圣诞节福利卡撒地方煞风景老师就发了时代峻峰士大夫结束啦电" +
                "费交树分离sad积分卡洛斯等级分类时代峻峰离开家酸辣粉会计师的课件罚sdfaasdfsdf款撒地方" + System.currentTimeMillis());  //输入名称

        clear(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]"));   //清空名称
        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("工作日方案" + System.currentTimeMillis());  //输入名称

        //描述校验
        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("方案" + System.currentTimeMillis());

        clear(By.cssSelector("textarea[placeholder=\"描述\"]"));  //清空描述

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("的撒发士大夫士大夫删掉了" +
                "福克斯的激发了卡机是打开了房间老师市解放路卡设计费克鲁赛德电视剧法拉开始就分开了三大防守反击拉萨的咖啡就离开撒地方司法局拉萨解放路卡士大夫" +
                "士大夫还是开发商的十大减肥啦世纪东方萨芬聚少离多激发了三分吉林省的减肥了康师傅撒地方了圣诞节福利卡撒地方煞风景老师就发了时代峻峰士大夫结束啦电" +
                "费交树分离sad积分卡洛斯等级分类时代峻峰离开家酸辣粉会计师的课件罚sdfaasdfsdf款撒地方" + System.currentTimeMillis());  //输描述

        clear(By.cssSelector("textarea[placeholder=\"描述\"]"));  //清空描述

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys("描述" + System.currentTimeMillis());

        click(By.cssSelector("input[type=\"checkbox\"][value=\"设置工作日日历\"]")); //去掉勾选设置工作日日历

        click(By.cssSelector("input[type=\"checkbox\"][value=\"设置工作日日历\"]")); //勾选设置工作日日历

        click(By.className("css-1yx6h60"));   //点击确认


        click(By.cssSelector("div[class=\"_1pNHlDd22QhtFyNjpzMA7C\"][title=\"关闭\"]")); //关闭方案设置


        click(By.cssSelector(".css-t5emrf")); //添加按钮


        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("");  //不输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys(""); //不输入描述

        click(By.className("css-1yx6h60"));   //点击确认


        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("");  //不输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys(""+System.currentTimeMillis()); //输入描述

        click(By.cssSelector("input[type=\"checkbox\"][value=\"设置工作日日历\"]")); //勾选设置工作日日历


        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys(""+System.currentTimeMillis());  //输入名称

        click(By.cssSelector("input[type=\"checkbox\"][value=\"设置工作日日历\"]")); //不勾选设置工作日日历

        click(By.className("css-1yx6h60"));   //点击确认

        click(By.cssSelector(".css-t5emrf")); //添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("");  //不输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys(""); //不输入描述

        click(By.className("css-1akzpg4"));   //点击取消



        click(By.cssSelector(".css-t5emrf")); //添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("");  //不输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys(""+System.currentTimeMillis()); //输入描述

        click(By.className("css-1akzpg4"));   //点击取消


        click(By.cssSelector(".css-t5emrf")); //添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("");  //输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys(""); //不输入描述

        click(By.className("css-1akzpg4"));   //点击取消

        click(By.cssSelector(".css-t5emrf")); //添加按钮

        Enter(By.cssSelector("input[class=\"css-1rmy9fa\"][placeholder=\"名称\"]")).sendKeys("");  //输入名称

        Enter(By.cssSelector("textarea[placeholder=\"描述\"]")).sendKeys(""+System.currentTimeMillis()); //输入描述


        click(By.cssSelector("input[type=\"checkbox\"][value=\"设置工作日日历\"]")); //不勾选设置工作日日历

        click(By.className("css-1akzpg4"));   //点击取消


        } catch (Exception e) {
            System.err.println("工作日方案页面校验失败");
            String method = Thread.currentThread() .getStackTrace()[1].getMethodName();
            ScreenshotUntils.getScreenshot(Properties.filepath + method + ".png");
            throw new Exception(e);
        }
    }
}

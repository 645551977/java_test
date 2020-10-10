package shdsd.initData;

import shdsd.selenium.Tools.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

/**
 * 工时插件安装
 */
public class CreateUserInfo {


    @Test
    public void CreateUserInfo() throws Exception {

        try {
            PropertiesUtils.getRunDate();
            JSONObject jsonObject = new JSONObject(PropertiesUtils.readJsonFile("testSetting/AddUsers.json"));
            JSONArray jsonArray = jsonObject.getJSONArray("users");
            String admin = Properties.adminJson;
            for (int i = 0; i < jsonArray.length(); i++) {
                if(addUser(admin,jsonArray.get(i).toString())!=""){
                    System.out.println("添加用户成功!");
                }else{
                    System.out.println("添加用户失败!");
                }
            }
            PropertiesUtils.getRunDate();
        } catch (Exception e) {
            System.err.println("添加失败!");
            //Util.errorPrintscreen(driver, CreateUserInfo.class.getSimpleName());
            throw new Exception(e);
        }
    }
    /**
     * 添加用户
     * @param userJson
     */
    public String addUser(String userJson, String userName){
        return Request.reqestUrl("post",
                userJson, Properties.url+"rest/api/2/user",
                userName).toString();
    }

}

package shdsd.initData;

import shdsd.selenium.Tools.Properties;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreateProjectInfo {

    @Test
    public void CreateProjectInfo() throws Exception {

        try {
            PropertiesUtils.getRunDate();
            String projectJson =  addProject(Properties.adminJson);
            if(projectJson!=null&&projectJson!=""){
                String projectId = new JSONObject(projectJson).get("id").toString();
                String projectKey = new JSONObject(projectJson).get("key").toString();
                JSONObject settingJson = new JSONObject(PropertiesUtils.readJsonFile("testSetting/Setting.json"));
                settingJson.put("projectId",projectId).put("projectKey",projectKey);
                while (settingJson.getJSONArray("issueId").length()>0){
                    settingJson.getJSONArray("issueId").remove(0);
                }
                if(PropertiesUtils.writeFile(settingJson.toString())){
                    System.out.println("创建的项目id和Key已经写入Setting文件成功!");
                }else{
                    System.out.println("创建的项目id和Key写入Setting文件失败!");
                }
                System.out.println("创建项目成功!");
            }else{
                System.out.println("创建失败，如果是400可能项目key已存在所导致,如果是401认证失败!");
            }
            PropertiesUtils.getRunDate();
        } catch (Exception e) {
            System.err.println("添加失败!");
            //Util.errorPrintscreen(driver, CreateUserInfo.class.getSimpleName());
            throw new Exception(e);
        }
    }
    /**
     * 添加项目
     * @param userJson
     */
    public String addProject(String userJson) {
        JSONObject jsonObject = new JSONObject(PropertiesUtils.readJsonFile("testSetting/Project.json"));
        System.out.println(jsonObject.get("name"));
        if (jsonObject.get("key") != null && !jsonObject.get("key").equals("")) {
            jsonObject.getJSONObject("project").put("key", jsonObject.get("key"));
        }
        if (jsonObject.get("name") != null && !jsonObject.get("name").equals("")) {
            jsonObject.getJSONObject("project").put("name", jsonObject.get("name"));
        }
        if (jsonObject.get("lead") != null && !jsonObject.get("lead").equals("")) {
            jsonObject.getJSONObject("project").put("lead", jsonObject.get("lead"));
        }
        String project = jsonObject.get("project").toString();
        return Request.reqestUrl("post", userJson, Properties.url + "rest/api/2/project", project).toString();
    }
}

package shdsd.initData;

import shdsd.selenium.Tools.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateIssueInfo {

    public static String issueType = "10002";


    @Test
    public void CreateIssueInfo() throws Exception {

        try {
            System.out.println("issue");
            PropertiesUtils.getRunDate();
            //读取用户
            JSONArray jsonArray = new JSONArray(PropertiesUtils.readJsonFile("testSetting/Users.json"));
            JSONObject settingJson = new JSONObject(PropertiesUtils.settingData);
            String user = null;
            String issueIds = "";
            //所有用户执行操作
            for (int i = 0; i < jsonArray.length(); i++) {
                String userName = new JSONObject(jsonArray.get(i).toString()).get("username").toString();
                user = jsonArray.get(i).toString();
                //生成随机数
                Random random = new Random();
                //每个人创建多少issue，需要读取文件中所配置的数量
                JSONObject jsonObject = new JSONObject(PropertiesUtils.readJsonFile("testSetting/Issue.json"));
                int issueNumber = Integer.parseInt(String.valueOf(jsonObject.get("IssueNumber")));
                for (int j = 0; j < issueNumber; j++) {
                    //生成一个随机的issue名字
                    int number = random.nextInt(100000);
                    String summary = "issue--" + userName + "创建--" + number;
                    //创建issue
                    String result = addCreateIssue(user, summary, userName,settingJson.get("projectId").toString());
                    if(result!=null && result!=""){
                    /*String issueId = new JSONObject(result).get("id").toString();
                    issueIds+=issueId+",";*/
                        settingJson.getJSONArray("issueId").put(new JSONObject(result).get("id").toString());
                        if(PropertiesUtils.writeFile(settingJson.toString())){
                            System.out.println("当前issue创建成功");
                        }
                    }else{
                        System.out.println("当前issue创建失败!");
                    }
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
     * 创建Issue
     * @param summary issue的名称
     */
    public String addCreateIssue(String userJson, String summary, String userName, String projectId) {
        JSONObject jsonObjects = new JSONObject(PropertiesUtils.readJsonFile("testSetting/Issue.json"));
        JSONObject jsonObject = jsonObjects.getJSONObject("issue");
        //读取json中设置的经办人
        String loadName = new JSONObject(new JSONObject(jsonObject.get("fields").toString()).get("assignee").toString()).get("name").toString();
        //判断json中是否指定经办人,未指定就默认创建人为经办人，指定，就按指定的来
        String issueJson;
        String issue;
        if (loadName == null || loadName .equals("")) {
            JSONObject jsonObject1 =  new JSONObject(jsonObject.get("fields").toString()).put("summary",summary);
            if(userName!=null){
                jsonObject1.getJSONObject("assignee").put("name",userName).toString();
            }
            issue = "{\"fields\":"+jsonObject1+"}";
        }else{
            issue = "{\"fields\":"+new JSONObject(jsonObject.get("fields").toString()).put("summary",summary).toString()+"}";
        }
        //如果传输projectId，就按照传输的添加
        if(projectId!=null){
            JSONObject jsonObject1 = new JSONObject(issue);
            jsonObject1.getJSONObject("fields").getJSONObject("project").put("id",projectId);
            issue = jsonObject1.toString();
        }
        JSONObject jsonObject1 = new JSONObject(issue);
        jsonObject1.getJSONObject("fields").getJSONObject("issuetype").put("id",issueType).toString();
        issue = jsonObject1.toString();
        return Request.reqestUrl("post",userJson, Properties.url+"rest/api/2/issue",issue).toString();
    }

}

package shdsd.initData;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import shdsd.selenium.Tools.Properties;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CreateWorklogAndPlan {
    @Test
    public void CreateWorklogAndPlan() throws Exception {
        //先暂停一秒，让前面的方法执行完毕
        try {
            PropertiesUtils.getRunDate();
            JSONArray jsonArray = new JSONArray(PropertiesUtils.readJsonFile("testSetting/Users.json"));
            for (int i = 0; i < jsonArray.length(); i++) {
                //登录
                String userJson = jsonArray.get(i).toString();
                for(int j=0;j<1;j++){
                    String userName = new JSONObject(jsonArray.get(i).toString()).get("username").toString();
                    //为当前用户指定的区间日期的每一天添加日志和计划
                    autoUserAddPlanAndLog(userJson, null, userName);

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
     * 指定用户 范围周期，每天添加日志和计划
     * @param userJson 用户  用于请求
     * @param projectKey 项目key  用于过滤，哪个项目下的issue
     * @param userName 计划创建人，指定计划创建人
     */
    public void autoUserAddPlanAndLog(String userJson, String projectKey, String userName) {
        if(projectKey!=null){
            List<String> issueIds = getIssueIds(userJson, projectKey);
            for (String issueId : issueIds) {
                //添加计划
                addCreateWorkPlan(userJson, issueId, userName);
                //添加日志
                addWorkLog(userJson, issueId);
            }
        }else{
            JSONObject settingJson = new JSONObject(PropertiesUtils.settingData);
            JSONArray jsonArray = null;
            try{
                jsonArray = settingJson.getJSONArray("issueId");
            }catch (Exception e){
                System.out.println("Setting.json中issueId配置有问题，或者为空,具体错误为:"+e);
                return;
            }
            for (int i=0;i<jsonArray.length();i++) {
                //添加计划
                addCreateWorkPlan(userJson, jsonArray.get(i).toString(), userName);
                //添加日志
                addWorkLog(userJson, jsonArray.get(i).toString());
            }
        }

    }
    /**
     * 创建计划
     * @param issueId issue的id 指定了，就按按指定的issueId，没有就按默认的issueId
     * @param userName 创建计划的人  指定了，就按指定的计划人，没有就按默认的计划人
     */
    public void addCreateWorkPlan(String userJson, String issueId, String userName) {
        //读取json文件中要存储的数据
        JSONObject jsonObject = new JSONObject(PropertiesUtils.readJsonFile("testSetting/WorkPlan.json"));
        //获取要添加的json
        String workPlan = jsonObject.get("workPlan").toString();
        //获取指定的状态集合
        JSONArray jsonStatus = new JSONArray(jsonObject.get("status").toString());
        //获取记录时长的集合
        JSONArray jsonWorkHour = new JSONArray(jsonObject.get("workHour").toString());
        //获取userKey
        String userKey = getUserKey(userName);
        //获取项目的项目管理人
        String projectLeadKey = queryProjectIdBasedOnIssueId(issueId);
        //是否传入issueId,传入就变更issueId
        if (issueId != null) {
            workPlan = new JSONObject(workPlan).put("planItemId", issueId).toString();
        }
/*        //是否传入userName,传入就变更userName
        if (userName != null) {
            workPlan = new JSONObject(workPlan).put("assigneeKey", userName).toString();
        }*/
        //判断userKey是否为空
        if(userKey!=null){
            workPlan = new JSONObject(workPlan).put("assigneeKey", userKey).toString();
        }
        //判断userKey是否为空
        if(projectLeadKey!=null){
            workPlan = new JSONObject(workPlan).put("auditor", projectLeadKey).toString();
        }
        Random random = new Random();
        //随机获得状态
        int statusNumber = random.nextInt(jsonStatus.length());
        String status = jsonStatus.get(statusNumber).toString();
        //随机获得计划时间
        int workHourNumber = random.nextInt(jsonWorkHour.length());
        String workHour = jsonWorkHour.get(workHourNumber).toString();
        //更新json
        workPlan = new JSONObject(workPlan).put("status", status).put("workHour", workHour).toString();
        //判断是否开启区间日期来添加工作计划
        if (jsonObject.get("isAutoAddPlan").toString().equals("true")) {
            System.out.println("开启区间添加工作计划");
            // 日期格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                // 起始日期
                String autoStartDate = jsonObject.get("autoStartDate").toString();
                Date StartDate = sdf.parse(autoStartDate);
                // 结束日期
                String autoEndDate = jsonObject.get("autoEndDate").toString();
                Date EndDate = sdf.parse(autoEndDate);
                Date tmp = StartDate;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(StartDate);
                // 获取日期
                while (tmp.getTime() < EndDate.getTime()) {
                    tmp = calendar.getTime();
                    //日期
                    String date = sdf.format(tmp);
                    //获取随机状态
                    statusNumber = random.nextInt(jsonStatus.length());
                    status = jsonStatus.get(statusNumber).toString();
                    //获取随机计划时长
                    workHourNumber = random.nextInt(jsonWorkHour.length());
                    workHour = jsonWorkHour.get(workHourNumber).toString();
                    //替换默认的时间,和状态,计划时长
                    workPlan = new JSONObject(workPlan).put("startTime", date).put("endTime", date).put("status", status).put("workHour", workHour).toString();
                    System.out.println("workPlan");
                    System.out.println(workPlan);
                    //执行计划添加
                    Request.reqestUrl("post",
                            userJson, Properties.url+"/rest/shdsd-Timesheet/latest/fineplan",
                            workPlan);
                    // 天数加1
                    calendar.add(Calendar.DAY_OF_MONTH, 1);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            Request.reqestUrl("post",
                    userJson, Properties.url+"/rest/shdsd-Timesheet/latest/fineplan",
                    workPlan);
        }
    }
    /**
     * 根据issueId获取到projectId，再用projectId获取到项目经理的userKey
     * @param issueId
     * @return
     */
    public String queryProjectIdBasedOnIssueId(String issueId){
        String issue = Request.reqestUrl("get",
                Properties.adminJson, Properties.url+"/rest/api/2/issue/"+issueId,
                null).toString();
        if(issue==null||issue==""){
            System.out.println("issue不存在");
            return null;
        }
        String projectId = new JSONObject(issue).getJSONObject("fields").getJSONObject("project").get("id").toString();
        String projectLead = getProjectLeadKey(projectId);
        return projectLead;
    }
    /**
     * 查询所有issue的id，用于添加计划和日志
     * @param projectKey 项目的kay 筛选issue，查询哪个项目中的issue，不传查询所有项目中的issue,
     *
     * @return
     */
    public List getIssueIds(String userJson, String projectKey) {
        String jql = "";
        if (projectKey != null) {
            jql = "jql=project=" + projectKey;
        }
        //查询所有项目中的issue
        String issues = Request.reqestUrl("get", userJson,
                Properties.url+"/rest/api/latest/search?fields=summary,issuetype&maxResults=10000&" + jql, null).toString();
        //所有的issue
        JSONArray jsonArray = new JSONArray(new JSONObject(issues).get("issues").toString());
        //获取所有issue的 id,和 Kay
        List<String> issueList = new ArrayList<String>();
        for (int i = 0; i < jsonArray.length(); i++) {
            String issueId = new JSONObject(jsonArray.get(i).toString()).get("id").toString();
            issueList.add(issueId);
        }
        return issueList;
    }
    /**
     * 获取项目负责人key
     * @param projectId
     * @return
     */
    public String getProjectLeadKey(String projectId){
        String project = Request.reqestUrl("get",
                Properties.adminJson, Properties.url+"/rest/api/2/project/"+projectId,
                null).toString();
        if(project==null||project==""){
            System.out.println("project不存在");
            return null;
        }
        return new JSONObject(project).getJSONObject("lead").get("key").toString();
    }
    /**
     * 获取user的Key
     * @param userName
     * @return
     */
    public String getUserKey(String userName){
        String user = Request.reqestUrl("get",
                Properties.adminJson, Properties.url+"/rest/api/2/user?username="+userName,
                null).toString();
        if(user==null||user==""){
            System.out.println("user不存在");
            return null;
        }
        return new JSONObject(user).get("key").toString();
    }
    /**
     * 添加日志
     * @param issueId 如果传入，按照传入的issueId去添加日志，没有就默认issueId
     */
    public void addWorkLog(String userJson, String issueId) {
        //读取json文件中要存储的数据
        JSONObject jsonObject = new JSONObject(PropertiesUtils.readJsonFile("/testSetting/WorkLog.json"));
        //获取要添加的json
        String workLog = jsonObject.get("workLog").toString();
        //获取审核人
        String auditor = queryProjectIdBasedOnIssueId(issueId);
        //获取指定的状态集合
        JSONArray jsonStatus = new JSONArray(jsonObject.get("status").toString());
        //获取记录时长
        JSONArray jsonTimeWorkedStr = new JSONArray(jsonObject.get("timeWorkedStr").toString());
        //是否传入issueId,传入就变更issueId
        if (issueId != null) {
            workLog = new JSONObject(workLog).put("issueId", issueId).toString();
        }
        Random random = new Random();
        //获取随机状态
        int i = random.nextInt(jsonStatus.length());
        String randomStatus = jsonStatus.get(i).toString();
        //获取随机记录时长
        int j = random.nextInt(jsonTimeWorkedStr.length());
        String timeWorkedStr = jsonTimeWorkedStr.get(j).toString();
        //更新json
        workLog = new JSONObject(workLog).put("timeWorkedStr", timeWorkedStr).toString();
        //判断是否开启区间日期来添加日志
        if (jsonObject.get("isAutoAddLog").toString().equals("true")) {
            System.out.println("开启区间添加日志");
            // 日期格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                // 起始日期
                String autoStartDate = jsonObject.get("autoStartDate").toString();
                Date StartDate = sdf.parse(autoStartDate);
                // 结束日期
                String autoEndDate = jsonObject.get("autoEndDate").toString();
                Date EndDate = sdf.parse(autoEndDate);
                Date tmp = StartDate;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(StartDate);
                // 获取日期
                while (tmp.getTime() < EndDate.getTime()) {
                    tmp = calendar.getTime();
                    //日期
                    String date = sdf.format(tmp);
                    //替换默认的时间
                    workLog = new JSONObject(workLog).put("startDate", date).toString();
                    //随机获取状态
                    i = random.nextInt(jsonStatus.length());
                    randomStatus = jsonStatus.get(i).toString();
                    //获取随机记录时长
                    j = random.nextInt(jsonTimeWorkedStr.length());
                    timeWorkedStr = jsonTimeWorkedStr.get(j).toString();
                    workLog = new JSONObject(workLog).put("timeWorkedStr", timeWorkedStr).toString();
                    //执行添加
                    Request.reqestUrl("post", userJson,
                            Properties.url+"/rest/shdsd-Timesheet/latest/worklog?auditLogStatus=" + randomStatus + "&auditor=" + auditor + "&isOvertime=false&thisTimeOvertimeStr=0h"
                            , workLog);
                    // 天数加1
                    calendar.add(Calendar.DAY_OF_MONTH, 1);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            Request.reqestUrl("post", userJson,
                    Properties.url+"/rest/shdsd-Timesheet/latest/worklog?auditLogStatus=" + randomStatus + "&auditor=" + auditor + "&isOvertime=false&thisTimeOvertimeStr=0h"
                    , workLog);
        }


    }

}

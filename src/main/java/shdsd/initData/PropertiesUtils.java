package shdsd.initData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.net.URL;
import java.util.Date;

public class PropertiesUtils {
    private static final Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);
    private static Date startDate = null;//起始时间
    public static String settingData = PropertiesUtils.readJsonFile("testSetting/Setting.json");
    /**
     * 读取json文件，返回json字符串
     * @param fileName
     * @return
     */
    public static String readJsonFile(String fileName) {
        FileReader fileReader = null;
        Reader reader = null;
        try {
            // 获取URL
            URL url = PropertiesUtils.class.getClassLoader().getResource(fileName);
            File jsonFile = new File(url.getFile());
            //File jsonFile = ResourceUtils.getFile("classpath:"+fileName);
            fileReader = new FileReader(jsonFile);
            reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            String jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            //logger.error("读取文件报错", e);
        } finally {
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    // 把json格式的字符串写到文件
    public static boolean writeFile(String content) {
        File file = new File("src");
        String filePath = null;
        try {
            filePath = file.getCanonicalPath()+"/main/resources/testSetting/Setting.json";
        } catch (IOException e) {
            System.out.println("查询路径失败:"+e);
        }
        FileWriter fileWritter = null;
        try {
            fileWritter = new FileWriter(filePath,false);
            fileWritter.write(content);
            settingData = content;
            System.out.println("finish");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                fileWritter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("成功");
        }

    }


    /**
     * 计算运行时间
     */
    public static void getRunDate(){
        if(startDate==null){
            startDate = new Date();
        }else{
            //获取当前时间
            Date endDate = new Date();
            long time = (endDate.getTime() - startDate.getTime())/1000;
            if(time>60){
                int minute = (int) (time/60);
                int remainder = (int) (time%60);
                System.out.println("执行共计:"+minute+"分钟,"+remainder+"秒。");
            }else if(time==0){
                System.out.println("执行共计不到一秒");
            }else{
                System.out.println("执行共计:"+time+"秒");
            }

        }
    }
}

package shdsd.selenium.Tools;

import java.io.*;

public class PropertyUtil {

    private static java.util.Properties props;

    public static void loadProps() {
        props = new java.util.Properties();
        InputStream in = null;
        try {
            //获取父级的properties
            String property = Properties.getProperty();
            // 使用InPutStream流读取properties文件
            BufferedReader bufferedReader = new BufferedReader(new FileReader(property + "/application.properties"));
            props.load(bufferedReader);
        } catch (FileNotFoundException e) {
            System.out.println("外部application.properties文件未找到");
            System.out.println("正在获取内部properties文件");
            in = PropertyUtil.class.getClassLoader().getResourceAsStream("application.properties");
            try {
                props.load(in);
            } catch (IOException ex) {
                System.out.println("内部application.properties文件未找到");
            }
        } catch (IOException e) {
            System.out.println("出现IOException");
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("application.properties文件流关闭出现异常");
            }
        }
    }

    /**
     * 根据key获取配置文件中的属性
     */
    public static String getProperty(String key) {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }

    /**
     * 根据key获取配置文件中的属性，当为null时返回指定的默认值
     */
    public static String getProperty(String key, String defaultValue) {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key, defaultValue);
    }
}

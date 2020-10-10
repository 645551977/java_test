package shdsd.initData;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * get 请求
 */
public class Request {
    public static Object reqestUrl(String type, String userJson,String path, String param) {
        //请求得到的结果
        String result = "";
        if (type.equals("post")) {
            try {
                // 创建url资源
                URL url = new URL(path);//http://localhost:2990/jira/rest/auth/1/session
                // 建立http连接
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                // 设置允许输出
                conn.setDoOutput(true);
                conn.setDoInput(true);

                // 设置不用缓存
                conn.setUseCaches(false);
                // 设置传递方式
                conn.setRequestMethod("POST");
                // 设置维持长连接
                conn.setRequestProperty("Connection", "Keep-Alive");
                // 设置文件字符集:
                conn.setRequestProperty("Charset", "UTF-8");
               // conn.setRequestProperty("cookie", "JSESSIONID=" + sessionId);
                JSONObject jsonObject = new JSONObject(userJson);
                System.out.print(jsonObject.get("username").toString());
                String username = jsonObject.get("username").toString();
                String password = jsonObject.get("password").toString();
                String authString = username + ":" + password;
                byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
                String authStringEnc = new String(authEncBytes);
                conn.setRequestProperty("Authorization", "Basic "+authStringEnc);
                //转换为字节数组
                byte[] data = param.getBytes();
                // 设置文件长度
                conn.setRequestProperty("Content-Length", String.valueOf(data.length));

                // 设置文件类型
                conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                // 开始连接请求
                conn.connect();
                if (param != null) {
                    System.out.println(param);
                    OutputStream out = conn.getOutputStream();
                    // 写入请求的字符串
                    out.write((param).getBytes());
                    out.flush();
                    out.close();
                }
                System.out.println(conn.getResponseCode());
                // 请求返回的状态
                if (conn.getResponseCode() == 200) {
                    System.out.println("连接成功");
                    // 请求返回的数据
                    InputStream in = conn.getInputStream();
                    String a = null;
                    try {
                        byte[] data1 = new byte[in.available()];
                        in.read(data1);
                        // 转成字符串
                        a = new String(data1);
                        //拿到的结果
                        System.out.println(a);
                        return a;
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                } else if (conn.getResponseCode() == 201) {
                    InputStream in = conn.getInputStream();
                    String a = null;
                    try {
                        byte[] data1 = new byte[in.available()];
                        in.read(data1);
                        // 转成字符串
                        a = new String(data1);
                        //拿到的结果
                        System.out.println("不是200---" + a);
                        return a;
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                } else {
                    InputStream in = conn.getErrorStream();
                    String a = null;
                    try {
                        byte[] data1 = new byte[in.available()];
                        in.read(data1);
                        // 转成字符串
                        a = new String(data1);
                        //拿到的结果
                        System.out.println("失败:" + a);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    return "";
                }

            } catch (Exception e) {

            }
        } else {
            try {
                URL url = new URL(path);
                //得到connection对象。
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                //设置请求方式
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Charset", "UTF-8");
                connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                JSONObject jsonObject = new JSONObject(userJson);
                String username = jsonObject.get("username").toString();
                String password = jsonObject.get("password").toString();
                String authString = username + ":" + password;
                byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
                String authStringEnc = new String(authEncBytes);
                connection.setRequestProperty("Authorization", "Basic "+authStringEnc);
                //连接
                connection.connect();
                //得到响应码
                int responseCode = connection.getResponseCode();
                System.out.println("响应码:" + responseCode);
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    //得到响应流
                    InputStream inputStream = connection.getInputStream();
                    //获取响应
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        result += line;
                    }
                    reader.close();
                    //连接断了
                    connection.disconnect();
                }else {
                    System.out.println("错误码:" + responseCode);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}

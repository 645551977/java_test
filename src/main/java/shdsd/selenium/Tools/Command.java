package shdsd.selenium.Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Command {
    public static void exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        //String commandStr = "cmd /c dir";
        Runtime.getRuntime().exec("cmd /k start D:/liuyancheng/workspace/jarTest/start.bat");
        Runtime.getRuntime().exec("cmd /k start D:/liuyancheng/workspace/jarTest/start.bat");
        //Command.exeCmd(commandStr);
    }
}

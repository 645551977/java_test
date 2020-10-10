package TestCase.Source;

import org.testng.annotations.DataProvider;

public class AllDataProvider {
    @DataProvider
    public static Object [][] logSource(){
        return new Object[][]{
                new Object[]{"","","不能为空"},
                new Object[]{"1 h","测试","无效的时间"},
                new Object[]{"1+2h","测试","无效的时间"},
                new Object[]{"fdgg","测试","无效的时间"},
                new Object[]{"1h+2h","测试","无效的时间"}
        };
    }

    @DataProvider
    public static Object [][] planSource(){
        return new Object[][]{
                new Object[]{"","","不能为空"},
                new Object[]{"1 h","测试","无效的时间"},
                new Object[]{"1+2h","测试","无效的时间"},
                new Object[]{"fdgg","测试","无效的时间"},
                new Object[]{"1h+2h","测试","无效的时间"}
        };
    }

    @DataProvider
    public static Object [][] overtime(){
        return new Object[][]{
                new Object[]{"20h","测试","30h","不能超过耗费时间"},
                new Object[]{"13h","研发","sdfsd","无效的时间"},
                new Object[]{"15","实施","7H","无效的时间"},
                new Object[]{"80h","产品","3.555h","不能超过耗费时间"},
                new Object[]{"30","前端","1+3h","无效的时间"}
        };
    }
    @DataProvider
    public static Object [][] limitLog(){
        return new Object[][]{
                new Object[]{"20h","测试","今日录入工时已超出"},
                new Object[]{"13h","研发","今日录入工时已超出"},
                new Object[]{"15","实施","今日录入工时已超出"},
                new Object[]{"80h","产品","今日录入工时已超出"},
                new Object[]{"30sssss","前端","无效的时间"}
        };
    }

    @DataProvider
    public static Object [][] Workday(){
        return new Object[][]{
                new Object[]{"","","名称不能为空"},
                new Object[]{"","fsgdfg","名称不能为空"},
                new Object[]{"     ","","名称不能为空"}
        };
    }
    @DataProvider
    public static Object [][] CalendarScheme(){
        return new Object[][]{
                new Object[]{"","","名称不能为空"},
                new Object[]{"","fsgdfg","名称不能为空"},
                new Object[]{"     ","","名称不能为空"}
        };
    }
    @DataProvider
    public static Object [][] WorkType(){
        return new Object[][]{
                new Object[]{"","","名称不能为空"},
                new Object[]{"","fsgdfg","名称不能为空"},
                new Object[]{"     ","","名称不能为空"}
        };
    }
    @DataProvider
    public static Object [][] workTypeScheme(){
        return new Object[][]{
                new Object[]{"","","名称不能为空"},
                new Object[]{"","fsgdfg","名称不能为空"},
                new Object[]{"测试数据","","工作类型已选列表不能为空"}
        };
    }




}

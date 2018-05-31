package util;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018/5/8.
 */
public class ReadProperties {

    public static String browserName;
    public static String url;

    public static void initconfigdata() throws IOException {
        Properties properties=new Properties();
        //加载配置文件
        InputStream inputStream=new FileInputStream("./config.properties");
        properties.load(inputStream);
        browserName=properties.getProperty("browserName");
        url=properties.getProperty("url");

    }
}

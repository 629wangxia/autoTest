package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by Administrator on 2018/5/7.
 */
public class LogConfiguration {
    public static void initLog(){
        //指定日期生成格式
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        //获取日期
        String date=dateFormat.format(new Date());
        //声明日志文件存储路径、文件名格式
        final String logFilePath="./Log/"+"/"+date+".log";
        Properties properties=new Properties();
        //配置日志格式
        properties.setProperty("log4j.rootLogger","info,toConsole,toFile");
        properties.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        properties.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        properties.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        properties.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy_MM_dd HH_mm_ss}] [%p] %m%n");
        properties.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n\"");
        properties.setProperty("log4j.appender.toFile.file",logFilePath);
        //配置生效
        PropertyConfigurator.configure(properties);
    }
}

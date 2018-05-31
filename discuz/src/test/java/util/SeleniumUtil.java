package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/5/8.
 */
public class SeleniumUtil {
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver;

    //加载驱动
    public WebDriver getDriver(String driverType){
        if (driverType.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
            driver=new ChromeDriver();
            logger.info("成功启动ChromeDriver。。。");
        }else if (driverType.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","./tools/geckodriver.exe");
            driver=new FirefoxDriver();
            logger.info("成功启动FirefoxDriver。。。");
        }else{
            logger.error("不能识别的驱动！");
        }
        return driver;
    }

    //打开网址
    public void getUrl(String url){
        driver.get(url);
        logger.info("打开网址为："+url);
    }

    //窗口最大化
    public void changeMax(){
        driver.manage().window().maximize();
        logger.info("窗口最大化");
    }

    //识别一个元素
    public WebElement findElement(By by){
        WebElement element=null;
        try{
            driver.findElement(by);
            logger.info("找到元素====>"+element);
            return element;
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.info("未找到元素！");
            return null;
        }
    }

    //返回元素定位值
    public String getLocatorByElement(WebElement element, String exceptText) {
        String text=element.toString();
        String except=null;
        try {
            except=text.substring(text.indexOf(exceptText)+1,text.length()-1);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("failed to find the String:"+exceptText);
        }
        return except;
    }

    //识别一组元素
    public List<WebElement> findElements(By by){
        logger.info("返回一组元素");
        return driver.findElements(by);
    }

    //清空元素上的内容
    public void clear(By by){
        WebElement webElement=driver.findElement(by);
        webElement.clear();
        logger.info("内容被清空");
    }

    //文本框输入内容
    public void sendKeys(By by,String text){
        WebElement webElement=driver.findElement(by);
        clear(by);
        webElement.sendKeys(text);
        logger.info("成功输入内容====>"+text);
    }

    //点击元素
    public void click(By by){
        WebElement webElement=driver.findElement(by);
        webElement.click();
        logger.info("成功点击元素"+webElement);
    }

    //切换新窗口
    public void windowHandles(By by){
        Set<String> window=driver.getWindowHandles();
        for (String windows:window
             ) {
            driver.switchTo().window(windows);
            logger.info("获取到的窗口为："+windows);
        }
    }

    //切换iframe
    public void getIframe(String id){
        driver.switchTo().frame(id);
    }

    //退出iframe
    public void quitIframe(){
        driver.switchTo().defaultContent();
    }

    /** 根据顶部title判断当前页面是否是预期页面 **/
    public void assertPage(String expected){
        String actual=driver.getTitle();
        try {
            Assert.assertEquals(actual,expected);
        }catch (AssertionError e){
            logger.error("预期文字是：["+expected+"],但实际文字是：["+actual+"]");
            Assert.fail("预期文字是：["+expected+"],但实际文字是：["+actual+"]");
        }
        logger.info("找到了对应title，当前页面正确：["+actual+"]");
    }

    //检验文本是否与预期一致
    public void assertForText(String actual,String expected){
        try {
            Assert.assertEquals(actual,expected);
        }catch (AssertionError e){
            logger.error("预期文字是：["+expected+"],但实际文字是：["+actual+"]");
            Assert.fail("预期文字是：["+expected+"],但实际文字是：["+actual+"]");
        }
        logger.info("找到了期望的文字：["+expected+"]");
    }


    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (Exception e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }
}

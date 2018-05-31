package testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.ReadProperties;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by Administrator on 2018/5/7.
 */
public class BasicTestCase {
    public SeleniumUtil seleniumUtil=null;
    public WebDriver driver;

    @BeforeMethod
    public void initTests() throws IOException {

        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        ReadProperties.initconfigdata();
        seleniumUtil.getDriver(ReadProperties.browserName);
        seleniumUtil.getUrl(ReadProperties.url);
        seleniumUtil.changeMax();
    }

    /*@AfterMethod
    public void teardown(){
        driver.quit();
    }*/

}

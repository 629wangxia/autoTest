package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperSearchPage;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by Administrator on 2018/5/9.
 */
public class SearchTest extends BasicTestCase{

    @Test
    public void search() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"wangxia","123456");
        Thread.sleep(3000);
        HelperSearchPage.inputSearchText(seleniumUtil,"haotest");
    }


}

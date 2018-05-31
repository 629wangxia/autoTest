package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperManagementPage;

/**
 * Created by Administrator on 2018/5/9.
 */
public class ManagementTest extends BasicTestCase{

    @Test
    public void management_luntan() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","root");
        Thread.sleep(5000);
        HelperManagementPage.management(seleniumUtil,"root");
    }
}

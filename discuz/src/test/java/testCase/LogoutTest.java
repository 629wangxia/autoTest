package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperLogoutPage;

/**
 * Created by Administrator on 2018/5/8.
 */
public class LogoutTest extends BasicTestCase{

    @Test
    public void login_logout() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"wangxia","123456");
        Thread.sleep(5000);
        HelperLogoutPage.logout(seleniumUtil);
    }
}

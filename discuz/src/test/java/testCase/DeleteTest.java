package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperDeletePage;
import pageHelper.HelperLoginPage;

/**
 * Created by Administrator on 2018/5/8.
 */
public class DeleteTest extends BasicTestCase{

    @Test
    public void login_delete() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","root");
        Thread.sleep(3000);
        HelperDeletePage.delete(seleniumUtil);
    }
}

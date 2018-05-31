package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperPostPage;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PostTest extends BasicTestCase{

    @Test
    public void login_post() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"wangxia","123456");
        Thread.sleep(3000);
        HelperPostPage.post(seleniumUtil,"热","夏天好热！");
    }

}

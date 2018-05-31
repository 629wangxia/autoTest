package testCase;


import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperReplyPage;

/**
 * Created by Administrator on 2018/5/8.
 */
public class ReplyTest extends BasicTestCase{

    @Test
    public void lohin_reply() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"wangxia","123456");
        Thread.sleep(5000);
        HelperReplyPage.reply(seleniumUtil,"一起努力，共创未来！");
    }
}

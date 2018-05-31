package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by Administrator on 2018/5/7.
 */
public class LoginText extends BasicTestCase{

    @Test
    public void login(){
        HelperLoginPage.login(seleniumUtil,"wangxia","123456");
    }

}
package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by Administrator on 2018/5/8.
 */
public class LoginAdmin extends BasicTestCase{
    @Test
    public void login(){
        HelperLoginPage.login(seleniumUtil,"admin","root");
    }
}


package pageHelper;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import util.SeleniumUtil;
import page.PageLogin;

/**
 * Created by Administrator on 2018/5/7.
 */
public class HelperLoginPage {
    public static Logger logger=Logger.getLogger(HelperLoginPage.class);

    //输入用户名
    public static void inputUserName(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.sendKeys(PageLogin.LOGIN_TEXT_USERNAME,name);
    }
    //输入密码
    public static void inputUserPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(PageLogin.LOGIN_TEXT_USERPASSWORD,password);
    }
    //点击登录按钮
    public static void clickLoginButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_BUTTON_SUBMIT);
    }
    //自动登录
    public static void clickAutoLogin(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_RADIO_AUTOLOGIN);
    }
    //找回密码
    public static void findPassword(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_FINDPASSWORD);
    }
    //立即注册
    public static void register(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_REGISTER);
    }
    //普通登录步骤
    public static void login(SeleniumUtil seleniumUtil,String name,String password){
        seleniumUtil.sendKeys(PageLogin.LOGIN_TEXT_USERNAME,name);
        seleniumUtil.sendKeys(PageLogin.LOGIN_TEXT_USERPASSWORD,password);
        seleniumUtil.click(PageLogin.LOGIN_BUTTON_SUBMIT);
    }
}

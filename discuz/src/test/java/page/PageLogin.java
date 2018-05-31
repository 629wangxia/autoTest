package page;


import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/7.
 */
public class PageLogin {
    //用户名文本框
    public static final By LOGIN_TEXT_USERNAME=By.id("ls_username");
    //密码文本框
    public static final By LOGIN_TEXT_USERPASSWORD=By.id("ls_password");
    //登录按钮
    public static final By LOGIN_BUTTON_SUBMIT=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button/em");
    //自动登录
    public static final By LOGIN_RADIO_AUTOLOGIN=By.id("ls_cookietime");
    //找回密码
    public static final By LOGIN_LINK_FINDPASSWORD=By.linkText("找回密码");
    //立即注册
    public static final By LOGIN_LINK_REGISTER=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[4]/a");
}

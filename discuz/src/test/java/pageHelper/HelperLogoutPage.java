package pageHelper;

import org.apache.log4j.Logger;
import page.PageLogout;
import util.SeleniumUtil;


/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperLogoutPage {

    public static Logger logger=Logger.getLogger(HelperLogoutPage.class);

    //点击退出链接
    public static void logout(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogout.LOGOUT_LINK_QUIT);
    }
}

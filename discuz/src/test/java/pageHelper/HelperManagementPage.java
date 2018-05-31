package pageHelper;

import org.apache.log4j.Logger;
import page.PageManagement;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/9.
 */
public class HelperManagementPage {

    public static Logger logger=Logger.getLogger(HelperManagementPage.class);
    //点击管理中心链接
    public static void clickManagementCenter(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManagement.MANAGEMENT_LINK_CENTER);
    }
    //输入密码
    public static void inputAdminPassword(SeleniumUtil seleniumUtil,String adminPassword){
        seleniumUtil.windowHandles(PageManagement.MANAGEMENT_TEXT_PASSWORD);
        seleniumUtil.sendKeys(PageManagement.MANAGEMENT_TEXT_PASSWORD,adminPassword);
    }
    //点击提交按钮
    public static void clickSubmitButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManagement.MANAGEMENT_BUTTON_SUBMIT);
    }
    //点击论坛链接
    public static void clickLunTan(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManagement.MANAGEMENT_LINK_LUNTAN);
    }
    //点击管理中心-论坛步骤
    public static void management(SeleniumUtil seleniumUtil,String adminPassword) throws InterruptedException {
        seleniumUtil.click(PageManagement.MANAGEMENT_LINK_CENTER);
        seleniumUtil.windowHandles(PageManagement.MANAGEMENT_TEXT_PASSWORD);
        seleniumUtil.sendKeys(PageManagement.MANAGEMENT_TEXT_PASSWORD,adminPassword);
        seleniumUtil.click(PageManagement.MANAGEMENT_BUTTON_SUBMIT);
        Thread.sleep(3000);
        seleniumUtil.click(PageManagement.MANAGEMENT_LINK_LUNTAN);

    }


}

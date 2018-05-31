package pageHelper;

import org.apache.log4j.Logger;
import page.PageManagement;
import page.PageNewPlate;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/9.
 */
public class HelperNewPlatePage {
    public static Logger logger=Logger.getLogger(HelperNewPlatePage.class);
    //点击管理中心链接
    public static void clickManagementCenter(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageNewPlate.MANAGEMENT_LINK_CENTER);
    }
    //输入密码
    public static void inputAdminPassword(SeleniumUtil seleniumUtil,String adminPassword){
        seleniumUtil.windowHandles(PageNewPlate.MANAGEMENT_TEXT_PASSWORD);
        seleniumUtil.sendKeys(PageNewPlate.MANAGEMENT_TEXT_PASSWORD,adminPassword);
    }
    //点击提交按钮
    public static void clickSubmitButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageNewPlate.MANAGEMENT_BUTTON_SUBMIT);
    }
    //点击论坛链接
    public static void clickLunTan(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageNewPlate.MANAGEMENT_LINK_LUNTAN);
    }
    //点击添加新版块链接
    public static void clickAddNewPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageNewPlate.MANAGEMENT_LINK_ADDNEWPLATE);
    }
    //点击提交按钮
    public static void clickSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageNewPlate.MANAGEMENT_BUTTON_SUBMIT1);
    }
    //添加新版块步骤
    public static void management(SeleniumUtil seleniumUtil,String adminPassword) throws InterruptedException {
        seleniumUtil.click(PageNewPlate.MANAGEMENT_LINK_CENTER);
        seleniumUtil.windowHandles(PageNewPlate.MANAGEMENT_TEXT_PASSWORD);
        seleniumUtil.sendKeys(PageNewPlate.MANAGEMENT_TEXT_PASSWORD,adminPassword);
        seleniumUtil.click(PageNewPlate.MANAGEMENT_BUTTON_SUBMIT);
        Thread.sleep(3000);
        seleniumUtil.click(PageNewPlate.MANAGEMENT_LINK_LUNTAN);
        seleniumUtil.getIframe("main");
        seleniumUtil.click(PageNewPlate.MANAGEMENT_LINK_ADDNEWPLATE);
        seleniumUtil.click(PageNewPlate.MANAGEMENT_BUTTON_SUBMIT1);
    }


}

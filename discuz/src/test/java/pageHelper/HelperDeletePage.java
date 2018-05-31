package pageHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import page.PageDelete;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperDeletePage {

    public static Logger logger=Logger.getLogger(HelperDeletePage.class);
    //点击默认板块
    public static void clickDefaultPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_LINK_DEFAULTPLATE);
    }
    //选中某个帖子
    public static void clickPostRadio(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_RADIO_EXISTPOST);
    }
    //删除帖子
    public static void clickDeletePost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_LINK_DELETEPOST);
    }
    //确定删除
    public static void clickConfirmDelete(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_BUTTON_CONFIRM);
    }
    //删除帖子步骤
    public static void delete(SeleniumUtil seleniumUtil) throws InterruptedException {

        seleniumUtil.click(PageDelete.DELETE_LINK_DEFAULTPLATE);
        seleniumUtil.click(PageDelete.DELETE_RADIO_EXISTPOST);
        seleniumUtil.click(PageDelete.DELETE_LINK_DELETEPOST);
        Thread.sleep(3000);
        seleniumUtil.click(PageDelete.DELETE_BUTTON_CONFIRM);
    }
}


package pageHelper;

import org.apache.log4j.Logger;
import page.PageReply;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperReplyPage {

    public static Logger logger=Logger.getLogger(HelperReplyPage.class);

    //点击默认板块
    public static void clickDefaultPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageReply.REPLY_LINK_DEFAULTPLATE);
    }
    //点击某个帖子
    public static void clickExistPost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageReply.REPLY_LINK_EXISTPOST);
    }
    //输入回帖内容
    public static void inputReplyPost(SeleniumUtil seleniumUtil,String body){
        seleniumUtil.sendKeys(PageReply.REPLY_TEXT_POSTBODY,body);
    }
    //点击回复帖子按钮
    public static void clickReplyButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageReply.REPLY_BUTTON_REPLYPOST);
    }
    //回帖步骤
    public static void reply(SeleniumUtil seleniumUtil,String body){
        seleniumUtil.click(PageReply.REPLY_LINK_DEFAULTPLATE);
        seleniumUtil.click(PageReply.REPLY_LINK_EXISTPOST);
        seleniumUtil.sendKeys(PageReply.REPLY_TEXT_POSTBODY,body);
        seleniumUtil.click(PageReply.REPLY_BUTTON_REPLYPOST);
    }
}

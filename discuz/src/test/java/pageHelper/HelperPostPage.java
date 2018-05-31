package pageHelper;


import org.apache.log4j.Logger;
import page.PagePost;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/8.
 */
public class HelperPostPage {

    public static Logger logger=Logger.getLogger(HelperPostPage.class);

    //点击默认板块
    public static void clickDefaultPlate(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePost.POST_LINK_DEFAULTPLATE);
    }
    //输入帖子标题
    public static void inputPostTitle(SeleniumUtil seleniumUtil, String title){
        seleniumUtil.sendKeys(PagePost.POST_TEXT_TITLE,title);
    }
    //输入帖子内容
    public static void inputPostBody(SeleniumUtil seleniumUtil,String body){
        seleniumUtil.sendKeys(PagePost.POST_TEXT_BODY,body);
    }
    //点击发表帖子按钮
    public static void clickSubmitButton(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePost.POST_BUTTON_SUBMIT);
    }
    //模块发表帖子步骤
    public static void post(SeleniumUtil seleniumUtil,String title,String body){

        seleniumUtil.click(PagePost.POST_LINK_DEFAULTPLATE);
        seleniumUtil.sendKeys(PagePost.POST_TEXT_TITLE,title);
        seleniumUtil.sendKeys(PagePost.POST_TEXT_BODY,body);
        seleniumUtil.click(PagePost.POST_BUTTON_SUBMIT);
    }

}

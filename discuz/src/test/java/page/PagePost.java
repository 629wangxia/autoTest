package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PagePost {
    //默认板块
    public static final By POST_LINK_DEFAULTPLATE=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //帖子标题
    public static final By POST_TEXT_TITLE=By.id("subject");
    //帖子内容
    public static final By POST_TEXT_BODY=By.id("fastpostmessage");
    //发表帖子按钮
    public static final By POST_BUTTON_SUBMIT=By.id("fastpostsubmit");

}

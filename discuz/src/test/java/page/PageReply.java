package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageReply {

    //默认板块
    public static final By REPLY_LINK_DEFAULTPLATE=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //某个帖子
    public static final By REPLY_LINK_EXISTPOST=By.xpath("//*[@id=\"normalthread_3\"]/tr/th/a[2]");
    //回复帖子
    public static final By REPLY_TEXT_POSTBODY=By.id("fastpostmessage");
    //回复按钮
    public static final By REPLY_BUTTON_REPLYPOST=By.id("fastpostsubmit");
}

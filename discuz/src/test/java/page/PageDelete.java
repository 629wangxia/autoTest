package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageDelete {
    //默认板块
    public static final By DELETE_LINK_DEFAULTPLATE=By.linkText("默认版块");
    //选中某个帖子
    public static final By DELETE_RADIO_EXISTPOST=By.xpath("//*[@id=\"normalthread_7\"]/tr/td[2]/input");
    //删除
    public static final By DELETE_LINK_DELETEPOST=By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");
    //确定按钮
    public static final By DELETE_BUTTON_CONFIRM=By.xpath("//*[@id=\"modsubmit\"]");
}

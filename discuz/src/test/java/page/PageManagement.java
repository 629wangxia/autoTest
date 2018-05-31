package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/8.
 */
public class PageManagement {
    //管理中心链接
    public static final By MANAGEMENT_LINK_CENTER=By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    //密码文本框
    public static final By MANAGEMENT_TEXT_PASSWORD=By.xpath("//*[@id=\"loginform\"]/p[4]/input");
    //提交按钮
    public static final By MANAGEMENT_BUTTON_SUBMIT=By.xpath("//*[@id=\"loginform\"]/p[9]/input");
    //论坛链接
    public static final By MANAGEMENT_LINK_LUNTAN=By.id("header_forum");
}

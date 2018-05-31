package pageHelper;

import org.apache.log4j.Logger;
import page.PageSearch;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/9.
 */
public class HelperSearchPage {
    public static Logger logger=Logger.getLogger(HelperSearchPage.class);

    public static void inputSearchText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(PageSearch.SEARCH_TEXT_SEARCH,"haotest");
    }
}

package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperNewPlatePage;

/**
 * Created by Administrator on 2018/5/9.
 */
public class NewPlateTest extends BasicTestCase{

    @Test
   public void addNewPlate() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","root");
        Thread.sleep(5000);
        HelperNewPlatePage.management(seleniumUtil,"root");

    }
}

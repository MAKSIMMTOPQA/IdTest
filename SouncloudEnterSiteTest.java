import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class SouncloudEnterSiteTest extends SoundCloudBaseTest{


    @Test
    public void SoundCloudSuccessTest() throws InterruptedException {



       SoundCloudEnterPage enterPage = new SoundCloudEnterPage(webDriver);

        Assert.assertEquals(enterPage.getCurrentUrl(), "https://soundcloud.com/", "Enter page is not loaded");
        sleep(1000);
        enterPage.clickSingIn();
        sleep(1000);

        Assert.assertTrue(enterPage.IsPageLoaded(), "page is not loaded");
        if (enterPage.IsPageLoaded())
           // return enterPage.returnBasepage();

       System.out.println("Нету елемента");

        PrivacyPolicyPage privacyPolicyPage = soundCloudEnterPage.clickonButton();
         sleep(1000);

//        List<String> allWindows = (List<String>) webDriver.getWindowHandles();
//        for(String curWindow : allWindows){
//            webDriver.switchTo().window(curWindow);
//        }
        webDriver.close();









    }
}

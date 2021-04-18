package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static config.ConfigHelper.isVideoOn;
import static helper.AttachmentsHelper.*;
import static helper.DriverHelper.*;

public class TestBase {

    @BeforeAll
    public static void beforeAll(){
        configureDriver();

    }

    @AfterEach
    public void addAttachments(){
        String sessionId = getSessionId();

        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        if (isVideoOn()) attachVideo(sessionId);

        closeWebDriver();
    }

//    Iterate to next(particular) window
//    public void iterateToTheTab(int newTab){
//        Set<String> ids = driver.getWindowHandles();
//        Iterator<String> it = ids.iterator();
//        for(int i=0; i<newTab; i++) {
//            driver.switchTo().window(it.next());
//        }
//        log.info("Go to the " +newTab+ " tab");
//
//    }








}

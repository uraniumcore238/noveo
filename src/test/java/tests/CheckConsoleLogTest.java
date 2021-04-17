package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static helper.DriverHelper.getConsoleLogs;
import static io.qameta.allure.Allure.step;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

@Tag("web")
public class CheckConsoleLogTest extends TestBase {

    @Test
    @DisplayName("Check the console log")
    void checkTheConsoleLog(){

        step("Open main page", () -> open(""));

        step("Console log shouldn't have errors", () -> {
            String consoleLogs = getConsoleLogs();
            assertThat(consoleLogs, not(containsString("SEVERE")));
        });


    }


}

package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

@Tag("web")
public class CheckTheHeaderMenuTest extends TestBase {

    @Test
    @DisplayName("Check the header")
    void checkTheHeaderMenu(){



        step("Open main page", () -> open(""));


    }


}

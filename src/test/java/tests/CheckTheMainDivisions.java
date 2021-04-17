package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@Tag("web")
public class CheckTheMainDivisions extends TestBase {


    @Test
    @DisplayName("Check the main divisions on the main page")
    void checkTheMainDivTest() {
        open("");

        $(".index-poster h2").shouldHave(text("Разрабатываем"));
    }


}

package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("web")
public class CheckTheHeaderMenuTest extends TestBase {

    @Test
    @DisplayName("Check the header")
    void checkTheHeaderMenu(){

        step("Open main page", () -> open(""));

        step("Header menu should have elements О компании, Вакансии, Noveo University, Блог, Контакты", () -> {
            $("a[title='О компании']").shouldHave(text("О компании"));
            $("a[title='Вакансии']").shouldHave(text("Вакансии"));
            $("a[title='Noveo University']").shouldHave(text("Noveo University"));
            $("a[title='Блог']").shouldHave(text("Блог"));
            $("a[title='Контакты']").shouldHave(text("Контакты"));
        });


    }


}

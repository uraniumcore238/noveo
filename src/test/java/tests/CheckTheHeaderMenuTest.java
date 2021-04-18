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
            $("a[href='/about']").shouldHave(text("О компании"));
            $("a[href='/job.noveogroup.ru/").shouldHave(text("Вакансии"));
            $("a[href='https://university.noveogroup.ru/']").shouldHave(text("Noveo University"));
            $("a[href='https://blog.noveogroup.ru/']").shouldHave(text("Блог"));
            $("a[href='https://noveogroup.ru/contact']").shouldHave(text("Контакты"));
        });


    }


}

package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("web")
public class AboutCompanyTest extends TestBase{



    @Test
    @DisplayName("Check About company page")
    void checkTheAboutCompanyPage() {

        step("Open main page", () -> open(""));

        step("Проверка что при переходе на страницу отображается заголовок \"Качество на международном уровне\"", () -> {
            $("a[href='/about']").click();
            $(".about-description  .index__title-desc").shouldHave(text("Качество на международном уровне"));

        });
    }

}

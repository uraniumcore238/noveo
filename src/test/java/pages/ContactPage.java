package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ContactPage {


    public void CheckIfContactPageIsOpened() {

        step("Contact page is opened", () -> {
            $(".contacts-content__caption").shouldHave(text("Хочешь работать в Noveo - свяжись с нами!"));
        });
    }
}

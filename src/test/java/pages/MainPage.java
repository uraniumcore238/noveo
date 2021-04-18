package pages;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {

    public void OpenMainPage() {
        step("Open main page", () -> open(""));

        step("Check the title \"Разрабатываем\"", () -> {
            $(".index-poster h2").shouldHave(Condition.text("Разрабатываем"));
        });

    }

    public void OpenBlogPage() {

        step("Click on blog button in main menu", () -> {
            $("a[href='https://blog.noveogroup.ru/']").click();
        });

    }




}

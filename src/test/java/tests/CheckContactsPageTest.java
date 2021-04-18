package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BlogPage;
import pages.ContactPage;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("web")
public class CheckContactsPageTest extends TestBase{

    MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();

    @Test
    @DisplayName("Check contacts page")
    void checkContactsPage() {

        step("Переход на главную страницу сайта noveo.ru", () -> mainPage.OpenMainPage());
        step("Переход на страницу контактов из главного меню", () -> mainPage.OpenContactsPage());
        step("Проверка, что страница Контакты открыта", () -> contactPage.CheckIfContactPageIsOpened());

    }

}

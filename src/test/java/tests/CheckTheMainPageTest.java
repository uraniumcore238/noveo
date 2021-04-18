package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("web")
public class CheckTheMainPageTest extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Check main page")
    void checkIfMainPageIsOpened() {

        step("Переход на главную страницу сайта noveo.ru", () -> mainPage.OpenMainPage());
        step("Проверка, что на странице присутствуют основные разделы", () -> mainPage.CheckPresenceOfMainDivisions());
        step("Проверка, этапов отбора", () -> mainPage.CheckPresenceOfIndexStagesDivisions());
    }




}

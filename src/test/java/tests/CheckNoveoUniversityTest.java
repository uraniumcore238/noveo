package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("web")
public class CheckNoveoUniversityTest extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Check Noveo Universiry page")
    void checkNoveoUniversityPage() {

        step("Переход на главную страницу сайта noveo.ru", () -> mainPage.OpenMainPage());
        step("Переход на страницу Noveo University из главного меню", () -> mainPage.OpenNoveoUniversityPage());





    }
}

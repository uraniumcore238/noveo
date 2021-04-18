package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BlogPage;
import pages.MainPage;
import static io.qameta.allure.Allure.step;

@Tag("web")
public class CheckBlogPageTest extends TestBase{

    MainPage mainPage = new MainPage();
    BlogPage blogPage = new BlogPage();

    @Test
    @DisplayName("Check blog page")
    void checkBlogPage() {

        step("Переход на главную страницу сайта noveo.ru", () -> mainPage.OpenMainPage());
        step("Переход на страницу блога из главного меню", () -> mainPage.OpenBlogPage());
        step("Проверка, что страница Блог открыта", () -> blogPage.CheckIfTheBlogPageIsOpened());
        step("Проверка, что на странице присутствуют основные разделы", () -> blogPage.CheckMainDivisions());

    }

}

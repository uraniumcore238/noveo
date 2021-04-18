package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class BlogPage {


    public void CheckIfTheBlogPageIsOpened() {

        step("Blog page is opened", () -> {
            $(".index__title-desc").shouldHave(text("Наш блог"));
        });
    }

    public void CheckMainDivisions() {

        step("Check presence of main divisions on the page", () -> {
            $(".menu-vse").shouldHave(text("Все"));
            $(".menu-noveo-software-university").shouldHave(text("Noveo Software University"));
            $(".menu-nashi-proekty").shouldHave(text("Наши проекты"));
            $(".menu-tehnologii").shouldHave(text("Технологии"));
            $(".menu-testirovanie").shouldHave(text("Тестирование"));
            $(".menu-nasha-zhizn").shouldHave(text("Наша жизнь"));
            $(".menu-sovety").shouldHave(text("Советы"));
        });
    }

}

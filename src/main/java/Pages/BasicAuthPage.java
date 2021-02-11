package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuthPage {
    private SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'Basic Auth')]"));

    public SelenideElement getPageTitle() {
        return pageTitle;
    }
}

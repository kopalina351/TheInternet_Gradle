package Pages;

import Base.AbstractPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxesPage extends AbstractPage {
    private SelenideElement pageTitleElement = $(By.xpath("//h3[contains(text(),'Checkboxes')]"));
    private SelenideElement checkboxElements = $(By.cssSelector("input[type='checkbox']"));
    private SelenideElement checkboxElement1 = $(By.xpath("//input[@type='checkbox'][last()-1]"));
    private SelenideElement checkboxElement2 = $(By.xpath("//input[@type='checkbox'][last()]"));

    private final String urlCheckBoxes = "https://the-internet.herokuapp.com/checkboxes";
    private final String titleCheckBoxes = "Checkboxes";

    public SelenideElement getPageTitleElement() {
        return pageTitleElement;
    }

    public SelenideElement getCheckboxElements() {
        return checkboxElements;
    }

    public SelenideElement getCheckboxElement1() {
        return checkboxElement1;
    }

    public SelenideElement getCheckboxElement2() {
        return checkboxElement2;
    }

    @Override
    public String getUrl() {
        return urlCheckBoxes;
    }

    @Override
    public String getTitlePage() {
        return titleCheckBoxes;
    }
}

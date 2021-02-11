package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxesPage {
    private SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'Checkboxes')]"));
    private SelenideElement checkboxElements = $(By.cssSelector("input[type='checkbox']"));
    private SelenideElement checkboxElement1 = $(By.xpath("//input[@type='checkbox'][last()-1]"));
    private SelenideElement checkboxElement2 = $(By.xpath("//input[@type='checkbox'][last()]"));

    public SelenideElement getPageTitle() {
        return pageTitle;
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
}

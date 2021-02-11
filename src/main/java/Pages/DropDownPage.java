package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDownPage {
    private SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'Dropdown List')]"));
    private SelenideElement dropDownList = $(By.id("dropdown"));
    private SelenideElement ddElement = $(By.tagName("select"));

    public SelenideElement getPageTitle() {
        return pageTitle;
    }

    public SelenideElement getDropDownList() {
        return dropDownList;
    }

    public SelenideElement getDdElement() {
        return ddElement;
    }
}

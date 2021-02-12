package Pages;

import Base.AbstractPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDownPage extends AbstractPage {
    private SelenideElement pageTitleElement = $(By.xpath("//h3[contains(text(),'Dropdown List')]"));
    private SelenideElement dropDownList = $(By.id("dropdown"));
    private SelenideElement ddElement = $(By.tagName("select"));

    private final String urlDropDown = "https://the-internet.herokuapp.com/dropdown";
    private final String titleDropDown = "Dropdown List";

    public SelenideElement getPageTitleElement() {
        return pageTitleElement;
    }

    public SelenideElement getDropDownList() {
        return dropDownList;
    }

    public SelenideElement getDdElement() {
        return ddElement;
    }

    @Override
    public String getUrl() {
        return urlDropDown;
    }

    @Override
    public String getTitlePage() {
        return titleDropDown;
    }
}

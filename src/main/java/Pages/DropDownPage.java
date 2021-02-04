package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDownPage {
    public String urlDropDown = "https://the-internet.herokuapp.com/dropdown";
    public String titleDropDown = "Dropdown List";
    public SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'Dropdown List')]"));
    public SelenideElement dropDownList = $(By.id("dropdown"));
    public SelenideElement ddElement = $(By.tagName("select"));
}

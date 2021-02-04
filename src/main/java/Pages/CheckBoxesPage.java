package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxesPage {
    public String urlCheckBoxes = "https://the-internet.herokuapp.com/checkboxes";
    public String titleCheckBoxes = "Checkboxes";
    public SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'Checkboxes')]"));
    public SelenideElement checkboxElements = $(By.cssSelector("input[type='checkbox']"));
    public SelenideElement checkboxElement1 = $(By.xpath("//input[@type='checkbox'][last()-1]"));
    public SelenideElement checkboxElement2 = $(By.xpath("//input[@type='checkbox'][last()]"));
}

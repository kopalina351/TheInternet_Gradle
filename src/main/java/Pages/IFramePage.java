package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IFramePage {
    private SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'An iFrame containing')]"));
    private SelenideElement mainFrame = $(By.id("mce_0_ifr"));
    private SelenideElement undoDD = $(By.xpath("//button[@aria-label='Undo']"));
    private SelenideElement textField = $(By.id("tinymce"));

    public SelenideElement getPageTitle() {
        return pageTitle;
    }

    public SelenideElement getMainFrame() {
        return mainFrame;
    }

    public SelenideElement getUndoDD() {
        return undoDD;
    }

    public SelenideElement getTextField() {
        return textField;
    }
}

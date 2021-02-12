package Pages;

import Base.AbstractPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IFramePage extends AbstractPage {
    private SelenideElement pageTitleElement = $(By.xpath("//h3[contains(text(),'An iFrame containing')]"));
    private SelenideElement mainFrame = $(By.id("mce_0_ifr"));
    private SelenideElement undoDD = $(By.xpath("//button[@aria-label='Undo']"));
    private SelenideElement textField = $(By.id("tinymce"));

    private final String urlIFrame = "https://the-internet.herokuapp.com/iframe";
    private final String titlePage = "An iFrame containing the TinyMCE WYSIWYG Editor";

    public SelenideElement getPageTitleElement() {
        return pageTitleElement;
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

    @Override
    public String getUrl() {
        return urlIFrame;
    }

    @Override
    public String getTitlePage() {
        return titlePage;
    }
}

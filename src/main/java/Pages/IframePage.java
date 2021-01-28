package Pages;

import com.codeborne.selenide.SelenideElement;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@DefaultUrl("https://the-internet.herokuapp.com/iframe")
public class IframePage {
    public String urlIFrame = "https://the-internet.herokuapp.com/iframe";
    public String titleIFrame = "An iFrame containing the TinyMCE WYSIWYG Editor";
    public SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'An iFrame containing')]"));
    public SelenideElement mainFrame = $(By.id("mce_0_ifr"));
    public SelenideElement undoDD =$(By.xpath("//button[@aria-label='Undo']"));
    public SelenideElement textField = $(By.id("tinymce"));
}

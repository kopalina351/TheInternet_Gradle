import com.codeborne.selenide.SelenideElement;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

@DefaultUrl("https://the-internet.herokuapp.com/iframe")
public class IframePage {
    String urlIFrame = "https://the-internet.herokuapp.com/iframe";
    String titleIFrame = "An iFrame containing the TinyMCE WYSIWYG Editor";
    SelenideElement pageTitle = $(By.xpath("//h3[contains(text(),'An iFrame containing')]"));
    SelenideElement mainFrame = $(By.id("mce_0_ifr"));
    SelenideElement undoDD =$(By.xpath("//button[@aria-label='Undo']"));
    SelenideElement textField = $(By.id("tinymce"));



}

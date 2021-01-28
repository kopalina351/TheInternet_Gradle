package PagesSteps;

import Pages.IframePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class IFramePageSteps {
    IframePage iframePage = new IframePage();

    public void openIframePageAndSwitchToFrame(String urlName, SelenideElement nameFrame){
        open(urlName);
        assert (iframePage.pageTitle.getText()).equals(iframePage.titleIFrame);
        switchTo().frame(nameFrame);
    }
    public void enterTextToEditorAndCheckResult(String newText){
        String text = iframePage.textField.getText();
        iframePage.textField.clear();
        iframePage.textField.sendKeys(newText);
        assert (!text.equals(newText));
        assert (iframePage.textField).getText().equals(newText);
    }
    public void switchToParentFrameAndUndoAction(){
        switchTo().parentFrame();
        iframePage.undoDD.click();
        switchTo().frame(iframePage.mainFrame);
        String content = iframePage.textField.getText();
        assert (content.isEmpty());
    }


}

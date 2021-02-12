package PagesSteps;

import Pages.IFramePage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IFramePageSteps {
    IFramePage iFramePage = new IFramePage();

    public void openIFramePage() {
        open(iFramePage.getUrl());
    }

    public void checkIFramePageIsOpen() {
        assertThat(iFramePage.getPageTitleElement().getText(), is(iFramePage.getTitlePage()));
    }

    public void switchToFrame() {
        switchTo().frame(iFramePage.getMainFrame());
    }

    public void enterTextToEditorAndCheckResult(String newText) {
        iFramePage.getTextField().clear();
        iFramePage.getTextField().sendKeys(newText);

    }

    public void checkTextIsEntered(String newText) {
        assertThat(iFramePage.getTextField().getText(), is(newText));
    }

    public void switchToParentFrame() {
        switchTo().parentFrame();
    }

    public void clickOnUndoButton() {
        iFramePage.getUndoDD().click();
        switchTo().frame(iFramePage.getMainFrame());
        String content = iFramePage.getTextField().getText();
        assert (content.isEmpty());
    }

    public void switchToMainFrame() {
        switchTo().frame(iFramePage.getMainFrame());
        String content = iFramePage.getTextField().getText();
        assert (content.isEmpty());
    }

    public void checkUndoAction() {
        String content = iFramePage.getTextField().getText();
        assert (content.isEmpty());
    }

}

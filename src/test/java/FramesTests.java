import PagesSteps.IFramePageSteps;
import org.junit.Test;


public class FramesTests {
    private final String urlIFrame = "https://the-internet.herokuapp.com/iframe";
    private final String titlePage = "An iFrame containing the TinyMCE WYSIWYG Editor";
    private final String newText = "Testing iFrame";

    IFramePageSteps iFramePageSteps = new IFramePageSteps() {
        @Override
        public String getUrl() {
            return urlIFrame;
        }
    };

    @Test()
    public void workWithIFrame() {
        iFramePageSteps.openIFramePage();
        iFramePageSteps.checkIFramePageIsOpen(titlePage);
        iFramePageSteps.switchToFrame();
        iFramePageSteps.enterTextToEditorAndCheckResult(newText);
        iFramePageSteps.checkTextIsEntered(newText);
    }

    @Test
    public void workWithIFrameEditor() {
        iFramePageSteps.openIFramePage();
        iFramePageSteps.checkIFramePageIsOpen(titlePage);
        iFramePageSteps.switchToFrame();
        iFramePageSteps.enterTextToEditorAndCheckResult(newText);
        iFramePageSteps.checkTextIsEntered(newText);
        iFramePageSteps.switchToParentFrame();
        iFramePageSteps.clickOnUndoButton();
        iFramePageSteps.switchToMainFrame();
        iFramePageSteps.checkUndoAction();

    }
}
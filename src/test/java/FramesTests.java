import PagesSteps.IFramePageSteps;
import org.junit.Test;


public class FramesTests {

    private final String newText = "Testing iFrame";

    IFramePageSteps iFramePageSteps = new IFramePageSteps();

    @Test()
    public void workWithIFrame() {
        iFramePageSteps.openIFramePage();
        iFramePageSteps.checkIFramePageIsOpen();
        iFramePageSteps.switchToFrame();
        iFramePageSteps.enterTextToEditorAndCheckResult(newText);
        iFramePageSteps.checkTextIsEntered(newText);
    }

    @Test
    public void workWithIFrameEditor() {
        iFramePageSteps.openIFramePage();
        iFramePageSteps.checkIFramePageIsOpen();
        iFramePageSteps.switchToFrame();
        iFramePageSteps.enterTextToEditorAndCheckResult(newText);
        iFramePageSteps.checkTextIsEntered(newText);
        iFramePageSteps.switchToParentFrame();
        iFramePageSteps.clickOnUndoButton();
        iFramePageSteps.switchToMainFrame();
        iFramePageSteps.checkUndoAction();

    }
}
import Pages.IframePage;
import PagesSteps.IFramePageSteps;
import org.junit.Test;


public class FramesTests {
    IframePage iframePage = new IframePage();
    IFramePageSteps iFramePageSteps = new IFramePageSteps();
    String newText = "Testing iFrame";

    @Test
    public void workWithIFrame(){
        iFramePageSteps.openIframePageAndSwitchToFrame(iframePage.urlIFrame, iframePage.mainFrame);
        iFramePageSteps.enterTextToEditorAndCheckResult(newText);
    }

    @Test
    public void workWithIFrameEditor(){
        iFramePageSteps.openIframePageAndSwitchToFrame(iframePage.urlIFrame, iframePage.mainFrame);
        iFramePageSteps.enterTextToEditorAndCheckResult(newText);
        iFramePageSteps.switchToParentFrameAndUndoAction();
    }
}
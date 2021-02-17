import PagesSteps.IFramePageSteps;
import com.codeborne.selenide.Selenide;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class FramesTests {

    IFramePageSteps iFramePageSteps = new IFramePageSteps();

    @DataProvider
    public static Object[] dataProviderTest1() {
        return new Object[][]{
                {"Testing iFrame"},
                {"Hello!!!"}
        };
    }

    @Test()
    @UseDataProvider("dataProviderTest1")
    public void workWithIFrame(String newText) {
        iFramePageSteps.openIFramePage();
        iFramePageSteps.checkIFramePageIsOpen();
        iFramePageSteps.switchToFrame();
        iFramePageSteps.enterTextToEditorAndCheckResult(newText);
        iFramePageSteps.checkTextIsEntered(newText);
    }

    @DataProvider
    public static Object[] dataProviderTest2() {
        return new Object[][]{
                {"Spring is coming"},
                {"Xo-Xo-Xo"}
        };
    }

    @Test
    @UseDataProvider("dataProviderTest2")
    public void workWithIFrameEditor(String newText) {
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

    @After
    public void afterTest() {
        Selenide.closeWebDriver();
    }

}
import PagesSteps.CheckBoxesSteps;
import org.junit.Test;

public class CheckBoxesTests {
    CheckBoxesSteps checkBoxesSteps = new CheckBoxesSteps();

    @Test
    public void findAllCheckBoxesOnPage() {
        checkBoxesSteps.openCheckBoxesPage();
        checkBoxesSteps.checkCheckBoxesPageIsOpen();
        checkBoxesSteps.clickOnCheckBoxOnPage();
    }
}

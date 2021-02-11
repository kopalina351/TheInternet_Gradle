import PagesSteps.CheckBoxesSteps;
import org.junit.Test;

public class CheckBoxesTests {
    private final String urlCheckBoxes = "https://the-internet.herokuapp.com/checkboxes";
    private final String titleCheckBoxes = "Checkboxes";
    CheckBoxesSteps checkBoxesSteps = new CheckBoxesSteps() {
        @Override
        public String getUrl() {
            return urlCheckBoxes;
        }
    };

    @Test
    public void findAllCheckBoxesOnPage() {
        checkBoxesSteps.openCheckBoxesPage();
        checkBoxesSteps.checkCheckBoxesPageIsOpen(titleCheckBoxes);
        checkBoxesSteps.clickOnCheckBoxOnPage();
    }
}

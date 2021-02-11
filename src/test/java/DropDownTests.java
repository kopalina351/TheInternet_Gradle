import PagesSteps.DropDownPageSteps;
import org.junit.Test;

public class DropDownTests {
    private final String urlDropDown = "https://the-internet.herokuapp.com/dropdown";
    private final String titleDropDown = "Dropdown List";

    DropDownPageSteps dropDownPageSteps = new DropDownPageSteps() {
        @Override
        public String getUrl() {
            return urlDropDown;
        }
    };
    public String option = "Option 2";

    @Test
    public void workWithDropDownList() {
        dropDownPageSteps.openDropDownPage();
        dropDownPageSteps.clickOnDropDown();
        dropDownPageSteps.selectDropDownElement(option);
        dropDownPageSteps.checkSelectedDDElement(option);
    }
}

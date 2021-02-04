import PagesSteps.DropDownPageSteps;
import org.junit.Test;

public class DropDownTests {
    DropDownPageSteps dropDownPageSteps = new DropDownPageSteps();
    public String option = "Option 2";

    @Test
    public void workWithDropDownList() {
        dropDownPageSteps.openDropDownPage();
        dropDownPageSteps.clickOnDropDown();
        dropDownPageSteps.selectDropDownElement(option);
        dropDownPageSteps.checkSelectedDDElement(option);
    }
}

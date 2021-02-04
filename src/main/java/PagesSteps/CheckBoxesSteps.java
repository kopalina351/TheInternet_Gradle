package PagesSteps;

import Pages.CheckBoxesPage;

import static com.codeborne.selenide.Selenide.open;

public class CheckBoxesSteps {
    CheckBoxesPage checkBoxesPage = new CheckBoxesPage();

    public void openCheckBoxesPage(){
        open(checkBoxesPage.urlCheckBoxes);
        assert (checkBoxesPage.pageTitle.getText().equals(checkBoxesPage.titleCheckBoxes));
    }

    public void clickOnFirstCheckBoxOnPage() {
        checkBoxesPage.checkboxElement1.click();
    }
}

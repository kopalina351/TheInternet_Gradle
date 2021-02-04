package PagesSteps;

import Pages.DropDownPage;

import static com.codeborne.selenide.Selenide.open;

public class DropDownPageSteps {
    DropDownPage dropDownPage = new DropDownPage();

    public void openDropDownPage(){
        open(dropDownPage.urlDropDown);
        assert (dropDownPage.pageTitle.getText()).equals(dropDownPage.titleDropDown);
    }

    public void clickOnDropDown(){
        dropDownPage.dropDownList.click();
    }

    public void selectDropDownElement(String option){
        dropDownPage.ddElement.selectOptionContainingText(option);
        dropDownPage.ddElement.click();
    }

    public void checkSelectedDDElement(String option){
        assert (dropDownPage.ddElement.getText()).equals(option);
    }
}

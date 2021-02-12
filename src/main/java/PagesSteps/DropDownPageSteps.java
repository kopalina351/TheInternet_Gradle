package PagesSteps;

import Pages.DropDownPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DropDownPageSteps {
    DropDownPage dropDownPage = new DropDownPage();


    public void openDropDownPage(){
        open(dropDownPage.getUrl());
    }

    public void checkDropDownPageIsOpen() {
        assertThat (dropDownPage.getPageTitleElement().getText(), is(dropDownPage.getTitlePage()));
    }

    public void clickOnDropDown(){
        dropDownPage.getDropDownList().click();
    }

    public void selectDropDownElement(String option){
        dropDownPage.getDdElement().selectOptionContainingText(option);
        dropDownPage.getDdElement().click();
    }

    public void checkSelectedDDElement(String option){
        assertThat (dropDownPage.getDdElement().getText(), is(option));
    }
}

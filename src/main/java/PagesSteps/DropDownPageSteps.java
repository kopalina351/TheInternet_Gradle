package PagesSteps;

import Base.AbstractBaseClase;
import Pages.DropDownPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public abstract class DropDownPageSteps extends AbstractBaseClase {
    DropDownPage dropDownPage = new DropDownPage();
    public abstract String getUrl();

    public void openDropDownPage(){
        open(getUrl());
    }

    public void checkDropDownPageIsOpen(String titlePage) {
        assertThat (dropDownPage.getPageTitle().getText(), is(titlePage));
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

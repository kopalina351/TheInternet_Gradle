package PagesSteps;

import Base.AbstractBaseClase;
import Pages.CheckBoxesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public abstract class CheckBoxesSteps extends AbstractBaseClase {
    CheckBoxesPage checkBoxesPage = new CheckBoxesPage();
    public abstract String getUrl();

    public void openCheckBoxesPage(){
        open(getUrl());
    }

    public void checkCheckBoxesPageIsOpen(String titlePage) {
        assertThat(checkBoxesPage.getPageTitle().getText(), is(titlePage));
    }

    public void clickOnCheckBoxOnPage() {
        checkBoxesPage.getCheckboxElement1().click();
    }
}

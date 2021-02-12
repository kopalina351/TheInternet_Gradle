package PagesSteps;

import Pages.CheckBoxesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckBoxesSteps {
    CheckBoxesPage checkBoxesPage = new CheckBoxesPage();

    public void openCheckBoxesPage(){
        open(checkBoxesPage.getUrl());
    }

    public void checkCheckBoxesPageIsOpen() {
        assertThat(checkBoxesPage.getPageTitleElement().getText(), is(checkBoxesPage.getTitlePage()));
    }

    public void clickOnCheckBoxOnPage() {
        checkBoxesPage.getCheckboxElement1().click();
    }
}
